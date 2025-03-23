package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Fazer um programa para ler dois numeros inteiros
		 * M e N, e depois ler uma matriz de M linhas e N colunas
		 * contendo numeros inteiros, podedndo haver repetições.
		 * Em seguida, ler um número inteiro X que pertence à 
		 * matriz. Para cada ocorrencia de X, mostrar os valores à 
		 * esquerda, acima, à direita e abaixo de X, quando houver, 
		 * conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas linhas a matriz vai ter? ");
		int M = sc.nextInt();
		System.out.print("Quantas colunas a matriz vai ter? ");
		int N = sc.nextInt();
		
		int [][] mat = new int [M][N];
		
		for (int i= 0; i<M; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		for (int i= 0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Digite o valor de X: ");
		int X = sc.nextInt();
		
		for (int i= 0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if (mat[i][j] == X) {
					System.out.println(mat[i][j] + " está na posição: " + i + ", "+j);
					
					// Verifica os vizinhos antes de acessá-los
                    if (j > 0) { // Existe à esquerda
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (j < N - 1) { // Existe à direita
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i > 0) { // Existe acima
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (i < M - 1) { // Existe abaixo
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
				}
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
