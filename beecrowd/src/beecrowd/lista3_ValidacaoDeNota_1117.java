package beecrowd;

import java.util.Scanner;

public class lista3_ValidacaoDeNota_1117 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float nota, media;
		int totalN= 0, total = 0;
		
		while(totalN != 2) {			
		System.out.println("Digite sua nota: ");	
		nota = sc.nextFloat();
		if(nota >= 0.0 && nota <=10.0) {
			total += nota;
			totalN += 1;
		}else {
			System.out.println(" Nota Inválida ! \n");
		}
		}
		
		media = total / 2;
		
		System.out.println("Sua média é: "  + media);
	
	}

}
