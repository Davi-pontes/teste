package program;

import java.util.Scanner;

import entities.product;

public class program {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		product product = new product(String name , double price);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.setName(leitor.nextLine());
		System.out.print("Price: ");
		product.setPrice(leitor.nextDouble());
		System.out.print("Quantity in stock: ");
		product.setQuantity(leitor.nextInt());
		
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = leitor.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock:");
		quantity = leitor.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.print("Update data: " + product);
	}

}
