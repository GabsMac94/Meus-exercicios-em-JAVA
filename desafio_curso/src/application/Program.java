package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i<N; i++) {
			System.out.println();
			System.out.println("Empolyee #" + (i+1)+": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken!");
				id = sc.nextInt();
			}
			
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			
			list.add(employee);
		}
		
		System.out.print("Enter the employees' ID that will have salary incresed: ");
		int idSalary = sc.nextInt();
		
		Employee employee = list.stream().filter(x-> x.getId()==idSalary).findFirst().orElse(null);
		
		// Integer pos = position(list, idSalary);
		if (employee == null) {
			System.out.println("This Id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			employee.increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		
		sc.close();
	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i< list.size(); i++) {
			if (list.get(i).getId()== id) {
				return i;
			}
		}
		return null;
		}
		
		public static boolean hasId(List<Employee> list, int id) {
			Employee employee = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
			return employee != null;
		}
		
}
