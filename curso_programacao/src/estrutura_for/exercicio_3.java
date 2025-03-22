package estrutura_for;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		
		/*
		 * Leia 1 valor inteiro N, que representa o número de casos 
		 * de teste que vem a seguir. Cada caso de teste consiste de
		 * 3 valores reais, cada um deles com uma casa decimal. 
		 * Apresente a média ponderada para cada um destes conjuntos
		 * de 3 valores, sendo que o primeiro valor tem peso 2, o segundo
		 *  valor tem peso 3 e o terceiro valor tem peso 5.
		 */
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		int N;
		double mp;
		double x;
		double y;
		double z;
		
		System.out.print("Digite a quantidade de testes: ");
		N = sc.nextInt();
		
		for (int i = 0; i<N; i++){
			System.out.println("Digite os valores: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			System.out.printf("%.1f %.1f %.1f%n", x, y ,z);
			mp = (x*2 + y*3 + z*5) /10;
			System.out.printf("Media ponderada: %.1f%n", mp);
		}		
		sc.close();
	}

}
