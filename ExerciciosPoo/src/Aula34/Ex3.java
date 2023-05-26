package Aula34;

import java.util.Locale;
import java.util.Scanner;


import Classes34.ConversaoDeUnidadeDeArea;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Conversões de unidades de área");
		System.out.print("Informe um valor: ");
		double valor = sc.nextDouble();
		
		double pesQuadrados = metroParaPesQuadrados(valor);
        double cmQuadrados = pesParaCmQuadrados(pesQuadrados);
        double acres = milhaParaAcres(valor);
        double pesQuadrados2 = acreParaPesQuadrados(valor);
        
        System.out.printf("%.2f metros equivalem a %.2f pés quadrados%n", valor, pesQuadrados);
        System.out.printf("%.2f pé quadrado equivale a %.2f centímetros quadrados%n", valor, cmQuadrados);
        System.out.printf("%.2f milha quadrada equivale a %.2f acres%n", valor, acres);
        System.out.printf("%.2f acre equivale a %.2f pés quadrados%n", valor, pesQuadrados2);
		
		

	}
	public static double metroParaPesQuadrados(double valor) {
        return ConversaoDeUnidadeDeArea.metroParaPes(valor);
    }
    
    public static double pesParaCmQuadrados(double valor) {
        return ConversaoDeUnidadeDeArea.pesParaCm(valor);
    }
    
    public static double milhaParaAcres(double valor) {
        return ConversaoDeUnidadeDeArea.milhaParaAcres(valor);
    }
    
    public static double acreParaPesQuadrados(double valor) {
        return ConversaoDeUnidadeDeArea.acreParaPes(valor);
    }
	
	
	
}
