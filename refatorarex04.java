package Controle;

import java.util.Scanner;

public class refatorarex04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int contadorDeDivisores = 0;
		
		System.out.println("\nDigite um numero para verificar se � um primo");
		int numero =  read.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		switch (contadorDeDivisores) {
		case 0: 
			System.out.println("O n�mero " +numero +" � um n�mero primo.");
			break;
		default:
			
			System.out.println("O n�mero " + numero + " n�o � um n�mero primo.");
		}
		read.close();

	}

}
