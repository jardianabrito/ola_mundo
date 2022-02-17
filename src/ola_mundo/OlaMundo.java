package ola_mundo;

import java.util.Locale;
import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		int number1 = sc.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		int number2 = sc.nextInt();
		
		if(number1 > number2) 
			{
				System.out.println("Hello world! O primeiro numero (" + number1 + ") é maior do que o segundo numero (" + number2 + ")");
			}else {
				System.out.println("O primeiro numero (" + number1 + ") é menor do que o segundo numero (" + number2 + ")");
				
			}
				
		sc.close();
	}

}
