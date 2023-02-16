package atividade_01_operadores;

import java.util.Scanner;

//1)Atividade :Dado o Fluxograma abaixo, desenvolva o algoritmo abaixo na Linguagem Java:
public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("-----------------------------------------");
		System.out.println("          CALCULO ABONO         ");
		System.out.println("-----------------------------------------");
	
		
		float salario, abono, novoSalario = 0;
		
		System.out.print("Digite seu salário: R$");
		salario = leia.nextFloat();
		System.out.print("Digite seu abono: R$");
		abono = leia.nextFloat();
		novoSalario = salario + abono;
		System.out.printf("Seu novo salário é: R$ %.2f",  novoSalario);
	}

}
