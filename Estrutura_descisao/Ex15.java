package estrutura_decisao;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double valor1, valor2, valor3, soma;
		
		System.out.printf("Digite o primeiro valor: ");
		valor1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		valor2 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro valor: ");
		valor3 = ler.nextDouble();
		
		if(valor1 + valor2 > valor3 && valor2 + valor1 > valor3 && valor3 + valor2 > valor1) {
			if(valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
				System.out.printf("Esse � um trian�gulo escaleno");
			} else if(valor1 == valor2 && valor2 != valor3 || valor1 == valor3 && valor3 != valor2 || valor2 == valor3 && valor3 != valor1) {
				System.out.printf("Esse tri�ngulo � is�sceles");
			}else {
				System.out.printf("esse tri�ngulo � equil�tero");
			}
		}else{
			System.out.printf("ele n�o � um tri�ngulo");
			}
		
	}

}


//if(valor1 != valor2 && valor1 != valor3) {
	//System.out.printf("� um tri�ngulo Is�sceles");
//} else if(valor1 == valor2 && valor1 != valor3 || valor1 == valor3 && valor1 != valor2) {
//	System.out.printf("� um tri�ngulo Escaleno");
//} else {
//	System.out.printf("O tri�ngulo � equilatero");
//}