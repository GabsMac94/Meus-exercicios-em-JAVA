package entities;

public class Student {
	//primeiro trimestre vale 30
	// segundo e terceiro valem 35
	

	public String name;
	public double n1, n2, n3;
	
	
	public double media() {
		return n1 + n2 + n3;
	}
	
	public double missing() {
		return 60 - media();
	}
	
	public String toString() {
		if (media() > 60) {
			return "Final Grade: "
					+ String.format("%.2f%n",media()) 
					+ "Pass";
		}
		else {
			return "Final Grade: "
					+ String.format("%.2f%n",media()) 
					+ "Failed. "
					+ "Missing: " 
					+ missing();
		}
	}
	
}
