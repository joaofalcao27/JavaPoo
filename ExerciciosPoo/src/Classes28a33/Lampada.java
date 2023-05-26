package Classes28a33;

import java.util.Scanner;

public class Lampada {
		
	private String marca;
	private String formato;
	private int potencia;
	private String tensao;
	private String tipo;
		
		public Lampada(String marca, String formato, int potencia, String tensao, String tipo) {
			this.marca = marca;
			this.formato = formato;
			this.potencia = potencia ;
			this.tensao = tensao;
			this.tipo = tipo;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getFormato() {
			return formato;
		}

		public void setFormato(String formato) {
			this.formato = formato;
		}

		public int getPotencia() {
			return potencia;
		}

		public void setPotencia(int potencia) {
			this.potencia = potencia;
		}

		public String getTensao() {
			return tensao;
		}

		public void setTensao(String tensao) {
			this.tensao = tensao;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		boolean acao;
			public boolean ligarLampada() {
				return acao = true;
			}
			public boolean desligarLampada() {
				return acao = false;
			}
			public void acaoLampada(Scanner sc) {
				System.out.println("Deseja ligar a lâmpada? \n1. Sim\n2. Nao");
				String escolha = sc.next();
					if (escolha.equalsIgnoreCase("Sim")) {
						ligarLampada();
						System.out.println("A lâmpada foi ligada!");
					} else if (escolha.equalsIgnoreCase("Nao")) {
						System.out.println("A lâmpada está desligada!");
					}
			}
}
