package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.DAO.EstudoDAO;
import br.com.caelum.vraptor.model.Estudo;

@Controller
public class TesteController {

	@Inject
	private EstudoDAO dao;

	@Inject
	private Result result;
	
	
	/*Lista todos os registros e envia para a jsp lista.jsp*/
	@Path("/Teste/Listar")
	public void lista() {

		result.include("estudo", dao.listaTodos());

	}

	/*Realiza o cadastro*/
	@Post("/Teste/Cadastro")
	public void cadastro(Estudo estudo) {
		dao.Persiste(estudo);
		result.include("mensagem", "Cliente adicionado com sucesso");
		result.redirectTo(TesteController.class).lista();
	}
	
	/*Renderiza a tela de cadastro*/
	@Path("/Teste/Cadastrar")
	public void cadastro() {
			
	}
	
	/*Deleta o registro referente ao ID */
	@Path("/Teste/Delete/{id}")
	public void deletar(Integer id) {
		dao.delete(id);
		result.include("mensagem", "Cliente deletado com sucesso");
		result.redirectTo(TesteController.class).lista();
	}
	
	/*Update*/
	@Path("/Teste/Atualiza/{id}{nome}{finalizado}")
	public void update(Integer id, String nome, Boolean finalizado){
		Estudo estudo = new Estudo();
		
		estudo.setId(id);
		estudo.setNome(nome);
		estudo.setFinalizado(finalizado);
		
		dao.update(estudo);
	}

}
