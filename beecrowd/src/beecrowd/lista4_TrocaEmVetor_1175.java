package beecrowd;

import java.util.Scanner;

public class lista4_TrocaEmVetor_1175 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int troca;
		int[] N = new int [10];
		
		for (int c=0; c < N.length; c++) {
			System.out.print("Entre com o valor: ");
            N[c] = sc.nextInt();
        }
		
		for (int c=0; c < (N.length / 2); c++) {
        	troca = N[c];
        	N[c] = N[N.length - 1- c];
        	N[N.length - 1 - c] = troca;
        }
		
		for (int c=0; c < N.length; c++) {
            System.out.println("N["+ c +"] = " + N[c]);
        }

	}

}
