package estrutura_for;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares 
		 * de números e mostre a divisão do primeiro pelo segundo. 
		 * Se o denominador for igual a zero, mostrar a mensagem :
		 * "divisao impossivel".
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int N, x , y;
		double divisaoPares;
		
		System.out.print("Digite o valor de N:");
		N= sc.nextInt();
		
		for (int i= 0; i<N; i++) {
			System.out.print("Digite os pares:");
			x = sc.nextInt();
			y= sc.nextInt();
			divisaoPares = (double) x/y;
			if (y == 0) {
				System.out.println("Divisão impossivel!");
			}
			else {
				System.out.printf("Resultado da divisão dos pares: %.2f%n", divisaoPares);
			}		
			
		}
		sc.close();
	}

}
