package atividade_05_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*  3)Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer.
 *  O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos 
 *  e adicione-os individualmente na Collection Set. Em seguida, faça o que se pede:
 *  - Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator.	
 */

public class Exercicio_03_collections_Set {

	public static void main(String[] args) {

		Set<Integer> number = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		int num = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			if (num <= 10 && num > 0) {
				number.add(num);
			} else {
				System.out.println("Digite um valor entre 1 e 10");
			}

		}

		System.out.println("Lista de Dados set: ");
		Iterator<Integer> iNum = number.iterator();

		while (iNum.hasNext())
			System.out.println(iNum.next());
	}
}
