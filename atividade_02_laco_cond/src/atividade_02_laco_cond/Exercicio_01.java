package atividade_02_laco_cond;

import java.util.Scanner;

/*   1 )Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a
 *   soma de A + B é maior, menor ou igual a C.
 */

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double valorA, valorB,valorC;
		
		System.out.print("Digite o número A: ");
		valorA = leia.nextDouble();
		System.out.print("Digite o número B: ");
		valorB = leia.nextDouble();
		System.out.print("Digite o número C: ");
		valorC = leia.nextDouble();
		
		if((valorA + valorB) > valorC)
			System.out.println("A Soma de A + B é Maior do que C");
		else if ((valorA + valorB) < valorC)
			System.out.println("A Soma de A + B é Menor do que C");
		else
			System.out.println("A Soma de A + B é igual a C");
		
		leia.close();
	}

}
