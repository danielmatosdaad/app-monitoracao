package br.app.monitoracao.dao.model;

import java.util.EnumSet;
import java.util.Set;

public enum EstadoMonitoracao {

	SUCESSO(1, "Sucesso"), 
	NEGOCIAL(2, "Erro Negocial"), 
	INFRAESTRUTURA(3,"Erro InfraEstrutura"),
	INDEFINIDO(-1,"Indefinido");

	private int value;
	private String texto;

	private EstadoMonitoracao(int valor, String texto) {

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

	public static EstadoMonitoracao get(int value) {

		Set<EstadoMonitoracao> tipos = EnumSet.allOf(EstadoMonitoracao.class);
		for (EstadoMonitoracao tipoParametroDTO : tipos) {
			if (tipoParametroDTO.value == value) {
				return tipoParametroDTO;
			}
		}
		return INDEFINIDO;
	}
	
}
