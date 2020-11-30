package negocio;

import auxiliar.Constante;

public abstract class Funcionario {
	private String nome;
	private int idade;
	protected float salario;
	private float mensalidade;

	public Funcionario(){
		this.setIdade(Constante.MAIOR_IDADE);
		this.setSalario(Constante.SALARO_MINIMO);

	}
	
	public Funcionario(String nome, int idade) {
		this();
		this.nome = nome;
		this.idade = idade;
	}

	public Funcionario(String nome, int idade, float salario, float mensalidade) {
		this(nome, idade);
		this.salario = salario;
		this.mensalidade = mensalidade;
	}

	public abstract float calcularSalarioLiquido();
	
	protected String obterSituacao(float sl){

		if(sl < Constante.SALARIO_LIMITE_POBRE) {
			return "pobre";
		}else if (sl >= Constante.SALARIO_LIMITE_RICO) {
			return "rico";
		}else {
			return "classe m�dia";
		}
	}
	

	public void exibir() {
		System.out.println("Funcion�rio: " + this.toString());
	}
	
	@Override
	public String toString() {

		return String.format("%-15s | %03d | %10.2f | %10.2f", 
					this.nome, 
					this.idade, 
					this.salario,
					this.mensalidade
				);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public void setDesconto(float nextFloat) {
		// TODO Auto-generated method stub
		
	}

	public void setBonus(float nextFloat) {
		// TODO Auto-generated method stub
		
	}
	
}