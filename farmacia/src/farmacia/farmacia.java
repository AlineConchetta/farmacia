package farmacia;

import java.util.Scanner;
import farmacia.util.Cores;

public class farmacia {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
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
				System.out.println(Cores.TEXT_CYAN + "Criar produto\n\n");
				
				break;
				
			case 2:
				System.out.println("Listar todos os produtos\n\n");
				
				break;
				
			case 3:
				System.out.println("Consultar produtos por Id\n\n");
				
				break;
				
			case 4:
				System.out.println("Atualizar produto\n\n");
				
				break;
			
			case 5:
				System.out.println("Deletar produto\n\n");
				
				break;				
				
			default:
				System.out.println("\nOpção inválida!\n");
				
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
