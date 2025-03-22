package exercicios_curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_2_estrutura_condicional {

	public static void main(String[] args) {
		// Fazer um programa que detecta se o numero é par ou impar.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com um número: ");
		double x = sc.nextDouble();
		
		if (x % 2 == 0 && x != 0) {
			System.out.printf("Você digitou um número par! %.2f", x);
		}
		else if (x % 2 != 0 && x!= 0){
			System.out.printf("Você digitou um número ímpar! %.2f", x);
		}
		else {
			System.out.println("Você digitou o numero 0!");
		}
		
		sc.close();
	}

}
