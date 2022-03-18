package entrada_processando_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.print("Digite o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		
		soma = a + b;
		
		System.out.printf("A soma é: %d", soma);
	}

}
