import java.util.Locale;
import java.util.Scanner;

public class Area_circulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		final double pi = 3.14159;
		
		Double raio=sc.nextDouble();
		Double Area = (pi*Math.pow(raio,2));
		
		System.out.printf("A = %.4f",Area);
		
		sc.close();
	}

}
