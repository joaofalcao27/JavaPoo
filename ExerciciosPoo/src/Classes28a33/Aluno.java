package Classes28a33;

import java.util.Scanner;

public class Aluno {
		
	private String nome;
	private int matricula;
	private String curso;
	private String[] disciplinas = new String [3];
	private double[] notas = new double [3];
	
	public Aluno(String nome, int matricula, String curso, String[] disciplinas, double[] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinas = disciplinas;
		this.notas = notas;
	}	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	 public void pedirInformacoes(Scanner sc) {
		 for (int i = 0; i < disciplinas.length; i++) {
			System.out.printf("Informe o nome da disciplina %d: ",(i+1));
			getDisciplinas()[i] = sc.next();
			System.out.printf("Informe a nota da disciplina %d: ",(i+1)); 
			getNotas()[i] = sc.nextDouble();
			 
		}
	 } 
	 public void verificarSituacao(Scanner sc) {
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
