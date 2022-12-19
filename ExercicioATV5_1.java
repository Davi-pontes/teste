package program;

import java.util.Scanner;

public class ExercicioATV5_1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n, negativo = 0;
	
		System.out.println("Quantos numeros voce vai digitar? ");
		n = leitor.nextInt();
		
		int [] vect = new int[n];
	
		if (n <= 10) {
			
			for (int i = 0; i < n; i++) {
				System.out.println("Digite um numero: ");
				vect[i] = leitor.nextInt();
				
			}
			
			System.out.println("NUMEROS NEGATIVOS: ");
			
			for (int i = 0; i < n; i++) {
				if (vect[i] < 0) {
					System.out.println(vect[i]);
				}
				
			}
			
		}
		else {
			
			System.out.println("Numero invalido");
		}
	}

}
