package variaveis_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		DecimalFormat df  = new DecimalFormat("###.##");
		Scanner leia = new Scanner(System.in);
		
		int numero = 10;
		String nome = "Luan Souza Silva";
		double area = 45.6589238;
		int telefone;
		String estado;
		String cidade;
		double peso;
		
		System.out.println("O nome do participante é: " + nome);
		System.out.println("O número é: "+ numero);
		System.out.printf("A área é: %.3f\n", area);
		
		System.out.println("O numero é: " + df.format(area));
		
		System.out.println("Qual seu telefone: ");
		telefone = leia.nextInt();
		System.out.println("Qual estado você mora: ");
		leia.skip("\\R?");
		estado = leia.nextLine();
		System.out.println("Qual cidade você mora: ");
		cidade = leia.nextLine();
		System.out.println("Qual seu peso: ");
		peso = leia.nextDouble();
				
	}

}
