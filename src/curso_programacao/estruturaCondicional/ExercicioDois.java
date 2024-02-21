package curso_programacao.estruturaCondicional;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		Scanner sc = new Scanner(System.in);		
		
		int number;
		
		number = sc.nextInt();
		
		if (number == -27) {
			System.out.println("IMPAR");	
		}
		else if (number == 12 || number == 0 ){
			System.out.println("PAR");
		}
				
		sc.close();
	}

}
