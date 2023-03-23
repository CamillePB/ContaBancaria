package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.util.Cores;

//import aula_06.calculos.Calculos;


public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Cores cor = new Cores();

		int opcao;
		double numero1, numero2;

		while (true) {
			System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_WHITE_BRIGHT +"****************************************************");
			System.out.println("                                                    ");
			System.out.println("                  BANCO DO BRASIL                   ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("    1 - Criar Conta");
			System.out.println("    2 - Listar");
			System.out.println("    3 - Buscar Conta por número");
			System.out.println("    4 - Atualizar Dados da Conta");
			System.out.println("    5 - Apagar Conta");
			System.out.println("    6 - Sacar");
			System.out.println("    7 - Depositar");
			System.out.println("    8 - Transferir valores entre Contas");
			System.out.println("    9 - Sair");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("                                                    "+Cores.TEXT_RESET);
			System.out.println("    Entre com a opção desejada:");
			
			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1 -> System.out.println("Criar Conta: \n\n");
			case 2 -> System.out.println("Listar: \n\\n");
			case 3 -> System.out.println("Buscar Conta por número: \n\\n");
			case 4 -> System.out.println("Atualizar Dados da Conta: \n\\n");
			default -> System.out.println("\nOpção inválida\n");
			}

		}
	}

}
