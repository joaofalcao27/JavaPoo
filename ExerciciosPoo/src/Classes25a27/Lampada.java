package Classes25a27;

public class Lampada {
	public String marca;
	public String formato;
	public int potencia;
	public String tensao;
	public String tipo;
	
	boolean estado;
		public void ligarLampada() {
			estado = true;
			System.out.println("Você ligou a lâmpada!");
		}
		public void desligarLampada() {
			estado = false;
			System.out.println("Você desligou a lâmpada!");
		}
}
