package exercicios_curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_5_estrutura_condicional {

	public static void main(String[] args) {
		/* Escreva um programa que leia o código de um item e a quantidade deste item. A
			seguir, calcule e mostre o valor da conta a pagar.* 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um código de 1 a 5: ");
		int codigo = sc.nextInt();
		System.out.print("Digite a quantidade desejada: ");
		int quantidade = sc.nextInt();
		
		double total;
		
		
		if (codigo ==1) {
			total = quantidade * 4.0;
			System.out.printf("Você escolheu %d unidade(s) de cachorro quente, ficou no preço de R$%.2f", quantidade, total);
		}
		else if(codigo == 2) {
			total = quantidade * 4.50;
			System.out.printf("Você escolheu %d unidade(s) de X-Salada, ficou no preço de R$%.2f", quantidade, total);
		}
		else if (codigo == 3) {
			total = quantidade * 5.00;
			System.out.printf("Você escolheu %d unidade(s) de X-Bacon, ficou no preço de R$%.2f", quantidade, total);
		}
		else if(codigo == 4) {
			total = quantidade * 2.00;
			System.out.printf("Você escolheu %d unidade(s) de Torrada Simples, ficou no preço de R$%.2f", quantidade, total);
		}
		else if(codigo == 5) {
			total = quantidade * 1.50;
			System.out.printf("Você escolheu %d unidade(s) de Refrigerante, ficou no preço de R$%.2f", quantidade, total);
		}
		else {
			System.out.println("Você digitou um valor código invalido.");
		}
		
		
		sc.close();
	}

}
