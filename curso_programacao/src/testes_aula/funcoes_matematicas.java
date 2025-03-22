package testes_aula;

public class funcoes_matematicas {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + "=" + A);
		System.out.println("Raiz quadrada de " + y + "=" + B);
		System.out.println("Raiz quadrada de 25 =" + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println();
		
		System.out.printf("%.2f elevado a %.2f é = %.2f%n", x, y, A);
		System.out.printf("%.2f elevado ao quadrado é = %.2f%n", x, B);
		System.out.printf("5.00 elevado ao quadrado é = %.2f%n", C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println();
		System.out.printf("Valor absoluto de %.2f é = %.2f%n", y, A);
		System.out.printf("Valor absoluto de %.2f é = %.2f", z, B);
		
	}

}
