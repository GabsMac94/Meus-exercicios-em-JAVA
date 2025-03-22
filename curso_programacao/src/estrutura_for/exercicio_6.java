package estrutura_for;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		/*
		 * Ler um número inteiro N e calcular todos os seus divisores.
		 */

		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.print("Digite um numero para sabermos seus dividores: ");
		N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			if (N % i == 0){
				System.out.printf("É um divisor de %d: %d%n", N, i);
			}
		}
		
		
		
		
		sc.close();
	}

}
