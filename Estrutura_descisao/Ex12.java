package estrutura_decisao;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double  num1, num2;
		
		System.out.printf("Digite o primeiro n�mero: ");
		num1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo n�mero: ");
		num2 = ler.nextDouble();
		
		if (num1 < num2) {
			System.out.printf("O menor n�mero �: %.1f", num1);
		} else  {
			System.out.printf("O menor n�mero �: %.1f", num2);
		}

	}

}
