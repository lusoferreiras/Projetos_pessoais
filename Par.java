package Controle;


import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite numero: ");{
			numero = leia.nextInt();
			
			
		}if (numero >=0 && numero <=10){
			System.out.println("Est� dentro do padr�o");
			
		}else {
			System.out.println("\nO n�mero n�o est� dentro do padr�o");
		}
		if (numero %2 == 0) {
			System.out.println("\nO numero � par!");
		}
		else if (numero %2 == 1) {
			System.out.println("\no n�mero n�o � par");
		} 
		 
		leia.close();
		


	}

}
