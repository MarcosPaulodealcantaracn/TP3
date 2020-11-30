package testes;

import dominio.AlunoTP3;

public class AlunoTeste {
	
	public static void main(String[] args) {

		AlunoTP3 alu1 = new AlunoTP3();
		alu1.setIdade(27);
		alu1.setMensalidade(1410);
		alu1.setBonus(100);
		alu1.setDesconto(401);
		alu1.exibir();
		
		AlunoTP3 alu2 = new AlunoTP3();
		alu2.setNome("Renata");
		alu2.setIdade(22);
		alu2.setMensalidade(1410);
		alu2.setBonus(0);
		alu2.setDesconto(0);
		alu2.exibir();
		
		AlunoTP3 alu3 = new AlunoTP3("Joao", 24);
		alu3.setMensalidade(1538);
		alu3.setBonus(190);
		alu3.setDesconto(309);
		alu3.exibir();

		new AlunoTP3("Carlos", 33, 1510, 0, 0).exibir();
	}
}