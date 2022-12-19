package program;

import java.util.Scanner;

public class ExercicioATV5_4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n, numerosPares;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = leitor.nextInt();
		
		int[] numeros = new int [n];
		
		for (int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = leitor.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES");
		
		numerosPares = 0;
		for (int i = 0; i<n; i++) {
			if (numeros [i] % 2 == 0) {
				System.out.printf("%d ", numeros[i]);
				numerosPares++;
			}
		}
		System.out.println();
		System.out.println("\nQUANTIDADE DE PARES = " + numerosPares);
	
		
	}
}
