package estrutura_repeticao;

import java.util.Scanner;

public class Ex26F {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner ler = new Scanner (System.in)) {
			int num1, t, i, i1, i2;
			
			System.out.printf("Digite um PRIMEIRO n�mero positivo: ");
			num1 = ler.nextInt();
			
			while (num1 <= 0) {
				System.out.printf ("Erro, n�mero negativo! Digite um n�mero positivo: ");
				num1 = ler.nextInt();
			}
			
			System.out.printf("Digite o primeiro n�mero do intervalo da tabuada: ");
			i1 = ler.nextInt();
			
			
			System.out.printf("Digite o 2� n�mero do intervalo da tabuada, sendo este maior que o primeiro: ");
			i2 = ler.nextInt();
			
			while (i2 <= i1) {
				System.out.printf ("Erro! Digite um n�mero maior que o primeiro digitado: ");
				i2 = ler.nextInt();
			}	
					
					for (i = i2; i >= i1; i--) {
						t = num1 * i;
						System.out.printf("\n%d X %d = %d", num1, i, t);
					}
				} 	
			}
		}