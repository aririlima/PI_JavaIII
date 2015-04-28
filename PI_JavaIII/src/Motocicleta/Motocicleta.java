package Motocicleta;

public class Motocicleta {

	private String Chassi;
	private String Montadora;
	private String Modelo;
	private float Motorizacao;
	private float Preco;
	private float Cilindrada;
	private float CapacidadedoTanque;
	
	public Motocicleta(String chassi, String montadora, String modelo,
			float motorizacao, float preco) {
		
		this.Chassi = chassi;
		this.Montadora = montadora;
		this.Modelo = modelo;
		this.Motorizacao = motorizacao;
		this.Preco = preco;
	}
	
    public void adicionaMoto(){
		
		
	}
	
	public void pesquisarMoto(){
		
		
	} 
	
	public void buscarMoto(){
		
		
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

	public float getCilindrada() {
		return Cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		Cilindrada = cilindrada;
	}

	public float getCapacidadedoTanque() {
		return CapacidadedoTanque;
	}

	public void setCapacidadedoTanque(float capacidadedoTanque) {
		CapacidadedoTanque = capacidadedoTanque;
	}
	
	
	
}
