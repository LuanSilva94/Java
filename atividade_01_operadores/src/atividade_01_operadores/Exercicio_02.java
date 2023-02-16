package atividade_01_operadores;

import java.util.Scanner;

/*2)Elabore um algoritmo em Java que leia 4 notas de um participante, em variáveis do tipo float 
 * e exiba na tela a média final do participante. Veja o exemplo abaixo:
 */
public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.println("-----------------------------------------");
		System.out.println("       CALCULO DE MÉDIA       ");
		System.out.println("-----------------------------------------");
		
		System.out.print("Digite a nota da sua primeira prova: ");
		nota1 = leia.nextFloat();
		System.out.print("Digite a nota da sua segunda prova: ");
		nota2 = leia.nextFloat();
		System.out.print("Digite a nota da sua terceira prova: ");
		nota3 = leia.nextFloat();
		System.out.print("Digite a nota da sua quarta prova: ");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1+nota2+nota3+nota4)/4;
		System.out.printf("Sua média final é: %.1f", mediaFinal);
	
	}

}
