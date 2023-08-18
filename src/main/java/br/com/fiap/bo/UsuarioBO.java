package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

public class UsuarioBO {
	
	private UsuarioDAO pd;
	
	// Cadastro 
	
		public String insert (Usuario usuario) throws ClassNotFoundException, SQLException {
			pd = new UsuarioDAO();
			return pd.inserir(usuario);
			
		}
		
		// Deletar
		public String delete (Usuario usuario) throws ClassNotFoundException, SQLException {
			pd = new UsuarioDAO();
			return pd.deletar(usuario);
		}
		
		// Alterar
		
		public String update (Usuario usuario) throws ClassNotFoundException, SQLException {
			pd = new UsuarioDAO();
			return pd.alterar(usuario);
		}
		
		// Selecionar
		
		public List<Usuario> select() throws ClassNotFoundException, SQLException{
			pd = new UsuarioDAO();
			return pd.selecionar();
			
		}

}
