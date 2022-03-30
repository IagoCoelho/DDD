package estrutura_decisao;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double valorA, valorB, valorC;
		
		System.out.printf("Digite o primeiro valor: ");
		valorA = ler.nextDouble();
		
		System.out.printf("Digite o primeiro valor: ");
		valorB = ler.nextDouble();
		
		System.out.printf("Digite o primeiro valor: ");
		valorC = ler.nextDouble();
		
		if((valorC * valorC) == (valorA * valorA) + (valorB * valorB) || (valorA * valorA) == (valorC * valorC) + (valorB * valorB) || (valorB * valorB) == (valorC * valorC) + (valorA * valorA)){
			System.out.printf("É um triângulo retângulo.");			
		} else {
			System.out.printf("Não é um triângulo retângulo.");
		}

	}

}
