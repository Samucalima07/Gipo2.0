package br.com.fiap.main;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

public class TesteUsuario_Selecionar {
	
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
		
		List<Usuario> ListaUsuario = dao.selecionar();
		
		if(ListaUsuario != null) {
			for(Usuario usuario : ListaUsuario) {
				
				//int id_usuario, int id_fase, String email, String nome_completo, String senha, String cep,
				//String logradouro, String complemento, String localidade, String bairro, String uf
				
			System.out.println("======= RELATORIO =======" + "\n");
			
			System.out.println("ID_USUARIO: " + usuario.getId_usuario());
			System.out.println("ID_FASE: " + usuario.getId_fase());
			System.out.println("EMAIL: " + usuario.getEmail());
			System.out.println("NOME COMPLETO: " + usuario.getNome_completo());
			System.out.println("SENHA: " + usuario.getSenha());
			System.out.println("CEP: " + usuario.getCep());
			System.out.println("LOGRADOURO: " + usuario.getLogradouro());
			System.out.println("COMPLEMENTO: " + usuario.getComplemento());
			System.out.println("LOCALIDADE: " + usuario.getLocalidade());
			System.out.println("BAIRRO: " + usuario.getBairro());
			System.out.println("UF: " + usuario.getUf() + "\n");
			
			}
			
		}	
		
	}

}
