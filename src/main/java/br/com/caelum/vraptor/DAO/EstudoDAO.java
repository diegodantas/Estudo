package br.com.caelum.vraptor.DAO;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import br.com.caelum.vraptor.model.Estudo;

public class EstudoDAO {

	@Inject
	private EntityManager entityManager;

	private Session session;

	private Criteria criteria;

	public void Persiste() {

		Estudo es = new Estudo();

		es.setFinalizado(true);
		es.setNome("Teste");

		entityManager.persist(es);
	}

	@SuppressWarnings("unchecked")
	public List<Estudo> listaTodos() {

		session = entityManager.unwrap(Session.class);

		criteria = this.session.createCriteria(Estudo.class);

		return criteria.addOrder(Order.asc("Id")).list();
	}

}
