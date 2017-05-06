package br.app.monitoracao.servico.integracao;


import java.util.List;

import br.app.barramento.integracao.dto.IService;
import br.app.barramento.integracao.exception.InfraEstruturaException;
import br.app.barramento.integracao.exception.NegocioException;


public interface IServicoMonitoracao extends IService{

	List<MonitoracaoDTO> buscarTransacoes(FiltroMonitoracaoDTO filtro) throws InfraEstruturaException,NegocioException;
}
