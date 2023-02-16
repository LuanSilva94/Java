package atividade_01_operadores;

import java.util.Scanner;

/*3)Elabore um algoritmo em Java, que leia o Salário Bruto, o Adicional Noturno, as Horas Extras 
 * e os Descontos de um Colaborador, em variáveis do tipo float e exiba na tela o 
 * Salário Líquido. Veja o exemplo abaixo:
 */

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, addNoturno, horasExtras,  salarioLiquido;
		final float desconto = 200;
		
		System.out.println("-----------------------------------------");
		System.out.println("     CALCULANDO SALARIO    ");
		System.out.println("-----------------------------------------");
		
		System.out.print("Digite seu salário: R$");
		salarioBruto = leia.nextFloat();
		System.out.print("Digite o valor do seu adicional noturno: R$");
		addNoturno = leia.nextFloat();
		System.out.print("Digite o valor das suas horas extras: R$");
		horasExtras = leia.nextFloat();
		
		salarioLiquido=(salarioBruto+addNoturno+(horasExtras*5))-desconto;
		System.out.printf("O seu salário liquído é: R$%.2f",salarioLiquido);
		
	}

}
