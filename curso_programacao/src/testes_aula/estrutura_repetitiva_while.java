package testes_aula;

import java.util.Scanner;

public class estrutura_repetitiva_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um numero inteiro: ");
		x = sc.nextInt();
		
		int soma = 0;
		
		while (x != 0)
		{
			soma += x;
			System.out.print("Digite outro numero inteiro: ");
			x = sc.nextInt();
		
		}
		
		System.out.println("Soma é de: "+soma);
		
		sc.close();
	}

}
