package exercicios_curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		
		//Programa para ler o raio de um circulo e sua area
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio do circulo: ");
		double r = sc.nextDouble();
		
		double area = 3.14159 * Math.pow(r, 2);
		
		System.out.println();
		System.out.printf("Você digitou o raio = %.2f%n",r);
		System.out.printf("Area é de: %.4f%n", area);
		
		sc.close();
	
	}

}
