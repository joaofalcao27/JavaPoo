package Aula25a27;

import java.util.Locale;
import java.util.Scanner;

import Classes25a27.ContaCorrente;
import Classes25a27.Livro;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Digite o número da conta: ");
        String numeroConta = sc.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        System.out.print("A conta é especial? (true/false): ");
        boolean especial = sc.nextBoolean();

        System.out.print("Digite o limite de cheque especial: ");
        double limite = sc.nextDouble();

        ContaCorrente conta = new ContaCorrente(numeroConta, saldoInicial, especial, limite);

        System.out.println("Saldo inicial: " + conta.consultarSaldo());

        System.out.print("Digite o valor do saque: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);

        System.out.print("Digite o valor do depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);

        System.out.println("Saldo final: " + conta.consultarSaldo());
        System.out.println("Usando cheque especial? " + conta.usandoChequeEspecial());
		
		
		

		
sc.close();		
	}

}
