package estrutura_decisao;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2;
		
		System.out.printf("Digite sua p1: ");
		p1 = ler.nextDouble();
		
		p2 = ((5*3)-p1)/2;
		
		System.out.printf("Você precisa de %.1f: ", p2);

	}

}
