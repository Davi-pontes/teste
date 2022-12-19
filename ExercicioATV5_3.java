package program;

import java.util.Scanner;

public class ExercicioATV5_3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n , nmenores;
		double alturatotal, alturamedia, percentualMenores;
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = leitor.nextInt();
		
		String [] name = new String[n];
		int [] age = new int [n];
		double [] heigth = new double [n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados %da pessoa:\n",i+1);
			System.out.print("Nome: ");
			name [i] = leitor.next();
			System.out.print("Idade: ");
			age [i] = leitor.nextInt();
			System.out.print("Altura: ");
			heigth [i] = leitor.nextDouble();
			
		}
		
		nmenores = 0;
		alturatotal = 0;
		for (int i = 0; i<n; i++) {
			if (age[i] < 16) {
				nmenores++;
			}
			alturatotal = alturatotal + heigth[i];
		}
		alturamedia = alturatotal / n;
		percentualMenores = ((double)nmenores / n) * 100.0;
		
		System.out.printf("\nAltura meida = %.2f\n", alturamedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		for (int i=0; i<n; i++) {
			if (age[i] < 16) {
				System.out.printf("%s\n", name[i]);
			}
		}
		
	}
}
