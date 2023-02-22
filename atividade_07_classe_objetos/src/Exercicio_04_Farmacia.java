import java.util.ArrayList;
import java.util.Scanner;

import Classes.Farmacia;

public class Exercicio_04_Farmacia {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Farmacia> medicamentos = new ArrayList<Farmacia>();

		long id;
		String nome, nomeComercial, fabricante, foto, opcao;
		float preco;

		do {

			System.out.print("\nId: ");
			id = leia.nextLong();

			System.out.print("\nNome: ");
			leia.skip("\\R?");
			nome = leia.nextLine();

			System.out.print("\nNome Comercial: ");
			nomeComercial = leia.nextLine();

			System.out.print("\nFabricante: ");
			fabricante = leia.nextLine();

			System.out.print("\nFoto: ");
			foto = leia.nextLine();

			System.out.print("\nPreço: ");
			preco = leia.nextFloat();

			Farmacia f1 = new Farmacia(id, nome, nomeComercial, fabricante, foto, preco);

			medicamentos.add(f1);

			System.out.println("\nDeseja continuar? ");
			leia.skip("\\R?");
			opcao = leia.nextLine();

		} while (opcao.equalsIgnoreCase("S"));

		for (var medicamento : medicamentos)
			medicamento.visualizar();

		// Farmacia f2 = new Farmacia(2, "Paracetamol", "Tylenol", "Neo Quimica", "-",
		// 20.0f);

		// f1.visualizar();

		// f2.visualizar();

		leia.close();
	}
}
