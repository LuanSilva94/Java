package atividade_06_estruturaDeDados;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/*2)Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, para organizar a retirada de livros em uma pilha. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
	1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
	2: Listar todos os livros da Pilha
	3: Retirar um livro da pilha 
	0: O programa deve ser finalizado. 
	Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.
	*/
public class exercicio_02_Pilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		String livro = null;
		int opcao = 0;
		
		do {
			System.out.println("--------------------------------------------");
			System.out.println("Controle de Retirada de livro da pilha: ");
			System.out.println("1 - Adicionar um novo livro na pilha.");
			System.out.println("2 - Listar todos os livros da Pilha");
			System.out.println("3 - Retirar um livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("--------------------------------------------");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Adicionar livro na pilha: ");
				System.out.println("Qual o nome do livro: ");
				pilha.push( livro = leia.next());
				System.out.println("Livro adicionado com sucesso!");
				break;
			case 2:
				System.out.println("Listar de todos os Livros: ");

				if (pilha.isEmpty())
					System.out.println("Pilha vazia!");
				else
					pilha.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Remover um Livro da Pilha: ");
				if (pilha.isEmpty())
					System.out.println("Pilha de Livros vazia!");
				else
					pilha.pop();
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
