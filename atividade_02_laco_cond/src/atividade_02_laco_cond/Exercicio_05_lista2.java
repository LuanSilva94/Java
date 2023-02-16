package atividade_02_laco_cond;

import java.util.Scanner;

/*   05)Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um i
 *   tem (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro).
 *   A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.
 */

public class Exercicio_05_lista2 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
        
		int quantidade,produto;
		
		System.out.println("------------------------------------------------");
		System.out.println("                LANCHONETE                 ");
		System.out.println("------------------------------------------------");
		System.out.println("------------------------------------------------");	
		System.out.println("------------------------------------------------");
		System.out.println("                  CARDÁPIO                    ");
		System.out.println("------------------------------------------------");
		System.out.println("CÓDIGO |    PRODUTO    |  PREÇO");
		System.out.println("------------------------------------------------");
		System.out.println("      1       |   HOT DOG      |R$10,00 ");
		System.out.println("      2       |   X-SALADA     |R$15,00 ");
		System.out.println("      3       |   X-BACON      |R$18,00 ");
		System.out.println("      4       |   BAURU          |R$12,00 ");
		System.out.println("      5       |   SODA            |R$8,00   ");
		System.out.println("      6       |   JUICE            |R$13,00 ");
		System.out.println("------------------------------------------------");
		System.out.print("Digite o código do produto: ");
		produto = leia.nextInt();
		System.out.print("Digite a quantidade que deseja: ");
		quantidade = leia.nextInt();

		
		switch(produto) {
		case 1:
			System.out.println("Produto: HOT DOG \nValor total: R$" +(10*quantidade));
			break;
		case 2:
			System.out.println("Produto: X-SALADA \nValor total: R$" +(15*quantidade));	
			break;
		case 3:
			System.out.println("Produto: X-BACON \nValor total: R$" +(18*quantidade));
			break;
		case 4:
			System.out.println("Produto: BAURU \nValor total: R$" +(12*quantidade));
			break;
		case 5:
			System.out.println("Produto: SODA \nValor total: R$" +(8*quantidade));
			break;
		case 6:
			System.out.println("Produto: JUICE \nValor total: R$" +(13*quantidade));
			break;
		default:
			System.out.println("Código inválido, por favor faça o pedido novamente");
		}
		
		
		leia.close();
	}

}
