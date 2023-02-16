package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>();
		// wrapper, deixa de ser um número primitvo e passa a ser um objeto;

		int opcao = 0;

		double nota = 0;

		do {

			System.out.println("1 - Cadastrar nota");
			System.out.println("2 - Listar notas");
			System.out.println("3 - Buscar uma nota");
			System.out.println("4 - Remover uma nota");
			System.out.println("5 - Alterar uma nota");
			System.out.print("Digite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite uma nota entre 1 e 10: ");
				nota = leia.nextDouble();
				notas.add(nota);
				// o add é um método da collections;
				break;
			case 2:
				System.out.println("Lista todas as Notas: ");
				
				if(notas.isEmpty())
						System.out.println("Base de dados vazia!");
				else
						notas.forEach(System.out::println);
				/*simplificação do for it, os dois pontos dizem
				que voce esta usando o metodo println de forma
				implicita (simplificação)*/
				
				break;
			case 3:
				System.out.println("Procurar uma Nota: ");
				System.out.println("Digite uma Nota: ");
				nota = leia.nextDouble();

				System.out.println("A nota " + nota + " existe? " + notas.contains(nota));

				if (notas.contains(nota))
					System.out.println("O indice da minha nota é: " + notas.indexOf(nota));
				// O ArrayList permite repetir dado no caso se usar indexOf, ele sempre vai
				// mostra a primeira nota
				break;

			case 4:
				System.out.println("Remover uma nota: ");
				System.out.println("Digite a nota: ");
				nota = leia.nextDouble();
				notas.remove(nota);
				break;
				
			case 5:
				System.out.println("Atualizar uma nota");
				System.out.println("Digite a nota atual: ");
				nota = leia.nextDouble();
				System.out.print("Digite a nova nota: ");
				double notaNova = leia.nextDouble();
				notas.set(notas.indexOf(nota), notaNova);
				break;
				
			default:
				if(opcao > 6)
				System.out.print("Opção inválida! Por favor digite novamente: ");
				break;
			}

		} while (opcao != 6);

		leia.close();
	}

}
