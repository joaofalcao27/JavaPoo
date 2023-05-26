package Aulas28a33;

import java.util.Locale;
import java.util.Scanner;

import Classes28a33.Lampada;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Lampada lampada = new Lampada("PHILLIPS","Espirial",30,"Bivolt","Encadescente");
		
		System.out.println("Informações da lampada:");
		System.out.println(lampada.getMarca()+"\n"+lampada.getFormato()+"\n"+lampada.getPotencia()
		+"\n"+lampada.getTensao()+"\n"+lampada.getTipo());
		
		lampada.acaoLampada(sc);
		
	}

}
