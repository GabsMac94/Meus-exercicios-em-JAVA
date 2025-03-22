package estrutura_for;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre 
		 * os ímpares de 1 até X, um valor por linha, inclusive o X,
		 *  se for o caso.
		 */
		
		
		
		Scanner sc = new Scanner(System.in);

		int x;
		int i;
		int cont =0;
	
		System.out.print("Digite o valor de x: ");
		x = sc.nextInt();
		
		for (i= 0; i <= x; i++ ) {
			if (i % 2 != 0) {
				System.out.printf("Valor(es) impar(es) até x: %d%n", i);
				cont = cont + 1;
			}
		}	
		
		System.out.printf("De 0 à %d exite(em) %d número(s) impar(e)s.", x, cont);
		
		sc.close();
	}

}
