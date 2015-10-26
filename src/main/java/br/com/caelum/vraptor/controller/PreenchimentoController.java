package br.com.caelum.vraptor.controller;

import static br.com.caelum.vraptor.view.Results.json;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.DAO.PreenchimentoDAO;
import br.com.caelum.vraptor.model.Char;
import br.com.caelum.vraptor.model.Preenchimento;

@Controller
public class PreenchimentoController {

	@Inject
	private PreenchimentoDAO dao;

	@Inject
	private Result result;

	/* Lista todos os registros e envia para a jsp lista.jsp */

	/* @Consumes("/preenchimento/listar") */
	@Path("/preenchimento/listar")
	public void lista() {

	}

	@Path("/preenchimento/json")
	public void jsonn() {

		List<Preenchimento> preenchimento = dao.listarTodosPreenchimento();
		List<Char> dados = new ArrayList<>();
 		
		for (Preenchimento p : preenchimento) {
			dados.add(new Char(p.getUsuario().getNome(), new Double[] {
					p.getJan(), p.getFev(), p.getMar(), p.getAbr(), p.getMai(),
					p.getJun(), p.getJul(), p.getAgo(), p.getSet(), p.getOut(),
					p.getNov(), p.getDez()}));
		}

		result.use(json()).withoutRoot().from(dados).recursive().serialize();

	}
	
	@Path("/preenchimento/cadastrar")
	public void cadatrar(){
		
	}
	
	/* Realiza o cadastro */
	@Post("/preenchimento/cadastro")
	public void cadastro(Preenchimento preenchimento) {
		try {
			dao.atualizaPreenchimento(preenchimento);
			result.include("mensagem", "Operação efetuada com sucesso");
			result.redirectTo(PreenchimentoController.class).lista();
		} catch (Exception e) {
			result.redirectTo(PreenchimentoController.class).lista();
			// TODO: handle exception
		}

	}

}
