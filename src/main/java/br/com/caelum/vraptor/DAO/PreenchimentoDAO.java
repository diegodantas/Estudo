package br.com.caelum.vraptor.DAO;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import br.com.caelum.vraptor.model.Preenchimento;

public class PreenchimentoDAO {
	
	@Inject
	private EntityManager entityManager;
	
	private Session session;

	private Criteria criteria;
	
	private	Preenchimento preenchimento;
	
	@SuppressWarnings("unchecked")
	public List<Preenchimento> listarTodosPreenchimento() {
		session = entityManager.unwrap(Session.class);

		criteria = this.session.createCriteria(Preenchimento.class);
		return criteria.addOrder(Order.asc("id")).list(); //.add(Restrictions.isNotNull())
	}
	
	public Preenchimento listarPreenchimento(Integer id) {
		return setPreenchimento(entityManager.find(Preenchimento.class, id));
	}

	public void atualizaPreenchimento(Preenchimento preenchido) {
		entityManager.merge(preenchido);		
	}

	/**
	 * @return the preenchimento
	 */
	public Preenchimento getPreenchimento() {
		return preenchimento;
	}

	/**
	 * @param preenchimento the preenchimento to set
	 */
	public Preenchimento setPreenchimento(Preenchimento preenchimento) {
		this.preenchimento = preenchimento;
		return preenchimento;
	}
	
	
}
