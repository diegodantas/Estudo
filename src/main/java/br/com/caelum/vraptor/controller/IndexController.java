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

	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	private Result result;
	@Inject
	private UsuarioWeb usuarioWeb;
	@Inject
	private UsuarioDAO usuarioDao;
	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	private Validator validator;

	/*
	 * public IndexController(UsuarioDAO dao, Result result, Validator
	 * validator, UsuarioWeb usuarioWeb) { this.result = result; this.validator
	 * = validator; this.usuarioDao = dao; this.usuarioWeb = usuarioWeb; }
	 */
	
	@Public
	@Path("/")
	public void index() {

		result.include("variable", "VRaptor!");

	}

	@Public
	@Post("/Login")
	public void login(Usuario usuario) {

		Usuario carregado = usuarioDao.carrega(usuario);

		if (carregado == null) {
			validator.add(new SimpleMessage(usuario.getNome(),
					"Login e/ou senha inválidos"));
		}

		validator.onErrorUsePageOf(IndexController.class).index();

		usuarioWeb.login(carregado);

		result.redirectTo(TesteController.class).lista();
	}

}