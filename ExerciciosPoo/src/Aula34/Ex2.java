package Aula34;

import java.util.Locale;
import java.util.Scanner;

import Classes34.Calculadora;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("===Calculadora===");
		System.out.println("Escolha uma das operações: \n1.(+) 2.(-) 3.(*) 4.(/) 5.(^) 6.(Fatorial)"); // Menu de
																										// escolha;

		int escolha = sc.nextInt();

		if (escolha == 5) { // Caso a escolha seja potenciar;
			int base = lerValor(sc, "Informe a base: ");
			int expoente = lerValor(sc, "Informe o expoente: ");
			imprimir(Calculadora.potencia(base, expoente));
			
		} else if (escolha == 6) { // Caso a escolha seja fatorar;
			int valor = lerValor(sc, "Insira um valor: ");
			imprimir(Calculadora.fatorial(valor));
			
		} else {
			int v1 = lerValor(sc, "Insira o valor 1: ");
			int v2 = lerValor(sc, "Insira o valor 2: ");
			
			switch (escolha) {
			case 1:
				imprimir(Calculadora.somar(v1, v2));
				break;
			case 2:
				imprimir(Calculadora.subtrair(v1, v2));
				break;
			case 3:
				imprimir(Calculadora.multiplicar(v1, v2));
				break;
			case 4:
				if (v2 != 0) {
					imprimirDivisao(Calculadora.dividir(v1, v2));
				} else {
					System.out.println("Não é possível dividir por zero.");
					System.exit(0);
				}
				break;
			default:
				break;
			}
		}

		sc.close();

	}

	public static void imprimir(int result) { // Imprime na tela o resultado da operação escolhida;
		System.out.println(result);
	}

	public static void imprimirDivisao(double div) { // Excessão no caso seja divisão;
		System.out.println(div);
	}

	public static int lerValor(Scanner sc, String msg) { // Método auxiliar para ler os valores com Scanner;
		System.out.print(msg);
		int valor = sc.nextInt();
		return valor;
	}
}
