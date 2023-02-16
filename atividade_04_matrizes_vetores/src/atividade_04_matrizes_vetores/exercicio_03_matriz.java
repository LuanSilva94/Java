package atividade_04_matrizes_vetores;

import java.util.Scanner;

public class exercicio_03_matriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int dp = 0, ds = 0;
		
		for(int indice = 0; indice < matriz.length; indice ++) {
			System.out.print("Entre com os valores da matriz : ");
			matriz [indice][indice] = leia.nextInt();
			System.out.println("Diagonal principal: " + matriz[indice][indice]);
			dp += matriz[indice][indice];
		}
		
		System.out.println("Soma dos elementos da Diagonal Principal: "+ dp);
		
		for(int indice = 0; indice < matriz.length; indice ++) {
			System.out.println("Diagonal Secundária: " + matriz[indice][matriz.length - 1 - indice]);
			ds += matriz[indice][matriz.length - 1 - indice];
		}
		
		System.out.println("Soma dos elementos da Diagonal Secundaria: "+ ds);
		
		leia.close();
	}

}
