package Controle;

import java.util.Scanner;



public class Aprovacao {
	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2;
		System.out.println("Digite primeira nota: ");{
		nota1 = leia.nextDouble();}
		System.out.println("Digite segunda nota: ");{
		nota2 = leia.nextDouble();}
		
		 double media = (nota2+nota1)/2;
		 System.out.println("A m�dia do aluno �: "+media);
		 if(media<0 && media>10){
				System.out.println("Nota inv�lida!");
			}
			if(media>=7 && media<=10) {
				System.out.println("Aluno Aprovado!");
			} else if (media<7 && media>=4) {
				System.out.println("Aluno em recupera��o!");
			} else if (media>=0 && media<4) {
				System.out.println("Aluno Reprovado!");
			} else{
				System.out.println("Nota inv�lida!");
			}

		
		
	}

}
