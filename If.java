package Controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe a m�dia: ");
			double media = leia.nextDouble();
		
		if (media <=10 && media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parab�ns");
		}
		if (media <7 && media >=4.5) {
			System.out.println("Em recupera��o");
		}
		boolean criterioaprovacao = media < 4.5 && media >= 0;
		if (criterioaprovacao) {
			System.out.println("Reprovado");
		}
		
		
		leia.close();

	}

}
