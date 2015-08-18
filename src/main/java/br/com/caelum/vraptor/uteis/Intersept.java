package br.com.caelum.vraptor.uteis;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;


@Intercepts
public class Intersept {

	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
    private HttpServletRequest request;
	
    @AroundCall
    public void intercept(SimpleInterceptorStack stack) {
        System.out.println("Interceptando " + request.getRequestURI());
        // código a ser executado antes da lógica

        stack.next(); // continua a execução

    }
    
    
}
