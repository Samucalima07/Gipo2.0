package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Login;
import br.com.fiap.dao.LoginDAO;

public class TesteLogin_Cadastro {
	
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
		
		Login objLogin = new Login(texto("Digite o Email"),
				texto("Digite a Senha"));
		
		System.out.println(dao.inserir(objLogin));
		
		

	}

}
