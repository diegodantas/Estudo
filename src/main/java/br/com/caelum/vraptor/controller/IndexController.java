package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.DAO.UsuarioDAO;
import br.com.caelum.vraptor.annotations.Public;
import br.com.caelum.vraptor.model.Usuario;
import br.com.caelum.vraptor.uteis.UsuarioWeb;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class IndexController {

	@Inject
	private Result result;
	@Inject
	private UsuarioWeb usuarioWeb;
	@Inject
	private UsuarioDAO usuarioDao;
	@Inject
	private Validator validator;

	/*
	 * A annotation "Public" faz com que o metodo anotado com ela seja acessado
	 * sem efetuar o login
	 */

	/*
	 * Metodo que renderiza a tela de login caso não tenha usuario logado no
	 * momento
	 */

	@Public
	@Path("/")
	public void index() {

		/* result.include("variable", "VRaptor!"); */
		if (usuarioWeb.isLogado()) {
			result.redirectTo(UsuarioController.class).lista();
		}

	}

	/*
	 * Faz as verificações para efetuar o login do usuario
	 */

	@Public
	@Post("/login")
	public void login(Usuario usuario) {
		try {
			Usuario carregado = usuarioDao.carrega(usuario);

			if (carregado == null) {
				validator.add(new SimpleMessage(usuario.getUsuario(),
						"Login e/ou senha inválidos"));
			}

			validator.onErrorUsePageOf(IndexController.class).index();

			usuarioWeb.login(carregado);
			result.include("usuarios", usuarioWeb.getNome());
			result.redirectTo(UsuarioController.class).lista();

		} catch (Exception e) {
			result.redirectTo(IndexController.class).index();
			// TODO: handle exception
		}

	}

	/*
	 * Realiza p logout do usuario
	 */

	@Path("/logout")
	public void logout() {
		usuarioWeb.logout();
		result.redirectTo(this).index();
	}

}