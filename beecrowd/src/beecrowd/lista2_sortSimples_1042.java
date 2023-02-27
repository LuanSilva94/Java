package beecrowd;

import java.util.Scanner;

public class lista2_sortSimples_1042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Entre com o valor: ");
		n1 = sc.nextInt();
		System.out.println("Entre com o valor: ");
		n2 = sc.nextInt();
		System.out.println("Entre com o valor: ");
		n3 = sc.nextInt();
		System.out.println("\n");
		
		if (n1 < n2 && n1 < n3) {
			System.out.println(n1);
			if (n2 < n3) {
				System.out.println(n1);
				System.out.println(n2);
			} else {
				System.out.println(n3);
				System.out.println(n2);
			}
		} else if (n2 < n3) {
			System.out.println(n2);
			if (n1 < n3) {
				System.out.println(n1);
				System.out.println(n3);
			} else {
				System.out.println(n3);
				System.out.println(n1);
			}
		} else {
			System.out.println(n3);
			if (n1 < n2) {
				System.out.println(n1);
				System.out.println(n2);
			} else {
				System.out.println(n2);
				System.out.println(n1);
			}
		}
		
		System.out.println("\n");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
			
		
	}
}

