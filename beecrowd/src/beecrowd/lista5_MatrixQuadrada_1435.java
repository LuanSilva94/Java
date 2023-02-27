package beecrowd;

import java.util.Scanner;

public class lista5_MatrixQuadrada_1435 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N,x;
		
		System.out.println("Digite um valor entre 0 e 100: ");
		N = sc.nextInt();
	
		while (N != 0) {
			for (int c = 1; c <= N; c++) {
				for (int j = 1; j <= N; j++) {
					x = c;
					if (j < x)
						x = j;
					if (N - c + 1 < x)
						x = N - c + 1;
					if (N - j + 1 < x)
						x = N - j + 1;

					System.out.printf("%3d", x);
					if (j < N)
						System.out.print(" ");
					else
						System.out.print("\n");
				}
			}
			System.out.print("\n");
			N = sc.nextInt();
		}
	}
}
