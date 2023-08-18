package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Usuario;
import br.com.fiap.conexao.Conexao;

public class UsuarioDAO {
	
	public Connection conexaoUsuario;
	
	public UsuarioDAO() throws ClassNotFoundException, SQLException {
		this.conexaoUsuario = new Conexao().conexao();
	}
	
	// Inserir
	
	public String inserir (Usuario usuario) throws SQLException {
		PreparedStatement stmt = conexaoUsuario.prepareStatement
				("insert into USUARIO values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		// int id_usuario, int id_fase, String email, String nome_completo, String senha, String cep,
		//String logradouro, String complemento, String localidade, String bairro, String uf
		stmt.setInt(1, usuario.getId_usuario());
		stmt.setInt(2, usuario.getId_fase());
		stmt.setString(3, usuario.getEmail());
		stmt.setString(4, usuario.getNome_completo());
		stmt.setString(5, usuario.getSenha());
		stmt.setString(6, usuario.getCep());
		stmt.setString(7, usuario.getLogradouro());
		stmt.setString(8, usuario.getComplemento());
		stmt.setString(9, usuario.getLocalidade());
		stmt.setString(10, usuario.getBairro());
		stmt.setString(11, usuario.getUf());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com Sucesso!!!";	
	}
	
	// Deletar
		public String deletar(Usuario usuario) throws SQLException {
			PreparedStatement stmt = conexaoUsuario.prepareStatement
					("delete from Usuario where ID_USUARIO = ?");
			
				stmt.setInt(1, usuario.getId_usuario());
				stmt.executeUpdate();
				stmt.close();
		
			return "Deletado com Sucesso!!!";	
	}
		
	// Alterar
		public String alterar(Usuario usuario) throws SQLException {
			PreparedStatement stmt = conexaoUsuario.prepareStatement
					("update USUARIO set ID_FASE = ?, EMAIL = ?, NOME_COMPLETO = ?, SENHA = ?, CEP = ?, LOGRADOURO = ?, COMPLEMENTO = ?, LOCALIDADE = ?, BAIRRO = ?, UF = ? "
							+ "where ID_USUARIO = ?");
			
			stmt.setInt(1, usuario.getId_fase());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getNome_completo());
			stmt.setString(4, usuario.getSenha());
			stmt.setString(5, usuario.getCep());
			stmt.setString(6, usuario.getLogradouro());
			stmt.setString(7, usuario.getComplemento());
			stmt.setString(8, usuario.getLocalidade());
			stmt.setString(9, usuario.getBairro());
			stmt.setString(10, usuario.getUf());
			stmt.setInt(11, usuario.getId_usuario());
			
			stmt.executeUpdate();
			stmt.close();
			
			return "Atualizado com sucesso!!!";
			
		}
		
		// Selecionar
		public List<Usuario> selecionar() throws SQLException{
			List<Usuario> listaUsuario = new ArrayList<Usuario>();
			PreparedStatement stmt = conexaoUsuario.prepareStatement
					("select * from USUARIO");
			ResultSet rs = stmt.executeQuery();
			
			//int id_usuario, int id_fase, String email, String nome_completo, String senha, String cep,
			//String logradouro, String complemento, String localidade, String bairro, String uf
			while(rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId_usuario(rs.getInt(1));
				usuario.setId_fase(rs.getInt(2));
				usuario.setEmail(rs.getString(3));
				usuario.setNome_completo(rs.getString(4));
				usuario.setSenha(rs.getString(5));
				usuario.setCep(rs.getString(6));
				usuario.setLogradouro(rs.getString(7));
				usuario.setComplemento(rs.getString(8));
				usuario.setLocalidade(rs.getString(9));
				usuario.setBairro(rs.getString(10));
				usuario.setUf(rs.getString(11));
				
				listaUsuario.add(usuario);
			}
			return listaUsuario;
			
		}

}
