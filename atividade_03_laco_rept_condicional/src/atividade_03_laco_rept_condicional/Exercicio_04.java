package atividade_03_laco_rept_condicional;

import java.util.Scanner;
  /*4) Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da
área de Desenvolvimento e precisam de um sistema para analisar os dados. Escreva
um algoritmo em Java, que leia via teclado as seguintes informações de cada
colaborador:
● Idade (Número inteiro)
● Sexo (Número Inteiro):
o 1 – Masculino
o 2 – Feminino
o 3 – Outros
● Categoria (Número Inteiro):
o 1 – Backend
o 2 – Frontend
o 3 – Mobile
o 4 – FullStack

Após digitar a categoria, o sistema deverá perguntar ao usuário se ele deseja
continuar a leitura dos dados de um novo colaboradore ou não (S/N). Caso seja
pressionada a tecla N, mostre na tela:
● O número de pessoas desenvolvedoras Backend
● O número de mulheres desenvolvedoras Frontend
● O número de homens desenvolvedores Mobile maiores de 40 anos
● O número de mulheres desenvolvedoras FullStack menores de 30 anos
*/
public class Exercicio_04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade, sexo, categoria, backend = 0, frontend = 0, mobile = 0, full = 0;
		String continua = "S";

		while (continua.equalsIgnoreCase("s")) {

			System.out.println("Digite a idade: ");
			idade = leia.nextInt();

			System.out.println("Digite a sexo: ");
			sexo = leia.nextInt();

			System.out.println("Digite a categoria: ");
			categoria = leia.nextInt();

			if (categoria == 1)
				backend++;
			
			if (categoria == 2 && sexo == 2)
				frontend++;
			
			if (categoria == 3 && sexo == 1 && idade > 40)
				mobile++;
			
			if (categoria == 4 && sexo == 2 &&idade < 30)
				full++;

			System.out.println("Deseja continuar(S/N): ");
			leia.skip("\\R?");
			continua = leia.nextLine();// caso nao use o equalsIgnoreCase pode usar .toUpperCase();
		}
		
		System.out.println("O número de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("O número de mulheres desenvolvedoras Frontend: " + frontend);
		System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos: " + mobile);
		System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos: " + full);
	}

}