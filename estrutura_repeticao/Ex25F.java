package estrutura_repeticao;

import java.util.Scanner;

public class Ex25F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, t, i;
		
		System.out.printf("Digite um n�mero positivo: ");
		num = ler.nextInt();
		
		while(num <= 0) {
			System.out.printf("Digite um n�mero positivo: ");
			num = ler.nextInt();
		}
		
		for(i = 1; i <= 10; i++) {
			t = num * i;
			System.out.printf("\n%d X %d = %d", num, i, t);
		}

	}

}
