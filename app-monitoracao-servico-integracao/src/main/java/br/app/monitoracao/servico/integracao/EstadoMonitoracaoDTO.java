package br.app.monitoracao.servico.integracao;

import java.util.EnumSet;
import java.util.Set;

public enum EstadoMonitoracaoDTO {

	SUCESSO(1, "Sucesso"), NEGOCIAL(2, "Erro Negocial"), INFRAESTRUTURA(3, "Erro InfraEstrutura"), INDEFINIDO(-1,
			"Indefinido");

	private int value;
	private String texto;

	private EstadoMonitoracaoDTO(int valor, String texto) {

		this.value = valor;
		this.texto = texto;

	}

	public int getValue() {

		return value;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static EstadoMonitoracaoDTO get(int value) {

		Set<EstadoMonitoracaoDTO> tipos = EnumSet.allOf(EstadoMonitoracaoDTO.class);
		for (EstadoMonitoracaoDTO tipoParametroDTO : tipos) {
			if (tipoParametroDTO.value == value) {
				return tipoParametroDTO;
			}
		}
		return INDEFINIDO;
	}

}
