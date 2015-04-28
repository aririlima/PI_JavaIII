package Carro;

public class Carro {
	
	private String Chassi;
	private String Montadora;
	private String Modelo;
	private float Motorizacao;
	private float Preco;
	
	public Carro(String chassi, String montadora, String modelo,
			float motorizacao, float preco) {
		
		this.Chassi = chassi;
		this.Montadora = montadora;
		this.Modelo = modelo;
		this.Motorizacao = motorizacao;
		this.Preco = preco;
	}

	public void adicionaCarro(){
		
		
	}
	
	public void pesquisarCarro(){
		
		
	} 
	
	public void buscarCarro(){
		
		
	}
	
	
	
	public String getChassi() {
		return Chassi;
	}

	public void setChassi(String chassi) {
		Chassi = chassi;
	}

	public String getMontadora() {
		return Montadora;
	}

	public void setMontadora(String montadora) {
		Montadora = montadora;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public float getMotorizacao() {
		return Motorizacao;
	}

	public void setMotorizacao(float motorizacao) {
		Motorizacao = motorizacao;
	}

	public float getPreco() {
		return Preco;
	}

	public void setPreco(float preco) {
		Preco = preco;
	}
	

}
