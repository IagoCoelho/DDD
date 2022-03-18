package entrada_processando_saida;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double dolar, real;
		
		System.out.printf("Digite o valor em dolar: ");
		dolar = ler.nextDouble();
		
		real = dolar * 5.04;
		
		System.out.printf("O valor em Reais é: R$ %.2f", real);

	}

}
