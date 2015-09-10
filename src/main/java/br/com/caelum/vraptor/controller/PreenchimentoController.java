package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.DAO.PreenchimentoDAO;

@Controller
public class PreenchimentoController {
	
	@Inject
	private PreenchimentoDAO preenchimento;
	
	@Inject
	private Result result;
	
	/*Lista todos os registros e envia para a jsp lista.jsp*/
	@Path("/preenchimento/listar")
	public void lista() {
		result.include("preenchimento", preenchimento.listarTodosPreenchimento());
		result.include("meses", preenchimento.listarTodosPreenchimento());
	}
}
