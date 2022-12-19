package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class ExercicioATV5_6_LISTAS {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = leitor.nextInt();
		
		List <Employee> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			
			System.out.print("Id: ");
			Integer id = leitor.nextInt();
			
			System.out.print("Name: ");
			leitor.nextLine();
			String name = leitor.nextLine();
			
			System.out.print("Salary: ");
			Double salary = leitor.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
		}
		System.out.print("Enter the employee id that will have salary increase: ");
		int EmployeeId = leitor.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == EmployeeId).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = leitor.nextDouble();
			emp.increaseSalary(percentage);
		}
		System.out.println();
		System.out.println("List of employees: ");
		
		for (Employee em : list) {
			System.out.println(em);
		}
	}
}





