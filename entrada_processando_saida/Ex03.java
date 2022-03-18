package entrada_processando_saida;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int base, altura, area;
		
		System.out.printf("Digite a base do retangulo: ");
		base = ler.nextInt();

		System.out.print("Digite a altura do retangulo: ");
		altura = ler.nextInt();
		
		area = base * altura;
		
		System.out.printf("A area do retangulo é: %d", area);
	}

}
