package aula_vetores;

import java.util.Locale;
import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		// Fazer um programa para elr um numero inteiro N e a
		// altura de N pessoas. Armazene as N alturas em um vetor.
		// Em seguida, mostrar a altura média dessas pessoas.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.print("Quantas alturas serão digitadas? ");
		N = sc.nextInt();
		
		double [] vect= new double [N];
		
		double soma = 0;
		for (int i=0; i <N; i++) {
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		double media = soma /N;
		System.out.printf("Altura media: %.2f%n", media);
	
		
		
		sc.close();
	}

}
