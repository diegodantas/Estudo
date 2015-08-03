package br.com.caelum.vraptor.controller;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.model.Estudo;

@Controller
public class IndexController {

	@Inject
	private Result result;
	
	@Inject
	private EntityManager entityManager;

	@Path("/")
	public void index() {
		result.include("variable", "VRaptor!");
		
		Estudo es = new Estudo();
		
		es.setFinalizado(true);
		es.setNome("Teste");
		
		entityManager.persist(es);
	}
	
}