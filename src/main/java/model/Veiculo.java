package model;

public class Veiculo {
	private String id_veiculo;
	private String montadora;
	private String modelo;
	private String ano_fabrica;
	
		
	public Veiculo(String id_veiculo, String montadora, String modelo, String ano_fabrica) {
		super();
		this.id_veiculo = id_veiculo;
		this.montadora = montadora;
		this.modelo = modelo;
		this.ano_fabrica = ano_fabrica;
	}

	public Veiculo() {
		super();
	}
	
	
	public String getId_veiculo() {
		return id_veiculo;
	}
	public void setId_veiculo(String id_veiculo) {
		this.id_veiculo = id_veiculo;
	}
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAno_fabrica() {
		return ano_fabrica;
	}
	public void setAno_fabrica(String ano_fabrica) {
		this.ano_fabrica = ano_fabrica;
	}
	
	
}
