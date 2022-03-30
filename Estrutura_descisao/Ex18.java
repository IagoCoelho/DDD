package estrutura_decisao;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double aceleracao, tempo, VelocidadeInicial, velocidade, velocidadeFinal;
		
		System.out.printf("Digite a Velocidade Inicial do veiculo(Caso o veiculo esteja parado sua velocidade inicial é 0(Zero)): ");
		VelocidadeInicial = ler.nextDouble();
		
		System.out.printf("Digite a aceleração do veiculo: ");
		aceleracao = ler.nextDouble();
		
		System.out.printf("Insira o tempo (em segundos) gasto pelo veiculo para completar o percurso: ");
		tempo = ler.nextDouble();
		
		velocidade = VelocidadeInicial + (aceleracao * tempo);
		
		velocidadeFinal = velocidade * 3.6;
		
		if(velocidade < 40) {
			System.out.printf("Veiculo muito lento");
		}
		else if(40 < velocidadeFinal && velocidadeFinal <= 60) {
			System.out.printf("Velocidade Permitida");
		}
		else if(60 < velocidadeFinal && velocidadeFinal <= 80) {
			System.out.printf("Velocidade de Cruzeiro");
	}
		else if(80 < velocidadeFinal && velocidadeFinal <= 120) {
			System.out.printf("Veiculo Rápido");
	}
		else if(velocidadeFinal > 120) {
			System.out.printf("Veiculo muito rápido");
	}
		else {
			}
		}

}
