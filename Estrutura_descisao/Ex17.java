package estrutura_decisao;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		String sexo;
		
		System.out.printf("Digite seu sexo: ");
		sexo = ler.next();
		
		System.out.printf("Digite seu peso: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite sua altura: ");
		altura = ler.nextDouble();
		
		imc = peso / altura * altura;
		
		if (sexo.equals("feminino")) {
			if(imc < 19) {
			System.out.printf("Abaixo do peso.");
		} else if(imc <= 19 || imc < 24) {
			System.out.printf("Peso ideal.");
		} else if(imc >= 24) {
			System.out.printf("Acima do peso.");
		} 
		if (sexo.equals("masculino")) {
			if(imc < 20) {
			System.out.printf("Abaixo do peso.");
			} else if(imc <= 20 || imc < 25) {
			System.out.printf("Peso ideal.");
			} else if(imc >= 25) {
			System.out.printf("Acima do peso.");
			}
	      }
	    }
      }
    }
		