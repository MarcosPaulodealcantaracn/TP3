package dominio;

import negocio.Alunos_instituicao;


public class AlunoTP3 extends Alunos_instituicao {
	private float bonus;
	private float desconto;

	public AlunoTP3(){
		this.setNome("Marcos Paulo");
	}
	
	public AlunoTP3(String nome, int idade) {
		super(nome, idade);
	}

	public AlunoTP3(String nome, int idade, float mensalidade, float bonus, float desconto) {
		this(nome, idade);
		this.setMensalidade(mensalidade);
		this.bonus = bonus;
		this.desconto = desconto;
	}
	
	public float calcularMensalidadeLiquida(){
		return this.getMensalidade() - this.bonus - this.desconto;
	}
	
	public void exibir() {
		System.out.println("AlunoTP3: " + this.toString());
	}
	
	@Override
	public String toString() {
		
		float mensalidadeLiquida = calcularMensalidadeLiquida();
		
		String situacao = obterSituacaoM(mensalidadeLiquida);

		return String.format("%s | %10.2f | %10.2f :: Mensalidade Liquida R$%10.2f (%s)", 
					super.toString(), 
					this.bonus, 
					this.desconto,
					mensalidadeLiquida,
					situacao
				);
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}


	public void setFaturamento(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calcularMensalidadeLiquido() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}