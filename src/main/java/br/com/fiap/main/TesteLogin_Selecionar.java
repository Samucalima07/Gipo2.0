package br.com.fiap.main;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Login;
import br.com.fiap.dao.LoginDAO;

public class TesteLogin_Selecionar {
	
	public static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	public static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	public static double decimal (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		LoginDAO dao = new LoginDAO();
		
		List<Login> listaLogin = dao.selecionar();
		
		if(listaLogin != null) {
			for(Login login : listaLogin) {
				
				System.out.println("======= RELATORIO =======" + "\n");
				
				System.out.println("EMAIL: " + login.getEmail());
				System.out.println("SENHA: " + login.getSenha() + "\n");
			}
		}
		
		

	}

}
