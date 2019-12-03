import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int i, a[];
		final int TAM = 10;
		float b[];

		a = new int[TAM];
		b = new float[TAM];

		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com " + (i + 1) + "o. valor");
			a[i] = leia.nextInt();

		}

		for (i = 0; i < TAM; i++) {
			b[i] = (float) Math.sqrt(a[i]);
			System.out.println("A raiz de " + (i + 1) + " B é: " + b[i]);

		}
		leia.close();
	}

}
