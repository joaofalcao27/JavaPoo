package Aula34;

import java.util.Locale;
import java.util.Scanner;

import Classes34.Contador;

public class Ex1 {

	public static void imprimir() {
		System.out.println(Contador.obter());

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		imprimir();

		Contador.incremetar();

		imprimir();

		Contador.zerar();

		imprimir();

	}

}
