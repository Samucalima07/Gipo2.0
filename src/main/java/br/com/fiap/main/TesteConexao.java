package br.com.fiap.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.conexao.Conexao;

public class TesteConexao {
		
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Connection c = new Conexao().conexao();
			
			System.out.println("Conectado com Sucesso!!!");
			
			c.close();

	}

}
