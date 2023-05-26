package Classes28a33;

public class ContaCorrente {
	
	private int numero;
    private double saldo;
    private boolean especial;
    private double limite;

    public ContaCorrente(int numero, double limite) {
        this.numero = numero;
        this.saldo = 0;
        this.especial = false;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public double getLimite() {
        return limite;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
    }
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        } else if (valor <= saldo + limite && especial) {
            saldo -= valor;
            System.out.println("Saque realizado utilizando cheque especial. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void verificarChequeEspecial() {
        if (saldo < 0) {
            especial = true;
            System.out.println("Cliente está usando cheque especial.");
        } else {
            especial = false;
            System.out.println("Cliente não está usando cheque especial.");
        }
    }
}