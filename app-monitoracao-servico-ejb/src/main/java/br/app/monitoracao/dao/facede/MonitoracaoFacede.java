package br.app.monitoracao.dao.facede;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.app.barramento.infra.persistencia.dao.AbstractFacade;
import br.app.monitoracao.dao.model.Monitoracao;


@Stateless
public class MonitoracaoFacede extends AbstractFacade<Monitoracao> {

	public MonitoracaoFacede() {
		super(Monitoracao.class);
	}

	public MonitoracaoFacede(Class<Monitoracao> entityClass) {
		super(entityClass);
	}
	

	@PersistenceContext(unitName = "app-contexto-monitoracao")
	private EntityManager em;

	protected EntityManager getEntityManager() {
		return em;
	}


	public List<Monitoracao> buscarTodos() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Monitoracao> criteria = cb.createQuery(Monitoracao.class);
		Root<Monitoracao> root = criteria.from(Monitoracao.class);
		CriteriaQuery<Monitoracao> todos = criteria.select(root);
		TypedQuery<Monitoracao> allQuery = em.createQuery(todos);
		
		List<Monitoracao> resultado = allQuery.getResultList();
		
		System.out.println("Quantidade todos? " + resultado.size());
		return resultado;
	}

}
	