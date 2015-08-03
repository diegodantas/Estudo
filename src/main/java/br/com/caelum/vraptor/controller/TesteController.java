package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.DAO.EstudoDAO;


@Controller
public class TesteController {
	
	@Inject
	private EstudoDAO dao;
	
	@Inject
	private Result result;
	
	@Path("/Teste")
	public void lista() {
		
        result.include("estudo", dao.listaTodos());
        
    }

}
