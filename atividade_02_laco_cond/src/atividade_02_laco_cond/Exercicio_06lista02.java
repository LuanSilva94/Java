package atividade_02_laco_cond;

import java.util.Scanner;

public class Exercicio_06lista02 {

	/*
	 * 06)Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do
	 * Colaborador (String), o Código do Cargo do Colaborador (número inteiro de 1 a
	 * 6) e o Salário (número float). A seguir, mostre na tela o Nome do
	 * Colaborador, o Cargo e o novo Salário reajustado.
	 */

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int cargo;
		String nome;
		float salario;

		System.out.println("------------------------------------------------------------------------------------- ");
		System.out.println("COD. CARGO |      CARGO      |  PORCENTUAL DE REAJUSTE ");
		System.out.println("------------------------------------------------------------------------------------- ");
		System.out.println("       1          |      GERENTE                    |           10%                   ");
		System.out.println("       2          |      VENDEDOR                 |              7%                  ");
		System.out.println("       3          |      SUPERVISOR              |              9%                  ");
		System.out.println("       4          |      MOTORISTA                 |              6%                  ");
		System.out.println("       5          |      ESTOQUISTA               |              5%                  ");
		System.out.println("       6          |      TÉCNICO DE TI            |             8%                  ");
		System.out.println("------------------------------------------------------------------------------------- ");

		System.out.print("Digite o nome do colaborador: ");
		nome = leia.nextLine();
		System.out.print("Cargo: ");
		cargo = leia.nextInt();
		System.out.print("Sálario: ");
		salario = leia.nextFloat();

		switch (cargo) {
		case 1:
			System.out.printf("Nome do colaborador: " + nome + "\nCargo: Gerente \nSalário: R$%.2f",
					(salario + salario * 0.1));
			break;
		case 2:
			System.out.printf("Nome do colaborador: " + nome + "\nCargo: Vendedor \nSalário: R$%2f",
					(salario + salario * 0.07));
			break;
		case 3:
			System.out.printf("Nome do colaborador: " + nome + "\nCargo: Supervisor \nSalário: R$%2f",
					(salario + salario * 0.09));
			break;
		case 4:
			System.out.printf("Nome do colaborador: " + nome + "\nCargo: Motorista \nSalário: R$%.2f",
					(salario + salario * 0.06));
			break;
		case 5:
			System.out.printf("Nome do colaborador: " + nome + "\nCargo: Estoquista \nSalário: R$%.2f",
					(salario + salario * 0.05));
			break;
		case 6:
			System.out.printf("Nome do colaborador: " + nome + "\nCargo: Técnico de TI \nSalário: R$%.2f",
					(salario + salario * 0.08));
			break;

		default:
			System.out.println("Código inválido, por favor repita o processo");
		}

		leia.close();
	}

}
