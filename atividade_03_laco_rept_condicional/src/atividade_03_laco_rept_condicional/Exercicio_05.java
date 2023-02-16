package atividade_03_laco_rept_condicional;

import java.util.Scanner;

 /*3) Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos
e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve
ser finalizada ao digitar uma idade negativa. Veja o exemplo abaixo:
*/
public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num,soma=0, cont=0;
		
		do{
            System.out.println("Digite um número: ");
            num = leia.nextInt();
            
            if(num >= 0){ 
                soma = num + soma; 
                cont++; 
            }
        } while(num != 0);
        
        System.out.println("A soma é " + soma); 
        
    }

}


