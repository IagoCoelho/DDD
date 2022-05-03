package Ex34;

import java.util.Scanner;



public class Sistema {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Cliente[] listaClientes = new Cliente[1];
		char possuiContaBancaria;
		
		for(int i=0; i<=4; i++) {
			Cliente c= new Cliente();
			
			System.out.printf("Digite o id do cliente: ");
			c.id = ler.nextInt();
			
			System.out.printf("Digite o nome do cliente: ");
			c.nome = ler.next();
			
			System.out.printf("Digite o idade do cliente: ");
			c.idade = ler.nextInt();
			
			System.out.printf("Digite o email do cliente: ");
			c.email = ler.next();
			
			System.out.printf("Possui conta bancária? (S/N): ");
			possuiContaBancaria = ler.next().charAt(0);
			
			if (possuiContaBancaria == 'S') {
				ContaBancaria ct = new ContaBancaria();
				
				System.out.printf("Digite a agência da conta: ");
				ct.agencia = ler.next();
				
				System.out.printf("Digite o número da conta: ");
				ct.numero = ler.next();
				
				System.out.printf("Digite o saldo da conta: ");
				ct.saldo = ler.nextDouble();
				
				c.conta = ct;
			}
			else {
				c.conta = null;
			}
			
			listaClientes[i] = c;
		}
		
		for(int i=0; i<2; i++) {
			System.out.printf("/n%s", listaClientes[i].exibirNomeIdade());
		}

	}

}
