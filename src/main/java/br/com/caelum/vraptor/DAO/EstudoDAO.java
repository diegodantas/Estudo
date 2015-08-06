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
	
	/*Exemplo basico de persistencia no BD*/
	public void Persiste(Estudo estudo) {
		
		entityManager.persist(estudo);
		
	}
	
	/*Listar todos usando criteria*/
	@SuppressWarnings("unchecked")
	public List<Estudo> listaTodos() {

		session = entityManager.unwrap(Session.class);
		
		criteria = this.session.createCriteria(Estudo.class);
		
		return criteria.addOrder(Order.asc("Id")).list();
	}
	
	public void delete(Estudo estudo){
		
		entityManager.remove(estudo);
	}

}
