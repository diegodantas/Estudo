package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.model.Usuario;

@Controller
public class IndexController {

	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	private Result result;

	@Path("/")
	public void index() {
		
		result.include("variable", "VRaptor!");
		
	}
	
	
	@Post("/Login")
	public void login(Usuario usuario){
		System.out.println(usuario.getNome());
		System.out.println(usuario.getSenha());
		result.redirectTo(TesteController.class).lista();
	}
	
}