package br.com.caelum.vraptor.controller;

import java.util.List;

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

	@Inject
	private Result result;

	@Path("/Teste")
	public void lista() {

		dao.Persiste();
		List<Estudo> teste = dao.listaTodos();
		
		System.out.println(teste.get(0).getId());
        result.include("estudo", dao.listaTodos());

    }

}
