package br.com.fiap.beans;

public class Pagamento_Criador_Conteudo {
	
	private int id_pag_criador;
	private int id_criador_cont;
	private String tipo_pag;
	private int cod_pag;
	private int data_pag;
	private String hr_min_pag;
	private int cod_comp_pag;
	
	public Pagamento_Criador_Conteudo(){
		super();
	}

	public Pagamento_Criador_Conteudo(int id_pag_criador, int id_criador_cont, String tipo_pag, int cod_pag,
			int data_pag, String hr_min_pag, int cod_comp_pag) {
		super();
		this.id_pag_criador = id_pag_criador;
		this.id_criador_cont = id_criador_cont;
		this.tipo_pag = tipo_pag;
		this.cod_pag = cod_pag;
		this.data_pag = data_pag;
		this.hr_min_pag = hr_min_pag;
		this.cod_comp_pag = cod_comp_pag;
	}

	public int getId_pag_criador() {
		return id_pag_criador;
	}

	public void setId_pag_criador(int id_pag_criador) {
		this.id_pag_criador = id_pag_criador;
	}

	public int getId_criador_cont() {
		return id_criador_cont;
	}

	public void setId_criador_cont(int id_criador_cont) {
		this.id_criador_cont = id_criador_cont;
	}

	public String getTipo_pag() {
		return tipo_pag;
	}

	public void setTipo_pag(String tipo_pag) {
		this.tipo_pag = tipo_pag;
	}

	public int getCod_pag() {
		return cod_pag;
	}

	public void setCod_pag(int cod_pag) {
		this.cod_pag = cod_pag;
	}

	public int getData_pag() {
		return data_pag;
	}

	public void setData_pag(int data_pag) {
		this.data_pag = data_pag;
	}

	public String getHr_min_pag() {
		return hr_min_pag;
	}

	public void setHr_min_pag(String hr_min_pag) {
		this.hr_min_pag = hr_min_pag;
	}

	public int getCod_comp_pag() {
		return cod_comp_pag;
	}

	public void setCod_comp_pag(int cod_comp_pag) {
		this.cod_comp_pag = cod_comp_pag;
	}
	
	

}
