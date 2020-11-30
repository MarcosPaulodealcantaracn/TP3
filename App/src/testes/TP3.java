package testes;

import java.util.Arrays;
import java.util.Scanner;

import auxiliar.Constante;
import dominio.AlunoTP3;
import dominio.ProfessorTP3;
import negocio.Funcionario;
import negocio.Alunos_instituicao;

public class TP3 {
	
private static Funcionario[] funcionarios; 
	
	private static void imprimir(int id) {
		System.out.println(funcionarios[id].toString());
	}
	
	private static void imprimir() {
		for (int i = 0; i < Constante.QTDE; i++) {
			if(funcionarios[i] != null) {
				imprimir(i);
			}
		}
	}

	private static float calcularMediaSalarial(int qtde){
		float somaSalarial = 0;		
		for(int x = 0; x < qtde; x++) {
			somaSalarial = somaSalarial + funcionarios[x].calcularSalarioLiquido();
		}		

		return somaSalarial / qtde;
	}

	public static void main(String[] args) {
		funcionarios = new Funcionario[Constante.QTDE];

		Scanner in = new Scanner(System.in);
		
		int i = 0;
		int opcao;
		do {			
			System.out.println("[1] Cadastrar aluno");
			System.out.println("[2] Cadastrar professor");
			System.out.println("[3] Consultar um");
			System.out.println("[4] Consultar todos");
			System.out.println("[5] Sair.");
			System.out.print("Informe a opção desejada: ");
			
			opcao = in.nextInt();
			
			if(Arrays.asList(Constante.OPCOES).contains(opcao)) {
				
				switch (opcao) {
				case 1:
					if(i < Constante.QTDE) {
						
						AlunoTP3 alu = new AlunoTP3();
						
						System.out.println("Informe o seu nome:");
						alu.setNome(in.next());
						
						System.out.println("Informe a sua idade:");
						alu.setIdade(in.nextInt());
						
						System.out.println("Informe sua mensalidade bruta:");
						alu.setMensalidade(in.nextFloat());

						System.out.println("Informe o seu bônus: ");
						alu.setBonus(in.nextFloat());
						
						System.out.println("Informe o seu desconto: ");
						alu.setDesconto(in.nextFloat());
						
						funcionarios[i] = alu;

						System.out.println("... Inclusão realizada ...");
						imprimir(i);
						System.out.println("...... com sucesso! ......");
						
						i++;
					}else {
						System.out.println("Impossivel cadastrar um novo aluno!!!");
					}					
					break;

				case 2:
					if(i < Constante.QTDE) {
						
						ProfessorTP3 prof = new ProfessorTP3();
						
						System.out.println("Informe o seu nome:");
						prof.setNome(in.next());
						
						System.out.println("Informe a sua idade:");
						prof.setIdade(in.nextInt());
						
						System.out.println("Informe o seu salário:");
						prof.setSalario(in.nextFloat());

						System.out.println("Informe se é mestre: ");
						prof.setmestre(in.nextBoolean());
						
						System.out.println("Informe a sua graduação: ");
						prof.setgraduado(in.next());
						
						
						funcionarios[i] = prof;

						System.out.println("... Inclusão realizada ...");
						imprimir(i);
						System.out.println("...... com sucesso! ......");
						
						i++;
					}else {
						System.out.println("Impossivel cadastrar um novo professor!!!");
					}					
					break;

				case 3:
					System.out.print("Informe a identificação do aluno: ");
					int id = in.nextInt();
	
					if(id >= 0 && id < i) {
						System.out.println("... aluno ...");
						imprimir(id);
						System.out.println("...................");
					}else {
						System.out.println("Identificação inválida!!!");
					}
					break;
					
				case 4:
					System.out.println("... Lista de alunos ...");
					imprimir();
					System.out.println(".............................");
					break;
				}
			}else {
				System.out.println("Opção inválida!!!");
			}
		} while (opcao != 5);

		System.out.println("Sistema finalizado com sucesso!!!");		
		System.out.println("Quantidade de alunos: " + i);
		System.out.println("Média salarial: " + calcularMediaSalarial(i));
		
		in.close();
	}
}