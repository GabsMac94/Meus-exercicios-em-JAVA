package testes_aula;

import java.util.Locale;
import java.util.Scanner;

public class teste_debug {

	public static void main(String[] args) {
		// Para executar o Debug.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o valor da largura: ");
		double largura = sc.nextDouble();

		System.out.print("Entre com o valor ddo comprimento: ");
		double comprimento = sc.nextDouble();

		System.out.print("Entre com o valor do metro quadrado: ");
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.println("A area é de " + area + "!");
		System.out.println("O preço do metro quadrado é de " + preco + "!");

		sc.close();
	}

}
