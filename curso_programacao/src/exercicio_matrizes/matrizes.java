package exercicio_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class matrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual vai ser a ordem da Matriz? ");
		int N = sc.nextInt();

		int [][] mat = new int[N][N];
		
		for (int i = 0; i<N; i++) {
			for (int j=0; j<N; j++) {
				System.out.println("Digite o numero da linha "+ (i+1)+ " e a coluna "+ (j+1)+ ":");
				mat[i][j]= sc.nextInt();
			}
		}
		
		
		System.out.println("Matriz Digitada: ");
		for (int i = 0; i<N; i++) {
			for (int j=0; j<N; j++) {
				System.out.print(mat[i][j]+  " ");
			}
			System.out.println();
		}
		
		System.out.println();
		//Mostrar a diagonal principal.]
		System.out.println("Diagonal principal: ");
		for (int i= 0; i< N; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int cont = 0;
		System.out.println();
		for (int i = 0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if(mat[i][j]< 0) {
					System.out.print(mat[i][j] + " ");
					cont += 1;
				}
			}
		}
		System.out.println();
		System.out.print("Quantidade de numeros negativos: " + cont);
		
		
		sc.close();
	}

}
