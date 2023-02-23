import java.util.ArrayList;
import java.util.Scanner;

import Classes.Farmacia;
import Classes.Medicamento;
import Classes.Perfumaria;

public class Exercicio_04_Farmacia {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Farmacia> farmacia = new ArrayList<Farmacia>();

		long id;
		String nome, nomeComercial, fabricante, foto, opcao, principioAtivo, fragrancia;
		float preco;
		int tipo;

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

			System.out.print("\nTipo: ");
			tipo = leia.nextInt();

			switch (tipo) {
			case 1 -> {
				System.out.print("\nPrincipio ativo: ");
				leia.skip("\\R?");
				principioAtivo = leia.nextLine();

				Medicamento m1 = new Medicamento(id, nome, nomeComercial, fabricante, foto, preco, tipo,
						principioAtivo);

				farmacia.add(m1);
			}
			case 2 -> {
				System.out.print("\nPrincipio ativo: ");
				leia.skip("\\R?");
				fragrancia = leia.nextLine();

				Perfumaria p1 = new Perfumaria(id, nome, nomeComercial, fabricante, foto, preco, tipo, fragrancia);

				farmacia.add(p1);
							}	
			}

			System.out.println("\nDeseja continuar? ");
			leia.skip("\\R?");
			opcao = leia.nextLine();

		} while (opcao.equalsIgnoreCase("S"));

		for (var produto : farmacia) {
			produto.reajuste(0.10f);
			produto.visualizar();
			
		}
		leia.close();
	}
}
