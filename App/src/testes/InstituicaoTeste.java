package testes;

import dominio.Instituicao;
import exceptions.FaturamentoNegativoException;
import exceptions.NomeIncompletoException;

public class InstituicaoTeste {

	public static void main(String[] args) {
		
		System.out.println("I1");
		Instituicao I1 = new Instituicao();
		I1.setNome("4º Registro de imoveis");
		try {
			I1.setFaturamento(-500);
			System.out.println(I1.getNome());
			I1.exibir();
		} catch (NomeIncompletoException | FaturamentoNegativoException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("I2");
		Instituicao I2 = new Instituicao();
		try {
			I2.setFaturamento(1000);
			System.out.println(I2.getNome());
			I2.exibir();
		} catch (NomeIncompletoException | FaturamentoNegativoException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("I3");
		Instituicao I3 = new Instituicao();
		I3.setNome("Instituto de Tecnologia Infnet");
		try {
			I3.setFaturamento(1500);
		} catch (FaturamentoNegativoException e) {
			System.out.println(e.getMessage());
		}
		I3.exibir();
	}
}