package Classes34;



public class Calculadora {
			
			public static int somar(int A, int B) {
				return A + B;
			}
			public static int subtrair(int A, int B) {
				return A - B;
			}
			public static int multiplicar(int A, int B) {
				return A * B;
			}
			public static double dividir(double A, double B) {
				return A / B;
			}
			public static int potencia(int base, int expoente) {
				int resultado = 1;
				for (int i = 0; i < expoente; i++) {
					resultado *= base;
				}
				return resultado;
			}
			public static int fatorial (int valor) {
				int fat = 1;
					for (int i = 1; i <= valor; i++) {
						fat *= i;
					}
				return fat;
			}
			
			
			
			
			
}	
