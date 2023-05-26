package ContaDeBanco;

public class Conta {

	private int numero;
	private String nomeTitular;
	private double saldo;

	public Conta(int numero, String nomeTitular) {
		this.numero = numero;
		this.nomeTitular = nomeTitular;
	}	
	public Conta(int numero, String nomeTitular, double depositoInicial) {
		super();
		this.numero = numero;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double quantia) {
		saldo += quantia;
	}

	public void saque(double quantia) {
		saldo -= quantia + 5.0;
	}
	public String toString() {
		return "Account "
				+ numero
				+ ", Holder: "
				+ nomeTitular
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}
}
