package estrutura_for;

import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro positivo N. 
		 * O programa deve então mostrar na tela N linhas, começando
		 *  de 1 até N. Para cada linha, mostrar o número da linha, 
		 *  depois o quadrado e o cubo do valor, conforme exemplo.
		 */
		Scanner sc = new Scanner(System.in);
		
		int N;
		int x;
		double quadrado;
		double cubo;
		System.out.print("Digite o valor desejado: ");
		N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			quadrado = Math.pow(i, 2);
			cubo = Math.pow(i, 3);
			System.out.printf("%d %.0f %.0f%n", i, quadrado, cubo);
		}	
		
		sc.close();
	}

}
