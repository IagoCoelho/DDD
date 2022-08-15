package heranca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class programa {

    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
       
        ArrayList<conta> listaConta = new ArrayList<>();
        ArrayList<contaCorrente> listaContaCorrente = new ArrayList<>();
        ArrayList<contaPoupanca> listaContaPoupanca = new ArrayList<>();
        ArrayList<contaSalario> listaContaSalario = new ArrayList<>();
       
        int opcao;
        int id;
        String nome;
        int idade;
        String email;
        conta conta;
    	String agencia;
    	String numero;
    	Double saldo;
    	
			do {        
	            System.out.printf("===> Sistema de Cadastro de Cliente! <===\n\n");
	            System.out.printf("Escolha uma opção:\n");
	            System.out.printf("1 - Criar Conta \n" +
	                              "2 - Criar Conta Corrente \n" +
	                              "3 - Criar Conta Poupança \n" +
	                              "4 - Criar Conta Salário \n" +
	                              "5 - Sair\n\n");
	            System.out.printf("Digite a opção desejada: ");
	            opcao = ler.nextInt();
	           
	            if (opcao == 1) {
	                conta Conta = new conta();
	               
	                id = listaConta.size() + 1;
	                Conta.setId(id);
	               
	                System.out.printf("\nDigite o nome do cliente: ");
	                nome = ler.next();
	                Conta.setNome(nome);
	               
	                System.out.printf("Digite a idade do cliente: ");
	                idade = ler.nextInt();
	                Conta.setIdade(idade);
	                
	                System.out.printf("Digite o email do cliente: ");
	                email = ler.next();
	                Conta.setEmail(email);
          
	                listaConta.add(Conta);
	               
	                System.out.printf("Conta criada com sucesso!");
	                System.in.read();
	            }
	            else if (opcao == 2) {
	            	contaCorrente ContaCorrente = new contaCorrente();
		               
	                id = listaContaCorrente.size() + 1;
	                ContaCorrente.setId(id);
	               
	                System.out.printf("\nDigite o nome do cliente: ");
	                nome = ler.next();
	                ContaCorrente.setNome(nome);
	               
	                System.out.printf("Digite a idade do cliente: ");
	                idade = ler.nextInt();
	                ContaCorrente.setIdade(idade);
	                
	                System.out.printf("Digite o email do cliente: ");
	                email = ler.next();
	                ContaCorrente.setEmail(email);
          
	                listaContaCorrente.add(ContaCorrente);
	               
	                System.out.printf("Conta Corrente criada com sucesso!");
	                System.in.read();                
	            }
	            
	            else if (opcao == 3) {
	            	contaPoupanca ContaPoupanca = new contaPoupanca();
		               
	                id = listaContaPoupanca.size() + 1;
	                ContaPoupanca.setId(id);
	               
	                System.out.printf("\nDigite o nome do cliente: ");
	                nome = ler.next();
	                ContaPoupanca.setNome(nome);
	               
	                System.out.printf("Digite a idade do cliente: ");
	                idade = ler.nextInt();
	                ContaPoupanca.setIdade(idade);
	                
	                System.out.printf("Digite o email do cliente: ");
	                email = ler.next();
	                ContaPoupanca.setEmail(email);
          
	                listaContaPoupanca.add(ContaPoupanca);
	               
	                System.out.printf("Conta Poupança criada com sucesso!");
	                System.in.read(); 
	            }
	            
	            else if (opcao == 4) {
	            	contaSalario ContaSalario = new contaSalario();
		               
	                id = listaContaPoupanca.size() + 1;
	                ContaSalario.setId(id);
	               
	                System.out.printf("\nDigite o nome do cliente: ");
	                nome = ler.next();
	                ContaSalario.setNome(nome);
	               
	                System.out.printf("Digite a idade do cliente: ");
	                idade = ler.nextInt();
	                ContaSalario.setIdade(idade);
	                
	                System.out.printf("Digite o email do cliente: ");
	                email = ler.next();
	                ContaSalario.setEmail(email);
          
	                listaContaSalario.add(ContaSalario);
	               
	                System.out.printf("Conta Salário criada com sucesso!");
	                System.in.read();
	            }


	        }while(opcao != 5);
	}

}