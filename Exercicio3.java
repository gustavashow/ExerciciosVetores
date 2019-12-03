import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int[] A = new int [10];
		int[] B = new int [A.length];
		
		for (int i = 0; i<A.length; i++) {
			System.out.println("Insira o "+(i+1) +"° valor"); 
			A [i]= leia.nextInt();
			
			B [ A.length - i - 1] = A[i];
		}
		System.out.println("Vetor A ");
		for (int i = 0; i<A.length; i++) {
			System.out.println(A[i] + "");
		}
		System.out.println();
		
		System.out.println("Vetor B ");
		for (int i = 0; i<B.length; i++) {
			System.out.println(B[i] + "");
		}
		System.out.println();
		
		leia.close();;
	}
}