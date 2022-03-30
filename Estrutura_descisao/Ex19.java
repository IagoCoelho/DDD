package estrutura_decisao;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, media;
		
		System.out.printf("Digite sua p1: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite sua p2: ");
		p2 = ler.nextDouble();
		
		media = (p1 + 2 * p2) / 3;
		
		if(media >= 5) {
			System.out.printf("Aprovado");
		}else {
			System.out.printf("Reprovado");
		}

	}

}
