package entities;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString(){
		
		return "Rectangle with "
				+ String.format("%.2f", width) 
				+ " of width, and " 
				+ String.format("%.2f", height) 
				+ " of height.";
	}
	
}
