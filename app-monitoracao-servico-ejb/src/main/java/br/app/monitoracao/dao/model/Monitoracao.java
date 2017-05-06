package br.app.monitoracao.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import br.app.barramento.integracao.dao.interfaces.Entidade;

@Entity
@XmlRootElement
@Table(name = "monitoracao")
public class Monitoracao implements Entidade, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ipUsuario;
	private String ipAplicativoCliente;
	private String ipServidor;
	private String nomeTransacao;
	private String nomeServico;
	
	@Temporal(TemporalType.DATE)
	private Date datahoraInicioExecucao;
	
	@Temporal(TemporalType.DATE)
	private Date datahoraFimExecucao;
	
	private boolean executadoEmSessao;
	private boolean sucesso;
	
	@Enumerated(EnumType.STRING)
	private EstadoMonitoracao estadoMonitoracao;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getIpUsuario() {
		return ipUsuario;
	}

	public void setIpUsuario(String ipUsuario) {
		this.ipUsuario = ipUsuario;
	}

	public String getIpAplicativoCliente() {
		return ipAplicativoCliente;
	}

	public void setIpAplicativoCliente(String ipAplicativoCliente) {
		this.ipAplicativoCliente = ipAplicativoCliente;
	}

	public String getIpServidor() {
		return ipServidor;
	}

	public void setIpServidor(String ipServidor) {
		this.ipServidor = ipServidor;
	}

	public String getNomeTransacao() {
		return nomeTransacao;
	}

	public void setNomeTransacao(String nomeTransacao) {
		this.nomeTransacao = nomeTransacao;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public Date getDatahoraInicioExecucao() {
		return datahoraInicioExecucao;
	}

	public void setDatahoraInicioExecucao(Date datahoraInicioExecucao) {
		this.datahoraInicioExecucao = datahoraInicioExecucao;
	}

	public Date getDatahoraFimExecucao() {
		return datahoraFimExecucao;
	}

	public void setDatahoraFimExecucao(Date datahoraFimExecucao) {
		this.datahoraFimExecucao = datahoraFimExecucao;
	}

	public boolean isExecutadoEmSessao() {
		return executadoEmSessao;
	}

	public void setExecutadoEmSessao(boolean executadoEmSessao) {
		this.executadoEmSessao = executadoEmSessao;
	}

	public boolean isSucesso() {
		return sucesso;
	}

	public void setSucesso(boolean sucesso) {
		this.sucesso = sucesso;
	}

	public EstadoMonitoracao getEstadoMonitoracao() {
		return estadoMonitoracao;
	}

	public void setEstadoMonitoracao(EstadoMonitoracao estadoMonitoracao) {
		this.estadoMonitoracao = estadoMonitoracao;
	}

	

}
