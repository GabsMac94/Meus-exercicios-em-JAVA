package exercicios_curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_7_estrutura_condicional {

	public static void main(String[] args) {
		/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		 * de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
		 * ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
		 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
		 * situação.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String Q1 = "Eixo Q1";
		String Q2 = "Eixo Q2";
		String Q3 = "Eixo Q3";
		String Q4 = "Eixo Q4";
		String origem = "Origem";
		
		double x, y;
		
		System.out.print("Entre com o valor de x: ");
		x= sc.nextDouble();
		System.out.print("Entre com o valor de y: ");
		y = sc.nextDouble();
		
		if (x >0 && y>0) {
			System.out.printf("Está no %s%n",Q1);
		}
		else if (x<0 && y>0) {
			System.out.printf("Está no %s%n",Q2);
		}
		else if(x<0 && y<0) {
			System.out.printf("Está no %s%n",Q3);
		}
		else if(x>0 && y<0) {
			System.out.printf("Está no %s%n",Q4);
		}
		else {
			System.out.printf("Está na %s%n",origem);
		}
		
		
		
		sc.close();
	}

}
