package aula_04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) throws InterruptedException {

		int vetorInteiro[] = { 1, 2, 3, 4, 5 };

		Scanner leia = new Scanner(System.in);

		float[] vetorFloat = new float[5];

		for (int contador = 0; contador < vetorInteiro.length; contador++) {
			System.out.println("posição " + contador + " = " + vetorInteiro[contador]);
			Thread.sleep(500);
	}
		for (int indice = 0; indice < vetorFloat.length; indice++) {
			System.out.println("Digite um valor para a posição [" + indice + "]");
			vetorFloat[indice] = leia.nextFloat();
		}
		
		Arrays.sort(vetorFloat);
		
		for(float numero : vetorFloat)
			System.out.println(numero);
		/*for it: serve so para estrutura de dados, os
		 * dois pontos que substituem o contador e  
		 * contador++
	     */
	}
}