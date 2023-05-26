package Aula35;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int valor = sc.nextInt();
		System.out.println(somatorio(valor));
		
		

	}
	public static int somatorio(int n) {
		if (n == 1) {
			return 1;
		}
		return n + somatorio(n - 1);
	}
}
