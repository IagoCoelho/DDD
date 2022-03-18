package entrada_processando_saida;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double TC, TF;
		
		System.out.printf("Digite a temperatura em Graus Celsius: ");
		TC = ler.nextDouble();
		
		TF = (TC * 9/5) + 32;
		
		System.out.printf("A temperatura em Fahrenheit: %.2f°", TF);

	}

}
