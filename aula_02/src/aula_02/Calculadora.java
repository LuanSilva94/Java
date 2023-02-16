package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;
//Utilizando a classe Math
public class Calculadora {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("##.####");
		Scanner leia = new Scanner(System.in);
		
		double n1,n2;
		System.out.print("Digite o primeiro número: ");
		n1 = leia.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		n2 = leia.nextDouble();
		
		System.out.println("O número " + n1 + " mais o número " + n2 + " é igual a "+ (n1 +  n2) );
		System.out.println("O número " + n1 + " menos o número " + n2 + " é igual a "+ (n1 -  n2) );
		System.out.println("O número " + n1 + " vezes o número " + n2 + " é igual a "+ (n1 *  n2) );
		if(n2 != 0)
		   System.out.println("O número " + n1 + " dividido pelo número " + n2 + " é igual a "+ (n1 /  n2) );
		else
			System.out.println("Não é possivel dividir por zero!");
		
		System.out.println("O número " + n1 + " elevado ao número " + n2 + " é igual a "+ Math.pow(n1, n2) );
		System.out.println("A raiz quadrada do número " + n1 + " é igual a  "+ df.format(Math.sqrt(n1)) );
		System.out.println("\n");
		
		//operadores de incremento
		System.out.println("Pré incremento");
		System.out.println(n1);
		System.out.println(++ n1);
		
		System.out.println("Pós incremento");
		System.out.println(n2);
		System.out.println(n2 ++);
		System.out.println(n2);
		System.out.println("\n");
		
		//operadores de atribuição
		System.out.println(n1 = n1+n2);
		System.out.println(n1 += n2);
		
				
		leia.close();
	}

}
