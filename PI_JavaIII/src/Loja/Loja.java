package Loja;

import java.util.List;

import Carro.Carro;
import Motocicleta.Motocicleta;

public class Loja {
		private String Endereco;
		private String Nome;
		private List<Carro> listaDeCarros;
		private List<Motocicleta> listaDeMotocicletas;

		
		
		public String getEndereco() {
			return Endereco;
		}

		public void setEndereco(String endereco) {
			Endereco = endereco;
		}

		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			Nome = nome;
		}

		public List<Carro> getListaDeCarros() {
			return listaDeCarros;
		}

		public void setListaDeCarros(List<Carro> listaDeCarros) {
			this.listaDeCarros = listaDeCarros;
		}

		public List<Motocicleta> getListaDeMotocicletas() {
			return listaDeMotocicletas;
		}

		public void setListaDeMotocicletas(List<Motocicleta> listaDeMotocicletas) {
			this.listaDeMotocicletas = listaDeMotocicletas;
		}
		
		
		

}
