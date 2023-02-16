package atividade_01_operadores;

import java.util.Scanner;

/*4)Leia quatro valores int (n1, n2, n3, n4). A seguir, calcule e mostre a diferença do 
 * produto entre o n1 e n2 pelo produto entre o n3 e o n4. Veja os exemplos abaixo:
 */
public class Exercicio_04 {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
		
		int num1,num2,num3,num4, productA, productB;
		
		System.out.println("-----------------------------------------------");
		System.out.println("     MOSTRANDO DIFERENÇAS     ");
		System.out.println("-----------------------------------------------");
		
		System.out.print("Digite o primeiro valor: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo valor: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro valor: ");
		num3 = leia.nextInt();
		System.out.print("Digite o quarto valor: ");
		num4 = leia.nextInt();
		
		productA = num1*num2;
		productB = num3*num4;
		
		System.out.print("A diferença é: " + (productA - productB));
				
				

	}

}
