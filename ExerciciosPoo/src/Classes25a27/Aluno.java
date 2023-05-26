package Classes25a27;

import java.util.Scanner;

public class Aluno {
	private String nome;
	private int matricula;
	private String curso;
	public String[] disciplinas = new String [3];
	public double[] notas = new double [3];
	
		public void verificarSituacao(Scanner sc) {
			for (int i = 0; i < disciplinas.length; i++) {
				System.out.printf("Insira o nome da disciplina %d: ",(i+1));
				disciplinas[i] = sc.next();
				System.out.printf("Informe a nota da disciplina %d: ",(i+1));
				notas[i] = sc.nextDouble();				
			}
			
			for (int i = 0; i < disciplinas.length; i++) {
				System.out.println();
				System.out.println("Disciplina: "+disciplinas[i]);
				System.out.println("Nota: "+notas[i]);
					if (notas[i] >= 7) {
						System.out.println("Situação: Aprovado");
						System.out.println();
					} else {
						System.out.println("Situação: Reprovado");
						System.out.println();
					}
			}
		}
		
}
