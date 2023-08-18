package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

public class TesteUsuario_Deletar {
	
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
		
		UsuarioDAO dao = new UsuarioDAO();
		
		Usuario objUsuario = new Usuario(inteiro("Digite o ID a ser Excluido"));
		
		System.out.println(dao.deletar(objUsuario));
		
	}

}
