package atividade_06_estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*1)Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos 
	 * da Classe String, para organizar a ordem de chegada dos Clientes de um Banco.
	 *  O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
	 *  
	1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
	2: Listar todos os Clientes na fila
	3: Chamar (retirar) uma pessoa da fila 
	0: O programa deve ser finalizado. 
	
	Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..
	 */

public class exercicio_01_Fila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao = 0;
		String nome = null;

		do {
			System.out.println("--------------------------------------------");
			System.out.println("Controle de Clientes em Fila: ");
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os Slientes");
			System.out.println("3 - Retirar cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("--------------------------------------------");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Adicione um cliente: ");
				((LinkedList<String>) fila).push(nome = leia.next());
				System.out.println("Cliente adicionado com sucesso!");
				break;
			case 2:
				System.out.println("Lista de todas os Clientes: ");

				if (fila.isEmpty())
					System.out.println("Lista de Clientes vazia!");
				else
					fila.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Remover um Cliente da fila: ");
				if (fila.isEmpty())
					System.out.println("Lista de Clientes vazia!");
				else
					System.out.println(fila.poll());
				break;
			default:
				if (opcao > 3)
					System.out.println("Opção inválida! Por favor digite novamente: ");
				break;
			}

		} while (opcao != 0);
		System.out.println("Programa finalizado!");

		leia.close();

	}

}
