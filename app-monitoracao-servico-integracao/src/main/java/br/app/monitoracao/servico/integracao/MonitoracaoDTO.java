package br.app.monitoracao.servico.integracao;

import java.util.Date;

import br.app.barramento.integracao.dto.DTO;


public class MonitoracaoDTO implements DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String ipUsuario;
	private String ipAplicativoCliente;
	private String ipServidor;
	private String nomeTransacao;
	private String nomeServico;
	private Date datahoraInicioExecucao;
	private Date datahoraFimExecucao;
	private boolean executadoEmSessao;
	private boolean sucesso;
	private EstadoMonitoracaoDTO estadoMonitoracao;

	@Override
	public Long getId() {
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

	public EstadoMonitoracaoDTO getEstadoMonitoracao() {
		return estadoMonitoracao;
	}

	public void setEstadoMonitoracao(EstadoMonitoracaoDTO estadoMonitoracao) {
		this.estadoMonitoracao = estadoMonitoracao;
	}

}
