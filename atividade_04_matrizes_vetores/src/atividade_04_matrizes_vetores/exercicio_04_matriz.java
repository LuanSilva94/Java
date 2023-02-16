package atividade_04_matrizes_vetores;

import java.util.Scanner;

/*  4)Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano.
  *  As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais, logo cada linha da matriz 
  *  serão as notas de um participante. Em um vetor de números reais, armazene as médias de cada participante e 
  *  exiba as médias de cada um na tela.
  */

public class exercicio_04_matriz {

	public static void main(String[] args) {
		float matriz[][] = new float[10][4];
		float media[] = new float[10];
		float soma = 0.0f;

		Scanner leia = new Scanner(System.in);

		for (int linha = 0; linha < matriz.length; linha++) {
			
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				
					System.out.println("Digite a nota: ");
					matriz[linha][coluna]=leia.nextFloat();
					
			}
		}
		
for (int linha = 0; linha < matriz.length; linha++) {
			
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				
					soma += matriz[linha][coluna];
					
			}
			
			media[linha] = soma / matriz[linha].length;
			soma = 0.0f;
			
		}
		
		for(var medias : media)
			System.out.print(medias);

		leia.close();
	}

}
