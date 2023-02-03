import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
public class Main {

	public static void main(String[] args) {
		Scanner	input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = input.nextLine();
		System.out.print("Gross Salary: ");
		emp.grossSalary = input.nextDouble();
		System.out.print("Tax: ");
		emp.tax = input.nextDouble();
		
		System.out.print("Employee: " + emp);
		System.out.println("");
		System.out.print("Which percentage to increase salary: ");
		double percentage = input.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("");
		System.out.print("Updated data: " + emp);
		
		input.close();
	}
}
		
	




