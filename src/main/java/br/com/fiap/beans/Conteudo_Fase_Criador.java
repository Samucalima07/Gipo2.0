package br.com.fiap.beans;

import java.sql.Blob;

public class Conteudo_Fase_Criador {
	
	private int id_cont_fase;
	private int id_criador_cont;
	private String conteudo_texto;
	private Blob conteudo_video;
	private Blob conteudo_audio;
	private Blob conteudo_imagem;
	
	public Conteudo_Fase_Criador() {
		super();
	}

	public Conteudo_Fase_Criador(int id_cont_fase, int id_criador_cont, String conteudo_texto, Blob conteudo_video,
			Blob conteudo_audio, Blob conteudo_imagem) {
		super();
		this.id_cont_fase = id_cont_fase;
		this.id_criador_cont = id_criador_cont;
		this.conteudo_texto = conteudo_texto;
		this.conteudo_video = conteudo_video;
		this.conteudo_audio = conteudo_audio;
		this.conteudo_imagem = conteudo_imagem;
	}

	public int getId_cont_fase() {
		return id_cont_fase;
	}

	public void setId_cont_fase(int id_cont_fase) {
		this.id_cont_fase = id_cont_fase;
	}

	public int getId_criador_cont() {
		return id_criador_cont;
	}

	public void setId_criador_cont(int id_criador_cont) {
		this.id_criador_cont = id_criador_cont;
	}

	public String getConteudo_texto() {
		return conteudo_texto;
	}

	public void setConteudo_texto(String conteudo_texto) {
		this.conteudo_texto = conteudo_texto;
	}

	public Blob getConteudo_video() {
		return conteudo_video;
	}

	public void setConteudo_video(Blob conteudo_video) {
		this.conteudo_video = conteudo_video;
	}

	public Blob getConteudo_audio() {
		return conteudo_audio;
	}

	public void setConteudo_audio(Blob conteudo_audio) {
		this.conteudo_audio = conteudo_audio;
	}

	public Blob getConteudo_imagem() {
		return conteudo_imagem;
	}

	public void setConteudo_imagem(Blob conteudo_imagem) {
		this.conteudo_imagem = conteudo_imagem;
	}
	
	

}
