package dominio;

import negocio.Funcionario;

public class ProfessorTP3 extends Funcionario {
	private boolean mestre;
	private String graduado;

	public ProfessorTP3() {
		this.setNome("Roberto Augusto");
	}
	public ProfessorTP3(String nome, int idade) {
		super(nome, idade);
	}
	public ProfessorTP3(String nome, int idade, float salario, boolean mestre, String graduado) {
		super(nome, idade, salario, salario);
		this.mestre = mestre;
		this.graduado = graduado;
	}
	
	public float calcularSalarioLiquido(){		
		float salarioMestre = this.mestre ? 2500 : 750;
		
		float salarioGraduado = "sistema de informacao".equalsIgnoreCase(this.graduado) ? 1500 : 500;

		return this.getSalario() + salarioGraduado + salarioMestre;
	}

	public void exibir() {
		System.out.println("Professor: " + this.toString());
	}

	@Override
	public String toString() {
		float salarioLiquido = calcularSalarioLiquido();
		
		String situacao = obterSituacao(salarioLiquido);
		
		return String.format("%s | %s | %5s | Salário líquido = R$%10.2f (%s)", 
				super.toString(),
				this.mestre ? "sim" : "não",
				this.graduado,
				salarioLiquido,
				situacao); 
	}

	public boolean ismestre() {
		return mestre;
	}

	public void setmestre(boolean mestre) {
		this.mestre = mestre;
	}

	public String getgraduado() {
		return graduado;
	}

	public void setgraduado(String graduado) {
		this.graduado = graduado;
	}
}