import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int i, c = 1, div = 0, s = 0;
		final int P = 10;
		int a[];

		a = new int[P];

		for (i = 0; i < 10; i++) {

			System.out.println("Digite o " + (i + 1) + "° valor: ");
			a[i] = leia.nextInt();
		}

		for (i = 0; i < 10; i++) {
			div = 0;
			for (c = 1; c <= a[i]; c++) {
				if (a[i] % c == 0) {
					div = div + 1;
				}
			}

			if (div == 2) {
				System.out.println(" O número " + a[i] + " é primo");
				s = s + 1;
			}

		}
		System.out.println("A quantidade de numeros primos é " + s);
		
		leia.close();
		

	}

}
