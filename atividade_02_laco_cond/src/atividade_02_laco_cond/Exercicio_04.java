package atividade_02_laco_cond;

import java.util.Scanner;

  /*  4)Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características de um tipo de animal
   *  possível segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.
   */

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String animal01, animal02, animal03;

		System.out.println("Digite o primeiro animal");
		leia.skip("\\R?");
		animal01 = leia.nextLine();

		System.out.println("Digite o segunda animal");
		leia.skip("\\R?");
		animal02 = leia.nextLine();

		System.out.println("Digite o terceiro animal");
		leia.skip("\\R?");
		animal03 = leia.nextLine();

		if (animal01.equals("vertebrado")) {
			if (animal02.equals("ave")) {
				if (animal03.equals("carnivoro"))
					System.out.println("águia");
				else
					System.out.println("pomba");
			} else {
				if (animal03.equals("onivoro"))
					System.out.println("homem");
				else
					System.out.println("vaca");
			}
		} else {
			if (animal02.equals("inseto")) {
				if (animal03.equals("hematofago"))
					System.out.println("pulga");
				else
					System.out.println("lagarta");
			} else {
				if (animal03.equals("hematofago"))
					System.out.println("sanguessuga");
				else
					System.out.println("minhoca");
			}
		}
	}

}
