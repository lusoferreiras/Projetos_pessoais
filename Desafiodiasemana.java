package Controle;

import java.util.Scanner;

public class Desafiodiasemana {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o dia: ");
		{
			String dia = leia.next();

			if (dia.equalsIgnoreCase("domingo")) {
				System.out.println("1");
			} else if (dia.equalsIgnoreCase("segunda")) {
				System.out.println("2");
			} else if ("ter�a".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
				System.out.println("3");
			} else if (dia.equalsIgnoreCase("quarta")) {
				System.out.println("4");
			} else if (dia.equalsIgnoreCase("quinta")) {
				System.out.println("5");
			} else if (dia.equalsIgnoreCase("sexta")) {
				System.out.println("6");
			} else if (dia.equalsIgnoreCase("sabado") || "s�bado".equalsIgnoreCase(dia)) {
				System.out.println("7");
			} else {
				System.out.println("N�o � um dia!");

			}

		}
		leia.close();

	}

}
