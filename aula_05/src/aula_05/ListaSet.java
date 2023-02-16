package aula_05;

import java.util.HashSet;
import java.util.Set;

public class ListaSet {

	public static void main(String[] args) {
		
		Set<Double> notas = new HashSet<Double>();
		/*o método set não repete dados, e colocou na ordem 
		que quis */
		
		notas.add(7.0);
		notas.add(6.0);
		notas.add(2.0);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(20.0);
		
		System.out.println("Listando todas as notas: ");		
		notas.forEach(System.out::println);
		
		System.out.println("Removendo uma nota: ");		
		notas.remove(20.0);
				
		notas.forEach(System.out::println);
		
		System.out.println("A nota 7 existe: " + notas.contains(7.0));
		
		for (var nota : notas)
				System.out.println(nota.hashCode());
		/* hashcode é um código que mostra como é ordenado os numeros
		e graças a esse modelo não existe repetição com hash*/
	}

}
