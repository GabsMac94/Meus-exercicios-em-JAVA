package estrutura_for;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. 
		 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando 
		 * que, por definição, fatorial de 0 é 1.
		 */

		Scanner sc = new Scanner(System.in);
		
		int N;
		int fatorial = 1;
		
		System.out.print("Digite o numero que quer o fatorial: ");
		N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			if (N==0) {
				fatorial = 1;
				System.out.println(fatorial);
			}
			else {
				fatorial = fatorial * i;
			}
		}
		System.out.println("O fatorial de " + N + " é: "+fatorial+".");
		
		
		
		
		sc.close();
	}

}
