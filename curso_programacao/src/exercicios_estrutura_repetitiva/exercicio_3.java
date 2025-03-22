package exercicios_estrutura_repetitiva;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool, gasolina, diesel;
	
		int combustivel;
		
		int somaAlcool = 0;
		int somaGasolina = 0;
		int somaDiesel = 0;
		
		
		System.out.print("Informe o combustivel desejado: ");
		combustivel = sc.nextInt();
		
		while (combustivel!= 4) {
				
			switch(combustivel){
			case 1:
				somaAlcool += 1;
				System.out.printf("Alcool. Quantidade: %d%n", somaAlcool);
				break;
			case 2:
				somaGasolina += 1;
				System.out.printf("Gasolina. Quantidade: %d%n", somaGasolina);
				break;
			case 3: 
				somaDiesel += 1;
				System.out.printf("Diesel. Quantidade: %d%n", somaDiesel);
				break;
			case 4:
				System.out.println("Fim do programa.");
				break;
			default: 
				System.out.println("Comando invalido!");
			}
			
			System.out.print("Informe o combustivel desejado: ");
			combustivel = sc.nextInt();
		}
		System.out.println();
		System.out.println("Muito obrigado!");
		System.out.printf("Total de Gasolina: %d%n", somaGasolina);
		System.out.printf("Total de Alcool: %d%n", somaAlcool);
		System.out.printf("Total de Diesel: %d%n", somaDiesel);
		
		
		sc.close();
	}

}
