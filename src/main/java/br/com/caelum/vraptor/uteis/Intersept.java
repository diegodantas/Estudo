package br.com.caelum.vraptor.uteis;

import javax.inject.Inject;

import br.com.caelum.vraptor.Accepts;
import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.annotations.Public;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.controller.IndexController;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;


@Intercepts
public class Intersept {

	@Inject
	private ControllerMethod controllerMethod;
	
	@Inject
	private UsuarioWeb usuarioWeb;
	
	@Inject
	private Result result;
	
	@Accepts
	public boolean accepts(){
		return !controllerMethod.containsAnnotation(Public.class);
	}
	
    @AroundCall
    public void intercept(SimpleInterceptorStack stack) {
        
    	if(!usuarioWeb.isLogado()){
    		result.redirectTo(IndexController.class).index();
    		return;
    	}
    	
        stack.next(); // continua a execução

    }
    
    
}
