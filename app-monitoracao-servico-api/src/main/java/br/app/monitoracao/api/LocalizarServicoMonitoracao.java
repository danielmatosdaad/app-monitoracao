package br.app.monitoracao.api;

import br.app.smart.api.infra.AbstractLocalizadorServico;
import br.app.smart.api.infra.TipoLocalizador;

public class LocalizarServicoMonitoracao<IService> extends AbstractLocalizadorServico<IService> {

	private static final String LOCALIZACAO_SERVICO = "localizacao_servico.properties";
	private static final String REGISTRO_NOME_LOCAL = "remoto.monitoracao";
	private static final String REGISTRO_NOME_REMOTO = "local.monitoracao";
	public static final String REGISTRO_NOME_LOCAL_DAO = "local.monitoracao.dao";
	public static final String REGISTRO_NOME_REMOTO_DAO = "remoto.monitoracao.dao";

	public LocalizarServicoMonitoracao(String tipoLocalizacao, String registroNomeLocalDao,
			String registroNomeRemotoDao) {
		super(TipoLocalizador.getLocalizador(tipoLocalizacao), registroNomeLocalDao, registroNomeRemotoDao,
				LOCALIZACAO_SERVICO);
	}
	
	public LocalizarServicoMonitoracao(TipoLocalizador tipoLocalizacao) {
		super(tipoLocalizacao, REGISTRO_NOME_REMOTO, REGISTRO_NOME_LOCAL, LOCALIZACAO_SERVICO);
	}

	public LocalizarServicoMonitoracao() {
		super(TipoLocalizador.LOCAL, REGISTRO_NOME_REMOTO, REGISTRO_NOME_LOCAL, LOCALIZACAO_SERVICO);
	}

}
