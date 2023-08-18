package br.com.fiap.resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fiap.beans.Usuario;
import br.com.fiap.bo.UsuarioBO;

@Path("/usuarios")
public class UsuarioResource {

	private UsuarioBO usuarioBO;
	
	// LISTAR TODAS
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> listarUsuarios() throws ClassNotFoundException, SQLException {
		usuarioBO = new UsuarioBO();
		return usuarioBO.select();
	}

	// CRIAR
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String adicionarUsuario(Usuario usuario) throws ClassNotFoundException, SQLException {
		usuarioBO = new UsuarioBO();
		return usuarioBO.insert(usuario);
	}

	// ATUALIZAR
	@PUT
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String atualizarUsuario(@PathParam("id") int id, Usuario usuario) throws ClassNotFoundException, SQLException {
		usuario.setId_usuario(id);
		usuarioBO = new UsuarioBO();
		return usuarioBO.update(usuario);
	}

	// DELETAR
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String excluirUsuario(@PathParam("id") int id) throws ClassNotFoundException, SQLException {
		usuarioBO = new UsuarioBO();
		Usuario usuario = new Usuario();
		usuario.setId_usuario(id);
		return usuarioBO.delete(usuario);
	}
}

