package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

public class TesteUsuario_Alterar {
	
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
		
		// int id_usuario, int id_fase, String email, String nome_completo, String senha, String cep,
		//String logradouro, String complemento, String localidade, String bairro, String uf
		Usuario objUsuario = new Usuario(inteiro("Digite o ID que deseja alterar"),
				inteiro("Digite o ID fase"),
				texto("Digite o Email"),
				texto("Digite o Nome Completo"),
				texto("Digite a Senha"),
				texto("Digite o CEP"),
				texto("Digite o Endereço"),
				texto("Digite o complemento"),
				texto("Digite a localidade"),
				texto("Digite o Bairro"),
				texto("Digite a UF"));
		
		System.out.println(dao.alterar(objUsuario));
		
		

	}

}
