package aula_03;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num;
		boolean ok = false;
		String continua;

		do {
			do {
	
				System.out.println("Digite a Tabuada que deseja calcular: ");
				num = leia.nextInt();
	
				if (num < 1 || num > 10)
					System.out.println("Digite um numero entre 1 e 10");
				else
					ok = true;
	
			} while (ok == false);
	
			for (int contador = 1; contador <= 10; contador++) {
				System.out.println("\n" + num + " x " + contador + " = " + (num * contador));
			}
			
			ok = false;
			
			System.out.println("Deseja contiuar(S/N)?:  ");
			leia.skip("\\R?");
			continua = leia.nextLine();
			
		}while(continua.equalsIgnoreCase("S"));
	
			leia.close();
		}
	
	}
