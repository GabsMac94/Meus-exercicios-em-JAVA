package entities;

public class Employee {

	public String emp;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary() {
		return netSalary() + (percentage/100) *grossSalary;
	}
	
	public String toString() {
		return emp
			+ ", $"
			+ String.format("%.2f", netSalary());
	}
	
	
}
