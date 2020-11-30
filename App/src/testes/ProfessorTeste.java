package testes;

import dominio.ProfessorTP3;

public class ProfessorTeste {

	public static void main(String[] args) {
		
		ProfessorTP3 p1 = new ProfessorTP3();
		p1.setIdade(40);
		p1.setSalario(100000);
		p1.setmestre(true);
		p1.setgraduado("Sistema de Informação");
		System.out.println("Professor: " + p1);

		ProfessorTP3 p2 = new ProfessorTP3("João Melo", 32);
		p2.setSalario(20000);
		p2.setmestre(true);
		p2.setgraduado("Analise de Sistema");
		System.out.println("Professor: " + p2);
		
		ProfessorTP3 p3 = new ProfessorTP3("Renata", 30, 10000, false, "Administração");
		System.out.println("Professor: " + p3);
	}
}