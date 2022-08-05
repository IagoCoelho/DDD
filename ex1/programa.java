package ex1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class programa {

    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
       
        ArrayList<conta> listaConta = new ArrayList<>();
        ArrayList<contaSalario> listaContaSalario = new ArrayList<>();
        ArrayList<contaCorrente> listaContaCorrente = new ArrayList<>();
        ArrayList<contaPoupanca> listaContaPoupanca = new ArrayList<>();
       
        int opcao;
        int id;
        String agencia;
        String numero;
        Double saldo;
        Double chequeEspecial;
    	Double rentabilidade;
    	   	
			do {        
	            System.out.printf("===> Sistema de Cadastro de Contas! <===\n\n");
	            System.out.printf("Escolha uma opção:\n");
	            System.out.printf("1 - Incluir Conta \n" +
	                              "2 - Consultar Conta Poupança \n" +
	                              "3 - Excluir Cliente \n" +
	                              "4 - Exibir Cliente \n" +
	                              "5 - Sair\n\n");
	            System.out.printf("Digite a opção desejada: ");
	            opcao = ler.nextInt();
	           
	            if (opcao == 1) {
	                conta conta = new conta();
	               
	                id = listaConta.size() + 1;
	                conta.setId(id);
	               
	                System.out.printf("\nDigite o número da agência: ");
	                agencia = ler.next();
	                conta.setAgencia(agencia);
	               
	                System.out.printf("Digite o número da conta: ");
	                numero = ler.next();
	                conta.setNumero(numero);
	                
	                System.out.printf("Digite o saldo: ");
	                saldo = ler.nextDouble();
	                conta.setSaldo(saldo);
	                
	                System.out.printf("Digite o saldo da conta poupança: ");
	                rentabilidade = ler.nextDouble();
	                conta.setRentabilidade(rentabilidade);
	            }
	            
	            else if (opcao == 2) {
	                for(Cliente cliente: listaCliente) {
	                    System.out.printf("ID: %d - Nome: %s - Agencia: %s - Número: %s - Saldo: %d \n", cliente.getId(), cliente.getNome(), cliente.getConta().getAgencia(), cliente.getConta().getNumero(), cliente.getConta().getSaldo());
	                }
	               
	                System.out.printf("\nDigite o id do cliente que deseja atualizar: ");
	                id = ler.nextInt();
	               
	                System.out.printf("Digite o novo nome do cliente: ");
	                nome = ler.next();
	                
	                System.out.printf("Digite a agencia do cliente: ");
	                agencia = ler.next();
	               
	                System.out.printf("Digite o número da conta do cliente: ");
	                numero = ler.next();
	                
	                System.out.printf("Digite o saldo da conta do cliente: ");
	                saldo = ler.nextDouble();
	                
	                Cliente cliente = listaCliente.get(id-1);
	               
	                cliente.setNome(nome);
	                cliente.getConta().setAgencia(agencia);
	                cliente.getConta().setNumero(numero);
	                cliente.getConta().setSaldo(saldo);
	               
	                System.out.printf("Cliente atualizado com sucesso!");
	                System.in.read();                
	            }
	            
	            else if (opcao == 3) {
	                for(Cliente cliente: listaCliente) {
	                	System.out.printf("ID: %d - Nome: %s - Agencia: %s - Número: %s - Saldo: %d \n", cliente.getId(), cliente.getNome(), cliente.getConta().getAgencia(), cliente.getConta().getNumero(), cliente.getConta().getSaldo());
	                }
	               
	                System.out.printf("\nDigite o id do cliente para exclusão: ");
	                id = ler.nextInt();
	 
	                listaCliente.remove(id-1);
	               
	                System.out.printf("Cliente excluído com sucesso!");
	                System.in.read();
	            }
	            
	            else if (opcao == 4) {
	            	for(Cliente cliente: listaCliente) {
	                	System.out.printf("ID: %d - Nome: %s - Agencia: %s - Número: %s - Saldo: %d \n", cliente.getId(), cliente.getNome(), cliente.getConta().getAgencia(), cliente.getConta().getNumero(), cliente.getConta().getSaldo());
	                }
	            	
	                System.in.read();
	            }


	        }while(opcao != 5);
	}

}