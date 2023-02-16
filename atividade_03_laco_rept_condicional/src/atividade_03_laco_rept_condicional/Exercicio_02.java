package atividade_03_laco_rept_condicional;

import java.util.Scanner;


  /*2)Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na
 tela quantos números são pares e quantos número são ímpares. Veja o exemplo
 abaixo:*/

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, contPar = 0, contImpar = 0;

		for (int cont = 1; cont <= 10; cont++) {
			System.out.print("Digite o " + cont + "º número");
			num = leia.nextInt();
			if (num % 2 == 0) {
				contPar++;
			}
			if (num % 2 == 1) {
				contImpar++;
			}
		}
		System.out.println("Total de números pares: " + contPar + "\nTotal de números impares: " + contImpar);
	}
}
