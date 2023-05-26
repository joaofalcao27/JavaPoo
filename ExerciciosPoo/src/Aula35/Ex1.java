package Aula35;

import java.util.Locale;
import java.util.Scanner;

import Classes35.Fibonacci;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe um valor: ");
		int valor = sc.nextInt();
		
		int resultado = Fibonacci.fibonacci(valor);
		 System.out.println("O " + valor + "º termo da sequência de Fibonacci é: " + resultado);
		

	}

}
