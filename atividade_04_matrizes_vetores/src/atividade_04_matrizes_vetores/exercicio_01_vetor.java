package atividade_04_matrizes_vetores;

import java.util.Scanner;

/*  1)Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo
 *  que consiga pesquisar dados no vetor, onde o usuário irá digitar um número e o programa deve 
 *  exibir na tela a posição deste número no vetor. Caso o número não seja encontrado, a mensagem:
 *  “Não foi encontrado!” deve ser exibida na tela. Veja os exemplos abaixo:
 */

public class exercicio_01_vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int vetorInt[] = { 13, 42, 7, 21, 9, 66, 49, 94, 101,70 };
		int num;
		
		System.out.println("Digite o número que deseja encontrar: ");
		num = leia.nextInt();
		
		for (int cont = 0; cont < vetorInt.length; cont++) {
			
			if(num == vetorInt[cont]) {
				System.out.printf("O número %d está localizado na posição %d\n", num, cont);
				return;
		}
			else if(vetorInt.length -1 == cont && vetorInt[cont] != num)	
				System.out.println("O número " + num + " não foi encontrado");
			}
	
		leia.close();
	}
}