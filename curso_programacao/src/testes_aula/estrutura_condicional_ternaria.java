package testes_aula;

import java.util.Locale;
import java.util.Scanner;

public class estrutura_condicional_ternaria {

	public static void main(String[] args) {
		
		//Programa para calcular desconto com base em um valor minimo de 20.0.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com o preço: R$");
		double preco = sc.nextDouble();
		
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("Desconto concedido %.2f%n", desconto);
		
		double valorFinal = preco - desconto;
		System.out.printf("O valor final com desconto é de: R$%.2f%n", valorFinal);

		sc.close();
	}

}
