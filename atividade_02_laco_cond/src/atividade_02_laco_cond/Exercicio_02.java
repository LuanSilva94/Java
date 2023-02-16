package atividade_02_laco_cond;

import java.util.Scanner;

/*   2) Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na 
 *   tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo. Veja os exemplos abaixo:
 */

public class Exercicio_02 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		int num, par, impar, mais, menos;
		
		System.out.print("Digite um número: ");
		num = leia.nextInt();
				
		if (num %2 == 0 && num >= 0) {
			System.out.println("O número " +num+ " é par e positivo");
		}else if(num %2 ==0 && num <0) {
			System.out.println("O número " +num+ " é par e negativo");
		}else if(num %2 !=0 && num >=0) {
			System.out.println("O número " +num+ " é impar e positivo");
		}else {
			System.out.println("O número " +num+ " é impar e negativo");
		}
		leia.close();

	}

}
