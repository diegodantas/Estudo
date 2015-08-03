package br.com.caelum.vraptor.DAO;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.com.caelum.vraptor.model.Estudo;

public class EstudoDAO {
	
	@Inject
	private EntityManager entityManager;
	
	private Session session;
	
	private Criteria criteria;
	
	@SuppressWarnings("unchecked")
	public List<Estudo> listaTodos(){
		
		session = entityManager.unwrap(Session.class);
		
		criteria = this.session.createCriteria(Estudo.class);
		
		return criteria.list();
	}

}
