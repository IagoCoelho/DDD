package estrutura_repeticao;

import java.util.Scanner;

public class Ex22W {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double valor1, valor2;
		
		System.out.printf("Digite o primeiro valor: ");
		valor1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		valor2 = ler.nextDouble();
		
		while(valor2 <= valor1){
			System.out.printf("O segundo valor deve ser maior: ");
			valor2 = ler.nextDouble();
		}
		
		System.out.printf("O segundo valor é maior.");
	}

}
