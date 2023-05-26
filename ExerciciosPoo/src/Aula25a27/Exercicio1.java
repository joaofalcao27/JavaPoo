package Aula25a27;

import java.util.Locale;
import java.util.Scanner;

import Classes25a27.Lampada;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Lampada estado = new Lampada();
		String acao;

		System.out.println("Você deseja ligar a lâmpada? \n1. Sim\n2. Nao");
		acao = sc.next();
		if (acao.equalsIgnoreCase("Sim")) {
			estado.ligarLampada();
		} else if (acao.equalsIgnoreCase("Nao")) {
			estado.desligarLampada();
		}

		sc.close();
	}

}
