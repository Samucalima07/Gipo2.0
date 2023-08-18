package br.com.fiap.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.beans.Usuario;
import br.com.fiap.exececao.Excecao;
import br.com.fiap.model.Endereco;
import br.com.fiap.services.ViaCepServices;


public class TesteGipo {
	
	public static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	public static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	public static double decimal (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws Excecao, ClientProtocolException, IOException {
		
		List<Usuario> ListaUsuario = new ArrayList<Usuario>();
		
		
		Usuario objUsuario;
		
		do {
			
			try {
				// int id_usuario, int id_fase, String email, String nome_completo, String senha
				objUsuario = new Usuario(inteiro("Digite o ID do Usuario: "),
						inteiro("Digite o ID da Fase: "),
						texto("Digite o Email: "),
						texto("Digite o Nome Completo: "),
						texto("Digite a Senha: "));
				ListaUsuario.add(objUsuario);
			
			} catch (NullPointerException e) {
				throw new Excecao(e);
			} catch (NumberFormatException e) {
				throw new Excecao(e);
			}
			
		
		
			
		} while (JOptionPane.showConfirmDialog(null, "Você gostaria de fazer um novo Cadastro ?","Cadastro de Usuario",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		
		
		
		
		for(Usuario usuario:ListaUsuario ) {
			
			System.out.println(" ---------- DADOS CADASTRAIS ----------" + "\n");
			
			System.out.println("ID_USUARIO: " + usuario.getId_usuario());
			System.out.println("ID_FASE: " + usuario.getId_fase());
			System.out.println("EMAIL: " + usuario.getEmail());
			System.out.println("NOME COMPLETO: " + usuario.getNome_completo());
			System.out.println("SENHA: " + usuario.getSenha() + "\n");
		}
		
		ViaCepServices viaCepServices = new ViaCepServices();
		
		String cep = JOptionPane.showInputDialog("Digite o CEP");
		
		Endereco endereco = viaCepServices.getEndereco(cep);
			
			System.out.println("---------- DADOS DO ENDEREÇO DO USUARIO ----------" + "\n");
			
			System.out.println("CEP: " + endereco.getCep());
			System.out.println("Logradouro: " + endereco.getLogradouro());
			System.out.println("Complemento: " + endereco.getComplemento());
			System.out.println("Bairro: " + endereco.getBairro());
			System.out.println("Localidade: " + endereco.getLocalidade());
			System.out.println("UF: " + endereco.getUf());	
	}

}
