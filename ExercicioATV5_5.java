package program;

import java.util.Scanner;

public class ExercicioATV5_5 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n;
		double maior, posmaior;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = leitor.nextInt();
		
		double [] numero = new double [n];
		
		for (int i = 0; i < n;i++) {
			System.out.print("Digite um numero: ");
			numero[i] = leitor.nextDouble();
		}
		
		maior = numero[0];
		posmaior = 0;
		for (int i = 1; i < numero.length; i++) {
			if(numero[i] > maior)
			{
				maior = numero[i];
				posmaior = i;
			}
			
		}
		System.out.println();
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posmaior);
		
	}
}