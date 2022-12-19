package program;

import java.util.Scanner;

import entities.account;

public class programAccount {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		account account;
		
		System.out.print ("Enter account number: ");
		int number = leitor.nextInt();
		System.out.print("Enter accoutn holder: ");
		leitor.nextLine();
		String holder = leitor.nextLine();
		System.out.print("Is there an initial deposit (y/n) ");
		char response = leitor.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = leitor.nextDouble();
			account = new account(number, holder, initialDeposit);
		}
		else {
			account = new account(number, holder);
		}
	
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = leitor.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = leitor.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
	}

}
