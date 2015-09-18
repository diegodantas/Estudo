package br.com.caelum.vraptor.uteis;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.caelum.vraptor.model.Usuario;

@SessionScoped
@Named("usuarioweb")
public class UsuarioWeb implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -176196399111539118L;
	
	private Usuario logado;

	public void login(Usuario usuario) {
		this.logado = usuario;
	}

	public String getNome() {
		return logado.getNome();
	}

	public boolean isLogado() {
		return logado != null;
	}
	public void logout(){
		this.logado = null;
	}
}
