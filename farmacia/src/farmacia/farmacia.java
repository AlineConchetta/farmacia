package farmacia;

import java.util.Scanner;

import farmacia.util.Cores;
import farmacia.model.Produto;
import farmacia.model.Medicamento;
import farmacia.model.Cosmetico;

public class farmacia {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		int id;
		int tipo;
		String nome;
		float preco;
		
		while(true)
			System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.TEXT_CYAN
			       	        + "***********************************************");	
			System.out.println("                                               ");
			System.out.println("                SUA FARMACINHA                 ");
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println("               1 - Criar produto               ");
			System.out.println("          2 - Listar todos os produtos         ");
			System.out.println("         3 - Consultar produtos por Id         ");
			System.out.println("             4 - Atualizar produto             ");
			System.out.println("              5 - Deletar produto              ");
			System.out.println("                    6 - Sair                   ");
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println("Entre com a opção desejada:                    ");
			System.out.println("                                               ");
			
			opcao = leia.nextInt();
			
			if(opcao == 6) {
				System.out.println("\n A Sua Farmacinha - Seu remédinho está aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_CYAN_BOLD + "Criar produto\n\n");
				
				System.out.println("Digite o ID do produto: ");
				id = leia.nextInt();
				

				System.out.println("Digite o tipo do produto: ");
				leia.skip("\\R");
				tipo = leia.nextLine();
				
				do {
					System.out.println("Digite o tipo de produto (1 - MED ou 2 - COS): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o saldo da conta: ");
				preco = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o tipo do produto: ");
					tipo = leia.nextInt();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}

				case 2 -> {
					System.out.println("Digite o dia de aniversário da conta: ");
					aniversario = leia.nextInt();
					contas.cadastrar(
							new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
				}
				}
				
				
				break;
				
			case 2:
				System.out.println(Cores.TEXT_CYAN_BOLD + "Listar todos os produtos\n\n");
				
				break;
				
			case 3:
				System.out.println(Cores.TEXT_CYAN_BOLD + "Consultar produtos por Id\n\n");
				
				break;
				
			case 4:
				System.out.println(Cores.TEXT_CYAN_BOLD + "Atualizar produto\n\n");
				
				break;
			
			case 5:
				System.out.println(Cores.TEXT_CYAN_BOLD + "Deletar produto\n\n");
				
				break;				
				
			default:
				System.out.println(Cores.TEXT_CYAN_BOLD + "\nOpção inválida!\n");
				
				break;
			}
	}

	public static void sobre() {
		System.out.println("\n********************************************");
		System.out.println("Projeto desenvolvido por: Aline Conchetta");
		System.out.println("SUA FARMACINHA - alineconchetta@gmail.com");
		System.out.println("github.com/AlineConchetta");
		System.out.println("\n********************************************");
	}
}
