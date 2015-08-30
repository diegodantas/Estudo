package br.com.caelum.vraptor.DAO;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.model.Usuario;

public class UsuarioDAO {

	@Inject
	private EntityManager entityManager;

	private Session session;

	private Criteria criteria;

	private Usuario usuario;
	
	/*
	 * Persist o usuario no banco
	 */

	public void cadastrarUsuario(Usuario usuario) {
		entityManager.persist(usuario);
	}
	
	/*
	 * Deleta o usuario do banco
	 */

	public void deletarUsuario(Integer id) {
		usuario = entityManager.find(Usuario.class, id);
		entityManager.remove(usuario);
	}
	
	/*
	 * Atualiza o usuairo no banco
	 */

	public void atualizarUsuario(Usuario usuario) {
		entityManager.merge(usuario);
	}
	
	/*
	 *Retorna um usuario levando em relação o Id passado
	 */

	public Usuario listarUsuario(Integer id) {
		return usuario = entityManager.find(Usuario.class, id);
	}
	
	/*
	 * Retorna um alista completa dos usuarios
	 */

	@SuppressWarnings("unchecked")
	public List<Usuario> listarTodosUsuarios() {
		session = entityManager.unwrap(Session.class);

		criteria = this.session.createCriteria(Usuario.class);
		return criteria.addOrder(Order.asc("Id")).list();
	}
	
	/*
	 * Verificado se o usuario existe
	 */

	public boolean existeUsuario(Usuario usuario) {
		session = entityManager.unwrap(Session.class);

		Usuario encontrado = (Usuario) session.createCriteria(Usuario.class)
				.add(Restrictions.eq("nome", usuario.getNome())).uniqueResult();
		return encontrado != null;
	}

	/*
	 * Carrega o usuario procurando pelo nome e senha
	 */
	
	public Usuario carrega(Usuario usuario) {
		session = entityManager.unwrap(Session.class);

		return (Usuario) session.createCriteria(Usuario.class)
				.add(Restrictions.eq("nome", usuario.getNome()))
				.add(Restrictions.eq("senha", usuario.getSenha()))
				.uniqueResult();
	}
}
