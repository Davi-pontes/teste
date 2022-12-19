package program;


import java.util.Scanner;

public class ExercicioATV5_7_MATRIZ {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int m = leitor.nextInt();
		int n = leitor.nextInt();
		
		int [][] mat = new int [m][n];
		
		
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = leitor.nextInt();
			}
		}
		
		int num = leitor.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == num) {
					System.out.println("Position" + i + "," + j + ":");
					}
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
}




