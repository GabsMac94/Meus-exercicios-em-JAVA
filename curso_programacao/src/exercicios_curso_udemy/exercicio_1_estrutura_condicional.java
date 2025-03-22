package exercicios_curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_1_estrutura_condicional {

	public static void main(String[] args) {
		// Fazer um programa que identifique numero negativo, positivo e neutro.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite um numero: ");
		double x = sc.nextDouble();
		
		if (x>0) {
			System.out.printf("Você digitou um numero positivo. %.2f", x);
		}
		else if (x<0) {
			System.out.printf("Você digitou um numero negativo. %.2f", x);
		}
		else {
			System.out.printf("Você digitou um numero neutro (0).");			
		}
		
	
		sc.close();
	}

}
