
import Classes.Console;
import Classes.Jogo;

public class Exercicio_03_lojaGames {

	public static void main(String[] args) {
		
		Jogo game1 = new Jogo("Fifa 23", "game", 99.00f, 1, 2023, "ps5","Eletronic Arts");
		Jogo game2 = new Jogo("Gta5", "game", 120.00f, 1, 2013, "ps3","Rockstar Gamms");
		
		game1.toView();
		game2.toView();
		
		Console cons1 = new Console("Playstation 5", "console", 4500.00f, 1, 2020, 8, "Sony");
		Console cons2 = new Console("XBOX Series", "console", 4200.00f, 1, 2020, 8, "Microsoft");
		
		cons1.toView();
		cons2.toView();
	}

}
