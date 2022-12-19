package program;

import java.util.Scanner;

public class ExercicioATV5_2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n;
		double soma = 0;
	
		System.out.print("Quantos numeros voce vai digitar? ");
		n = leitor.nextInt();
		
		double [] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = leitor.nextDouble();
		}
		
		System.out.println();
		
			System.out.print("VALORES = ");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f " , vect[i] , " ");
			
		}
		
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		System.out.printf("\nSOMA = " + soma);
		System.out.printf("\nMEDIA = " + soma/n);
	}

}
