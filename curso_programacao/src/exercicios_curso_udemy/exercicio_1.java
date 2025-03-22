package exercicios_curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		
		//Programa que calcula area e preço de um retangulo.
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		double c;
		double l;
		double valorMetroQuadrado;
		double area;
		double preco;
		
		System.out.print("Insira o valor do comprimento: ");
		c = sc.nextDouble();		
		System.out.print("Insira o valor da largura: ");
		l = sc.nextDouble();
		System.out.print("Insira o valor do metro quadrado: ");
		valorMetroQuadrado = sc.nextDouble();
		System.out.println();
		
		area = c * l;
		preco = area * valorMetroQuadrado;
		
		System.out.printf("Comprimento = %.2f%n", c);
		System.out.printf("Largura = %.2f%n", l);
		System.out.printf("Valor do Metro Quadrado = %.2f%n", valorMetroQuadrado);
		System.out.println();
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PREÇO = %.2f%n", preco);
		
		sc.close();
	}

}
