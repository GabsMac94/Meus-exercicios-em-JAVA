package testes_aula;

import java.util.Locale;
import java.util.Scanner;

public class estrutura_condicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		System.out.print("Olá! Entre com o horario: ");
		x = sc.nextDouble();
		
		
		if (x >= 6.00 && x<=11.59) {
			System.out.println("Bom dia!");
		}
		else if(x >= 12.00 && x <=17.59) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
		sc.close();
	}

}
