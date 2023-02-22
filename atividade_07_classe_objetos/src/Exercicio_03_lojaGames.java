
import Classes.ClasseProduto;

public class Exercicio_03_lojaGames {

	public static void main(String[] args) {
		ClasseProduto product1 = new ClasseProduto("Fifa 23", "gamme", 99.00f, 1, 2023);
		ClasseProduto product2 = new ClasseProduto("Dual shock 2", "controller", 150.00f, 2, 2022);
		
		product1.toView();
		product2.toView();
	}

}
