package testes_aula;

import java.util.Locale;
import java.util.Scanner;

public class estrutura_do_while {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler uma temperatura em Celsius e mostrar
		 * o equivalente em Fahenheit. Perguntar se o usuario deseja repetir (s/n).
		 * Caso o usuario digite "s", repetir o programa.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		double c;
		double f;
		
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			c = sc.nextDouble();
			f = (9*c)/5 + 32;
			System.out.printf("Graus Celsius: %.2f%n", c);
			System.out.printf("Graus Fahrenheit: %.2f%n", f);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
			
		} while (resp == 's' || resp == 'S');
		
		
		sc.close();
	}

}
