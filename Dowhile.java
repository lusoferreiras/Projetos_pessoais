package Controle;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String texto = "Por favor";
		
		do {
			System.out.println("Voc� precisa falar "
					+ "\nas palavras m�gicas...");
			System.out.println("Quer sair?");
			texto = leia.nextLine();
		}while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		leia.close();

	}

}
