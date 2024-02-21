package curso_programacao.estruturaCondicional;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.println("Digite o número desejado para verificar se é negativo ou não");
		number = sc.nextInt();
				
		if (number < 0 ) {
			System.out.println("NEGATIVO");			
		}
		
		else {
			if (number >= 0 ){
				System.out.println("NÃO NEGATIVO");
			}
		}	
					
		sc.close();

	}

}
