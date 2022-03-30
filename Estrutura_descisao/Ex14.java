package estrutura_decisao;

import java.util.Scanner;

public class Ex14 {
	

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double altura, peso, IMC;
		
		System.out.printf("Digite sua altura: ");
		altura = ler.nextDouble();
		
		System.out.printf("Digite seu peso: ");
		peso = ler.nextDouble();
		
		IMC = peso / altura * altura;
		
		if(IMC <= 19 || IMC <24) {
			System.out.printf("Você está no peso ideal");
		} else {
			System.out.printf("Você está abaixo do peso");
		}

	}

}
