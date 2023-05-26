package Classes25a27;


public class ContaCorrente {
    private String numero;
    private double saldo;
    private boolean especial;
    private double limite;

    public ContaCorrente(String numero, double saldo, boolean especial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
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

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public boolean usandoChequeEspecial() {
        return saldo < 0;
    }
}