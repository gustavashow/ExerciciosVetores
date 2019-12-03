import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int valor[] = new int[10];
		int maior = 1, menor;
		int i, j;
		
		for (i = 0; i < valor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			valor[i] = leia.nextInt();
			if (valor[i] > maior) {
				maior = valor[i];
			}
		}
		menor = maior;
		for (j = 0; j < valor.length; j++) {
			if (valor[j] < menor) {
				menor = valor[j];
			}
		}
		System.out.println("Maior valor = " + maior);
		System.out.println("Menor valor = " + menor);

		leia.close();
	}

}
