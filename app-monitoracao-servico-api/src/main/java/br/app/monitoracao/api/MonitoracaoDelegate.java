package br.app.monitoracao.api;


import br.app.barramento.integracao.dto.EnvioDTO;
import br.app.barramento.integracao.dto.IService;
import br.app.barramento.integracao.dto.LocalizadorServico;
import br.app.barramento.integracao.dto.Mensagem;
import br.app.barramento.integracao.dto.RespostaDTO;
import br.app.barramento.integracao.dto.TipoAcao;
import br.app.barramento.integracao.exception.InfraEstruturaException;
import br.app.barramento.integracao.exception.NegocioException;
import br.app.monitoracao.servico.integracao.IServicoMonitoracao;
import br.app.monitoracao.servico.integracao.MonitoracaoDTO;
import br.app.smart.api.infra.AbstractDelegate;
import br.app.smart.api.infra.TipoLocalizador;

public class MonitoracaoDelegate extends AbstractDelegate<IServicoMonitoracao> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MonitoracaoDelegate() {
	}

	public MonitoracaoDelegate(LocalizadorServico<IServicoMonitoracao> localizaServico) {
		super(localizaServico);
	}

	public static MonitoracaoDelegate getIntancia() {

		MonitoracaoDelegate delegate = new MonitoracaoDelegate();

		return delegate;
	}

	@Override
	public LocalizadorServico<IServicoMonitoracao> getLocalizadorServico(TipoAcao acao) {

		if (TipoAcao.isAcaoDAO(acao)) {
			LocalizadorServico<IServicoMonitoracao> localizaServico = new LocalizarServicoMonitoracao<IServicoMonitoracao>(
					TipoLocalizador.REMOTO.getValue(), LocalizarServicoMonitoracao.REGISTRO_NOME_LOCAL_DAO,
					LocalizarServicoMonitoracao.REGISTRO_NOME_REMOTO_DAO);
			return localizaServico;
		}

		LocalizadorServico<IServicoMonitoracao> localizaServico = new LocalizarServicoMonitoracao<IServicoMonitoracao>(
				TipoLocalizador.REMOTO);
		return localizaServico;

	}

	@Override
	public void executarServico(TipoAcao acao, EnvioDTO envio, RespostaDTO resposta, IServicoMonitoracao servico)
			throws NegocioException, InfraEstruturaException {
		
		if(acao.equals(TipoAcao.REGISTRAR_MONITORACAO)){
			
			servico.registrarMonitoracao((MonitoracaoDTO) envio.getRequisicao());
			
		}
		resposta.setMensagem(Mensagem.ERRO);
		resposta.getMensagem().setErro("Funcionalidade nao implementada:" + acao.getValue());
	}
}
