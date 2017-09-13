package br.app.monitoracao.servico.integracao;


import java.util.List;

import br.app.barramento.integracao.dao.interfaces.IServicoDAO;
import br.app.barramento.integracao.exception.InfraEstruturaException;
import br.app.barramento.integracao.exception.NegocioException;


public interface IServicoMonitoracao extends IServicoDAO<MonitoracaoDTO>{

	List<MonitoracaoDTO> buscarTransacoes(FiltroMonitoracaoDTO filtro) throws InfraEstruturaException,NegocioException;
	
	public void registrarMonitoracao(MonitoracaoDTO dto);
}
