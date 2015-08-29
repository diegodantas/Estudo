package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.DAO.EstudoDAO;
import br.com.caelum.vraptor.model.Estudo;
import br.com.caelum.vraptor.uteis.UsuarioWeb;

@Controller
public class TesteController {

	@Inject
	private EstudoDAO dao;

	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	private Result result;
	
	@Inject
	private UsuarioWeb usuarioWeb;
	
	
	/*Lista todos os registros e envia para a jsp lista.jsp*/
	@Path("/Teste/Listar")
	public void lista() {

		result.include("estudo", dao.listaTodos());

	}

	@Path("/Teste/Cadastro")
	public void cadastro(Estudo estudo) {
		dao.Persiste(estudo);
		result.include("mensagem", "Cliente adicionado com sucesso");
		result.redirectTo(TesteController.class).lista();
	}

	@Path("/Teste/Cadastrar")
	public void cadastro() {
			usuarioWeb.logout();
	}
	
	/*Deleta o registro referente ao ID */
	@Path("/Teste/Delete/{id}")
	public void deletar(Integer id) {
		dao.delete(id);
		result.include("mensagem", "Cliente deletado com sucesso");
		result.redirectTo(TesteController.class).lista();
	}
	
	@Path("/Teste/Atualiza/{id}{nome}{finalizado}")
	public void update(Integer id, String nome, Boolean finalizado){
		Estudo estudo = new Estudo();
		
		estudo.setId(id);
		estudo.setNome(nome);
		estudo.setFinalizado(finalizado);
		
		dao.update(estudo);
	}

}
