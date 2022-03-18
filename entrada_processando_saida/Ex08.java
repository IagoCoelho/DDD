package entrada_processando_saida;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double produto1, produto2, produto3, produto4, produto5, total, pagamento, troco;
		
		System.out.printf("Digite o valor do primeiro produto: ");
		produto1 = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo produto: ");
		produto2 = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro produto: ");
		produto3 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quarto produto: ");
		produto4 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quinto produto: ");
		produto5 = ler.nextDouble();
		
		total = produto1 + produto2 + produto3 + produto4 + produto5;
		
		System.out.printf("O total da compra foi: R$%.2f ", total);
		
		System.out.printf("\nDigite o valor do pagamento: ");
		pagamento = ler.nextDouble();
		
		troco = pagamento - total;
		
		System.out.printf("O troco da compra é: R$%.2f", troco);

	}

}
