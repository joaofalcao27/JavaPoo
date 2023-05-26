package ContaDeBanco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.print("Enter account number: "); //Entrada do número da conta e nome do titular da mesma
		int numero = sc.nextInt();
		System.out.print("Enter account holder: ");
		String nome = sc.next();
		
		Conta conta = new Conta(numero, nome);
		
		System.out.println("Is there na initial deposit (y/n)? "); //Opção de depositar ou não
		String escolha = sc.next();
			if (escolha.equalsIgnoreCase("y")) {
				System.out.print("Enter initial deposit value: ");
				double deposito = sc.nextDouble();
				conta.deposito(deposito);		
			} else if (escolha.equalsIgnoreCase("n")) {
				conta.deposito(0);
			}
		imprimir("Account data: \n"); //Impressões de atualizações da conta
		System.out.println(conta);
		imprimir("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		imprimir("Updated account data: \n");
		System.out.println(conta);
		imprimir("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		imprimir("Updated account data: \n");
		System.out.println(conta);
		
sc.close();
	}
	public static void imprimir(String msg) { //Método auxiliar para imprimir na tela
		System.out.println();
		System.out.print(msg);
	}
	

}
