package curso_programacao.estruturaSequencial;

import java.util.Locale;

public class Fix {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);	
		
	String product1 = "Computer";
	String product2 = "Office desk";
	
	int age = 30;
	int code = 5290;
	char gender = 'F';
	
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	
	
	System.out.printf("Products: %n %s, whice price is %.2f%n %s, whice price is %.2f%n %n%n ", product1, price1, product2, price2);
	System.out.printf("Record: %d years old, code %d and gender: %c ", age, code, gender );
	System.out.printf(" %n%n Measue with eight decimal places: %.8f ", measure);
	System.out.printf("Rouded (three decimal places): %.3f", measure);
	System.out.printf( " %n US decimal point: %.3f", measure  );

	}	
	
}
