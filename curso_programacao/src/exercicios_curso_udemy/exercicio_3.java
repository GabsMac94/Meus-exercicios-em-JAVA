package exercicios_curso_udemy;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		// Programa que le 4 valores e mostra a diferença.
		// Diferença = (A*B - C*D)
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.print("Entre com o valor de A: ");
		A = sc.nextInt();
		System.out.print("Entre com o valor de B: ");
		B = sc.nextInt();
		System.out.print("Entre com o valor de C: ");
		C = sc.nextInt();
		System.out.print("Entre com o valor de D: ");
		D = sc.nextInt();
		System.out.println();
		
		diferenca = (A*B - C*D);
		
		System.out.printf("O valor da diferença entre o produto de A e B pelo de C e D é = %d", diferenca);
	
		sc.close();
	}

}
