package Ex33;

import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Produto [] listaProdutos = new Produto[10];
		
		for(int i = 0; i <= 9; i++) {
			Produto p = new Produto();
			
			System.out.printf("Digite o id do produto: ");
			p.id = ler.nextInt();
			
			System.out.printf("Digite a descri��o do produto: ");
			p.descricao = ler.next();
			
			System.out.printf("Digite o valor do produto: ");
			p.valor = ler.nextDouble();
			
			System.out.printf("Digite a quantidade do produto: ");
			p.quantidade = ler.nextDouble();
			
			listaProdutos[i] = p;
		}
		
		for(int i = 0; i <= 9; i++) {
			if(listaProdutos[i].valor < 100) {
				System.out.printf("\nSeu ID de indentifica��o �: %d. O produto � o %s, tendo em estoque um quantidade de %.0f unidades, sendo que a unidade est� saindo pelo valor de R$%.2f.", listaProdutos[i].id, listaProdutos[i].descricao, listaProdutos[i].quantidade, listaProdutos[i].valor);
			}
		}
		
		ler.close();
	}

}
