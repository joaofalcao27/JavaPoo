package Aula34;

import java.util.Locale;
import java.util.Scanner;

import Classes34.ConversaoDeUnidadeDeTempo;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		boolean sair = false;
		while (!sair) {
		System.out.println("Conversor de tempo");
		System.out.println("Escolha o tipo de conversão deseja:\n1.Minutos para Segundos\n2.Hora para minutos\n3.Dia para horas\n4.Semana para dias\n"
				+ "5.Mes para dias\n6.Ano para dias"); //Menu de escolha;
		int escolha = lerValor(sc, "Insira o valor a opção aqui: ");
		int valor = lerValor(sc, "Insira um valor inicial: ");
		System.out.println();
			switch (escolha) {
			case 1:	
				System.out.printf("%d Minuto(s) equivalem a %d segundos\n", valor, conversao1(valor));
				break;
			case 2:
				System.out.printf("%d Hora(s) equivalem a %d minutos\n", valor, conversao2(valor));
				break;
			case 3:
				System.out.printf("%d Dia(s) equivalem a %d horas\n", valor, conversao3(valor));
				break;
			case 4:
				System.out.printf("%d Semana(s) equivalem a %d dias\n", valor, conversao4(valor));
				break;
			case 5:
				System.out.printf("%d Mes(s) equivalem a %d dias\n", valor, conversao5(valor));
				break;
			case 6:
				System.out.printf("%d Ano(s) equivalem a %d dias\n", valor, conversao6(valor));
				break;
			default:
				break;
			}
			System.out.println();
			System.out.println("Deseja realizar uma nova conversão? \n1. Sim\n2. Nao");
			String decisao = sc.next();
				 if (decisao.equalsIgnoreCase("Nao")) {
					System.out.println("Obrigado por usar nosso conversor!");
					sair = true;
				}
		}
	}
	public static int lerValor(Scanner sc, String msg) { // Método auxiliar para ler um valor
		System.out.print(msg);
		int tempo = sc.nextInt();
		return tempo;
	}
			public static int conversao1(int tempo) { //Métodos auxiliares
				return ConversaoDeUnidadeDeTempo.minutoParaSegundos(tempo);
			}
			public static int conversao2(int tempo) {
				return ConversaoDeUnidadeDeTempo.horaParaMinutos(tempo);
			}
			public static int conversao3(int tempo) {
				return ConversaoDeUnidadeDeTempo.diaParaHoras(tempo);
			}
			public static int conversao4(int tempo) {
				return ConversaoDeUnidadeDeTempo.semanaParaDias(tempo);
			}
			public static int conversao5(int tempo) {
				return ConversaoDeUnidadeDeTempo.mesParaDias(tempo);
			}
			public static int conversao6(int tempo) {
				return ConversaoDeUnidadeDeTempo.anoParaDias(tempo);
			}
			
}
