package atividade_05_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio_01_collection_Arraylist {
	/*
	 * 01)Escreva um programa Java para criar uma Collection ArrayList de Objetos da
	 * Classe String. O programa deverá solicitar ao usuário, que ele digite via
	 * teclado 5 cores e deverá adicioná-las individualmente no ArrayList. Em
	 * seguida, faça o que se pede: Mostre na tela todas as cores que foram
	 * adicionadas. Mostre na tela todas as cores que foram adicionadas ordenadas em
	 * ordem crescente.
	 */

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String cor = null;

		for (int i = 0; i < 3; i++) {
			System.out.print("\nEntre com uma cor: ");
			cor = leia.next();
			cores.add(cor);

		}
		System.out.println("\nListar todas as cores: ");
		cores.forEach(System.out::println);

		System.out.println("Ordenar cores: ");
		Collections.sort(cores);
		cores.forEach(System.out::println);
	}

}
