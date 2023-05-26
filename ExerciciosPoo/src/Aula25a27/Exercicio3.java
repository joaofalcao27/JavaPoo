package Aula25a27;

import java.util.Locale;
import java.util.Scanner;

import Classes25a27.Aluno;
import Classes25a27.LivroLivraria;



public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Aluno aluno = new Aluno();
		
		aluno.verificarSituacao(sc);
		
		
		
		
sc.close();	

	}

}
