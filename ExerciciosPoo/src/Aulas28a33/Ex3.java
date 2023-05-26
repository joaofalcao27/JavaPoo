package Aulas28a33;

import java.util.Locale;
import java.util.Scanner;

import Classes28a33.Aluno;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Insira um nome: ");
		String nome = sc.next();
		System.out.print("Informe o número da matrícula: ");
		int matricula = sc.nextInt();
		
		Aluno aluno = new Aluno(nome, matricula);
		
		aluno.pedirInformacoes(sc);
		aluno.verificarSituacao(sc);

	}

}
