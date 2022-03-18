package entrada_processando_saida;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double  primeiro, segundo, terceiro, quarto, media;
		
		System.out.printf("Digite o primeiro valor: ");
		primeiro = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		segundo = ler.nextDouble();
		
		System.out.printf("Digite o terceiro valor: ");
		terceiro = ler.nextDouble();
		
		System.out.printf("Digite o quarto valor: ");
		quarto = ler.nextDouble();
		
		media = primeiro + segundo + terceiro + quarto / 4;
		
		System.out.printf("A media é: %.2f", media);

	}

}
