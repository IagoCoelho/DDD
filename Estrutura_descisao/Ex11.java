package estrutura_decisao;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double num1, num2, maior;
		
		System.out.printf("Digite o primeiro número: ");
		num1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo número: ");
		num2 = ler.nextDouble();
		
		if (num1 > num2) {
			System.out.printf("O maior número é: %.1f", num1);
		} else {
			System.out.printf("O maior número é: %.1f", num2);
		}

	}

}
