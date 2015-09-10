package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.DAO.UsuarioDAO;
import br.com.caelum.vraptor.model.Usuario;

@Controller
public class UsuarioController {

	@Inject
	private UsuarioDAO dao;

	@Inject
	private Result result;

	/* Lista todos os registros e envia para a jsp lista.jsp */
	@Path("/usuario/listar")
	public void lista() {
		result.include("usuario", dao.listarTodosUsuarios());
	}

	/* Realiza o cadastro */
	@Post("/usuario/cadastro")
	public void cadastro(Usuario usuario) {
		try {
			dao.cadastrarUsuario(usuario);
			result.include("mensagem", "Operação efetuada com sucesso");
			result.redirectTo(UsuarioController.class).lista();
		} catch (Exception e) {
			result.redirectTo(UsuarioController.class).lista();
			// TODO: handle exception
		}

	}

	/* Renderiza a tela de cadastro */
	@Path("/usuario/cadastrar")
	public void cadastro() {
		// ...
	}

	/* Deleta o registro referente ao ID */
	@Path("/usuario/delete/{id}")
	public void deletar(Integer id) {
		dao.deletarUsuario(id);
		result.include("mensagem", "Cliente deletado com sucesso");
		result.redirectTo(UsuarioController.class).lista();
	}

	@Path("/usuario/atualiza")
	public void atualiza() {
		// ...
	}

	/* Update */
	@Path("/usuario/atualiza/{id}")
	public void update(Integer id) {
		// Usuario usuario = new Usuario();
		result.include("usuario", dao.listarUsuario(id));
		result.redirectTo(UsuarioController.class).atualiza();
	}

}
