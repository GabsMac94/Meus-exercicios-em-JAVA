package exercicios_curso_udemy;

import java.util.Scanner;

public class exercicio_4_estrutura_condicional {

	public static void main(String[] args) {
		/*Programa que informa a duração de um jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora 
e máxima de 24 horas. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a hora inicial do jogo: ");
		int horaInicial = sc.nextInt();
		System.out.print("Entre com a hora final do jogo: ");
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
		sc.close();
	}

}
