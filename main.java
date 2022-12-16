import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Bem vindo a calculadora profissional");

		Desenvolvedor desenvolvedor = new Desenvolvedor();

		System.out.println("Digite o nome do desenvolvedor: ");
		desenvolvedor.nome = teclado.nextLine();

		System.out.println("Digite a quantidade de horas disponíveis do desenvolvedor");
		desenvolvedor.qtdHorasDisponiveis = teclado.nextDouble();
		
		System.out.println("Digite o salário mensal desejado do desenvolvedor");
		desenvolvedor.salarioMensalDesejado = teclado.nextDouble();
		teclado.nextLine();

		desenvolvedor.calculaValorHora();

		ArrayList<ItemSistema> sistemas = new ArrayList<>();

		while (true) {
 			ItemSistema sistema = new ItemSistema();
			String querContinuar;

			System.out.println("===================================================");

			System.out.println("==============Qual o nome do sistema?==============");
			sistema.nome = teclado.nextLine();

			System.out.println("==============Qual o tipo do sistema?==============");
			System.out.println("1 = Telas com entradas e saídas de dados");
			System.out.println("2 = Telas de consultas com informação de dados");
			System.out.println("3 = Gravação de dados");
			sistema.tipo = teclado.nextInt();

			System.out.println("==========Qual a complexidade do sistema?===========");
			System.out.println("1, 2 ou 3");
			sistema.complexidade = teclado.nextInt();
			teclado.nextLine();

			System.out.println("==============Quer inserir outro item?==============");
			System.out.println("'s' ou 'n'");
			querContinuar = teclado.nextLine();

			sistemas.add(sistema);

			if (!querContinuar.equals("s")) {
				break;
			}
		}

		Orcamento orcamentoFinal = new Orcamento();
		orcamentoFinal.desenvolvedor = desenvolvedor;

		for (ItemSistema sistema : sistemas) {
			orcamentoFinal.totalHoras += sistema.calculaQtdHoras();
		}

		Double valorFinal = orcamentoFinal.totalHoras * orcamentoFinal.desenvolvedor.calculaValorHora();
		orcamentoFinal.valorFinal = (valorFinal * 0.3) + valorFinal;

		System.out.println("O valor final do projeto é de R$" + orcamentoFinal.valorFinal);
	}
}