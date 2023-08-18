package br.com.fiap.beans;

public class Criador_Conteudo {
	
	private int id_criador_cont;
	private String nome_comp_criador;
	private String email_criador;
	private String senhar_criador;
	private int n_cont_banc;
	private int n_ag_banc;
	private int cod_banco;
	
	public Criador_Conteudo() {
		super();
	}

	public Criador_Conteudo(int id_criador_cont, String nome_comp_criador, String email_criador, String senhar_criador,
			int n_cont_banc, int n_ag_banc, int cod_banco) {
		super();
		this.id_criador_cont = id_criador_cont;
		this.nome_comp_criador = nome_comp_criador;
		this.email_criador = email_criador;
		this.senhar_criador = senhar_criador;
		this.n_cont_banc = n_cont_banc;
		this.n_ag_banc = n_ag_banc;
		this.cod_banco = cod_banco;
	}

	public int getId_criador_cont() {
		return id_criador_cont;
	}

	public void setId_criador_cont(int id_criador_cont) {
		this.id_criador_cont = id_criador_cont;
	}

	public String getNome_comp_criador() {
		return nome_comp_criador;
	}

	public void setNome_comp_criador(String nome_comp_criador) {
		this.nome_comp_criador = nome_comp_criador;
	}

	public String getEmail_criador() {
		return email_criador;
	}

	public void setEmail_criador(String email_criador) {
		this.email_criador = email_criador;
	}

	public String getSenhar_criador() {
		return senhar_criador;
	}

	public void setSenhar_criador(String senhar_criador) {
		this.senhar_criador = senhar_criador;
	}

	public int getN_cont_banc() {
		return n_cont_banc;
	}

	public void setN_cont_banc(int n_cont_banc) {
		this.n_cont_banc = n_cont_banc;
	}

	public int getN_ag_banc() {
		return n_ag_banc;
	}

	public void setN_ag_banc(int n_ag_banc) {
		this.n_ag_banc = n_ag_banc;
	}

	public int getCod_banco() {
		return cod_banco;
	}

	public void setCod_banco(int cod_banco) {
		this.cod_banco = cod_banco;
	}
	
	

}
