package exercicios_curso_udemy;

import java.util.Scanner;

public class exercicio_3_estrutura_condicional {

	public static void main(String[] args) {
		// Programa para saber se dois numeros inteiros são multiplos.
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.print("Entre com o primeiro numero: ");
		A = sc.nextInt();
		System.out.print("Entre com o segunto numero: ");
		B = sc.nextInt();
		
		if (A%B == 0 || B%A==0) {
			System.out.println("São multiplos!");
		}
		else {
			System.out.println("Não são multiplos!");
		}
		sc.close();
	}

}
