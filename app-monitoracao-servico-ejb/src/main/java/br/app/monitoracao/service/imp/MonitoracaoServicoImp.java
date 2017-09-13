package br.app.monitoracao.service.imp;

import java.util.List;

import javax.ejb.Asynchronous;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.app.barramento.infra.persistencia.service.ServiceDAO;
import br.app.barramento.integracao.dao.interfaces.IServicoLocalDAO;
import br.app.barramento.integracao.dao.interfaces.IServicoRemoteDAO;
import br.app.barramento.integracao.exception.InfraEstruturaException;
import br.app.barramento.integracao.exception.NegocioException;
import br.app.monitoracao.dao.facede.MonitoracaoFacede;
import br.app.monitoracao.dao.model.Monitoracao;
import br.app.monitoracao.servico.integracao.FiltroMonitoracaoDTO;
import br.app.monitoracao.servico.integracao.IServicoMonitoracaoLocal;
import br.app.monitoracao.servico.integracao.IServicoMonitoracaoRemote;
import br.app.monitoracao.servico.integracao.MonitoracaoDTO;

@Stateless
@Remote(value = { IServicoMonitoracaoRemote.class, IServicoRemoteDAO.class })
@Local(value = { IServicoMonitoracaoLocal.class, IServicoLocalDAO.class })
public class MonitoracaoServicoImp implements IServicoMonitoracaoRemote, IServicoMonitoracaoLocal,
		IServicoRemoteDAO<MonitoracaoDTO>, IServicoLocalDAO<MonitoracaoDTO> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private MonitoracaoFacede monitoracaoFacade;

	@Override
	public MonitoracaoDTO adiconar(MonitoracaoDTO dto) throws InfraEstruturaException, NegocioException {
		try {

			ServiceDAO.adiconar(this.monitoracaoFacade, Monitoracao.class, dto);

			return dto;

		} catch (Exception e) {
			e.printStackTrace();
			throw new InfraEstruturaException(e);

		}
	}

	@Override
	public List<MonitoracaoDTO> adiconar(List<MonitoracaoDTO> listaDto)
			throws InfraEstruturaException, NegocioException {
		try {

			for (MonitoracaoDTO dto : listaDto) {

				adiconar(dto);
			}

			return listaDto;

		} catch (Exception e) {
			throw new InfraEstruturaException(e);

		}
	}

	@Override
	public MonitoracaoDTO alterar(MonitoracaoDTO dto) throws InfraEstruturaException, NegocioException {
		try {

			ServiceDAO.alterar(this.monitoracaoFacade, Monitoracao.class, dto);
			return dto;

		} catch (Exception e) {
			throw new InfraEstruturaException(e);
		}
	}

	@Override
	public void remover(MonitoracaoDTO dto) throws InfraEstruturaException, NegocioException {
		try {
			ServiceDAO.remover(this.monitoracaoFacade, Monitoracao.class, dto);

		} catch (Exception e) {
			throw new InfraEstruturaException(e);
		}

	}

	@Override
	public void removerPorId(Long id) throws InfraEstruturaException, NegocioException {
	}

	@Override
	public List<MonitoracaoDTO> bustarTodos() throws InfraEstruturaException, NegocioException {
		try {

			return (List<MonitoracaoDTO>) ServiceDAO.bustarTodos(this.monitoracaoFacade, MonitoracaoDTO.class);
		} catch (Exception e) {
			throw new InfraEstruturaException(e);
		}
	}

	@Override
	public MonitoracaoDTO bustarPorID(Long id) throws InfraEstruturaException, NegocioException {
		try {

			return ServiceDAO.bustarPorID(this.monitoracaoFacade, MonitoracaoDTO.class, id);
		} catch (Exception e) {
			throw new InfraEstruturaException(e);
		}
	}

	@Override
	public List<MonitoracaoDTO> bustarPorIntervaloID(int[] range) throws InfraEstruturaException, NegocioException {
		try {

			return ServiceDAO.bustarPorIntervaloID(this.monitoracaoFacade, MonitoracaoDTO.class, range);
		} catch (Exception e) {
			throw new InfraEstruturaException(e);
		}
	}

	@Override
	public List<MonitoracaoDTO> buscarTransacoes(FiltroMonitoracaoDTO filtro)
			throws InfraEstruturaException, NegocioException {
		return null;
	}

	@Asynchronous
	@Override
	public void registrarMonitoracao(MonitoracaoDTO dto) {
		// TODO Auto-generated method stub
		
	}

}
