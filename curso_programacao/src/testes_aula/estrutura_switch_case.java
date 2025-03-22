package testes_aula;

import java.util.Scanner;

public class estrutura_switch_case {

	public static void main(String[] args) {
		/* Fazer um prgrama para ler um valor inteiro de 1 a 7
		 * representando um dia da semana (Sendo 1=domingo, 2 = segunda,
		 * e assim por diante).
		 * Escrever na tela o dia da semana correspondente
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o numero do dia desejado: ");
		int x = sc.nextInt();
		
		String dia;
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor invalido";
			break;
		}
		
		System.out.printf("Dia correspondente: %s (%d).", dia, x);
		
		sc.close();
	}

}
