package Controle;

import java.util.Scanner;
/*Crie um programa que receba um n�mero e verifique se ele est�
 * entre 0 e 10 e � par
 */

public class Valores10 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero  = read.nextInt();
		
		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("O n�mero " +numero + " est� entre 0 e 10 e � um par.");
			} else {
				System.out.println("O n�mero " +numero + " est� entre 0 e 10 mas n�o � um par.");
			}
		} else {
			System.out.println("O n�mero "+ numero + " n�o est� entre 0 e 10.");
		}
		read.close();
	}

}
