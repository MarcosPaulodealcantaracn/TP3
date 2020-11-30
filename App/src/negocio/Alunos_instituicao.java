package negocio;

import auxiliar.Constante;

public abstract class Alunos_instituicao {
	private String nome;
	private int idade;
	private float mensalidade;

	public Alunos_instituicao(){
		this.setIdade(Constante.MAIOR_IDADE);

	}
	
	public Alunos_instituicao(String nome, int idade) {
		this();
		this.nome = nome;
		this.idade = idade;
	}

	public Alunos_instituicao(String nome, int idade, float mensalidade) {
		this(nome, idade);
		this.mensalidade = mensalidade;
	}

	public abstract float calcularMensalidadeLiquido();
	
	protected String obterSituacaoM(float sl){

		if(sl < Constante.MENSALIDADE_DESCONTO) {
			return "Obteve Desconto";
		}else if (sl >= Constante.MENSALIDADE_INTEGRAL) {
			return "Não Obteve Desconto";
		}else {
			return "Bolsista";
		}
	}
	
	public void exibir() {
		System.out.println("Funcionário: " + this.toString());
	}
	
	@Override
	public String toString() {

		return String.format("%-15s | %03d | %10.2f", 
					this.nome, 
					this.idade, 
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
	
	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
}