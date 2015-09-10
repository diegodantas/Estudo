package br.com.caelum.vraptor.DAO;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import br.com.caelum.vraptor.model.Preenchimento;
import br.com.caelum.vraptor.model.Usuario;

public class PreenchimentoDAO {
	
	@Inject
	private EntityManager entityManager;
	
	private Session session;

	private Criteria criteria;
	
	private Preenchimento preenchimento;
	
	@SuppressWarnings("unchecked")
	public List<Usuario> listarTodosPreenchimento() {
		session = entityManager.unwrap(Session.class);

		criteria = this.session.createCriteria(Preenchimento.class);
		return criteria.addOrder(Order.asc("id")).list();
	}
	
	
}
