package aula_Metodos;

import static aula_Metodos.pacote2.Classe2.*;

import java.util.Scanner;

public class Testa_metodos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int A = 0, B = 0;

		metodoPublic();
		metodoPadrao();
		metodoProtegido();
		metodoPrivado();

		Classe1.metodoPublic1();
		Classe1.metodoFriendly1();
		Classe1.metodoProtegido1();
		// Classe1.metodoPrivado();

		metodoPublicoPacote1();
		//metodoFriendlyPacote1();
		//metodoProtegidoPacote1();
		//metodoPrivadoPacote1();
		/*Em outro pacote e outra classe só e possivel usar metodos publicos*/
		
		System.out.println("\nEntre com os valore de A e B: ");
		System.out.println(soma(A = leia.nextInt(), B = leia.nextInt()));
	}

	public static void metodoPublic() {
		System.out.println("Eu sou um método público!");
	}

	public static int soma(int num1, int num2) {
		System.out.print("A soma do número A + B é: ");
		return num1 + num2;
	}

	static void metodoPadrao() {
		System.out.println("Eu sou um método Friendly!");
	}

	protected static void metodoProtegido() {
		System.out.println("Eu sou um método Protegido!");
	}

	private static void metodoPrivado() {
		System.out.println("Eu sou um método Privado!");
	}
}
