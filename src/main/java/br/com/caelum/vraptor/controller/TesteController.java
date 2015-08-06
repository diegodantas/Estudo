package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.DAO.EstudoDAO;
import br.com.caelum.vraptor.model.Estudo;

@Controller
public class TesteController {

	@Inject
	private EstudoDAO dao;

	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	private Result result;

	@Path("/Teste/Listar")
	public void lista() {

		// dao.Persiste();
		result.include("estudo", dao.listaTodos());

	}
	
	@Path("/Teste/Cadastro")
	public void cadastro(Estudo estudo) {
		dao.Persiste(estudo);
		result.include("mensagem", "Cliente adicionado com sucesso");
		result.redirectTo(TesteController.class).lista();
	}
	
	@Path("/Teste/Cadastrar")
	public void cadastro(){
		
	}
	
	@Path("/Teste/Delete")
	public void deletar(Estudo estudo){
		dao.delete(estudo);
		System.out.println("Aqui");
		result.redirectTo(TesteController.class).lista();
	}

}
