package model;

public class Personaliza {
	private String id_personaliza;
	private String dimensoes;
	private String cor;
	private String observacao;
		
	
	public Personaliza(String id_personaliza, String dimensoes, String cor, String observacao) {
		super();
		this.id_personaliza = id_personaliza;
		this.dimensoes = dimensoes;
		this.cor = cor;
		this.observacao = observacao;
	}

	public Personaliza() {
		super();

	}
	
	
	public String getId_personaliza() {
		return id_personaliza;
	}
	public void setId_personaliza(String id_personaliza) {
		this.id_personaliza = id_personaliza;
	}
	public String getDimensoes() {
		return dimensoes;
	}
	public void setDimensoes(String dimensoes) {
		this.dimensoes = dimensoes;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
}
