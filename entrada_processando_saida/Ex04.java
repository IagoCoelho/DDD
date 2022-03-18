package entrada_processando_saida;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		 		
		System.out.printf("Digite a base do triangulo: ");
		base = ler.nextInt();
		
		System.out.printf("Digite a altura do triangulo: ");
		altura = ler.nextInt();
		
		area = base * altura / 2;
		
		System.out.printf("A area do triangulo é: %.1f", area);
		

	}

}
