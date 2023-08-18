package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Login;
import br.com.fiap.conexao.Conexao;

public class LoginDAO {
	
public Connection conexaoLogin;
	
	public LoginDAO() throws ClassNotFoundException, SQLException {
		this.conexaoLogin = new Conexao().conexao();
	}
	
	// Inserir
	
		public String inserir (Login login) throws SQLException {
			PreparedStatement stmt = conexaoLogin.prepareStatement
					("insert into LOGIN values (?, ?)");
			
			stmt.setString(1, login.getEmail());
			stmt.setString(2, login.getSenha());
			stmt.execute();
			stmt.close();
			
			return "Cadastrado com Sucesso!!!";
		}
		
	// Deletar
		public String deletar(Login login) throws SQLException {
			PreparedStatement stmt = conexaoLogin.prepareStatement
					("delete from LOGIN where EMAIL = ?");
					
			stmt.setString(1, login.getEmail());
			stmt.executeUpdate();
			stmt.close();
				
			return "Deletado com Sucesso!!!";	
			}
		
	// Alterar
		public String alterar(Login login) throws SQLException {
			PreparedStatement stmt = conexaoLogin.prepareStatement
					("update LOGIN set SENHA = ?"
							+ "where EMAIL = ?");
			
			stmt.setString(1, login.getSenha());
			stmt.setString(2, login.getEmail());
			
			stmt.executeUpdate();
			stmt.close();
			
			return "Atualizado com Sucesso!!!";
		}
		
	// Selecionar
		public List<Login> selecionar() throws SQLException{
			List<Login> listaLogin = new ArrayList<Login>();
			PreparedStatement stmt = conexaoLogin.prepareStatement
					("select * from LOGIN");
			ResultSet rs = stmt .executeQuery();
			
			while(rs.next()) {
				Login login = new Login();
				login.setEmail(rs.getString(1));
				login.setSenha(rs.getString(2));
				
				listaLogin.add(login);
			}
			return listaLogin;
		}
}
