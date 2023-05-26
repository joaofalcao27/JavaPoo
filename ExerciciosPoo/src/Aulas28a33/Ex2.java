package Aulas28a33;

import java.util.Locale;
import java.util.Scanner;

import Classes28a33.ContaCorrente;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		 System.out.print("Informe o número da conta: ");
	        int numeroConta = sc.nextInt();

	        System.out.print("Informe o limite do cheque especial: ");
	        double limiteChequeEspecial = sc.nextDouble();

	        ContaCorrente conta = new ContaCorrente(numeroConta, limiteChequeEspecial);

	        System.out.print("Informe o valor do depósito inicial: ");
	        double valorDeposito = sc.nextDouble();
	        conta.depositar(valorDeposito);

	        System.out.print("Informe o valor do saque: ");
	        double valorSaque = sc.nextDouble();
	        conta.sacar(valorSaque);

	        conta.verificarChequeEspecial();

	        sc.close();
       
        	
		
		
		
	
		

	}

}
