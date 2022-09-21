package ex20;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.sql.Connection;

public class Programa {

	public static void main(String[] args) throws IOException {
        ProdutoDB db = new ProdutoDB();
        Random random = new Random();
        Scanner ler = new Scanner(System.in);
        
        ArrayList<Produto> listaProduto = new ArrayList<>();
        
        int id;
        int qtd;
        int opcao;
        int valor = random.nextInt(100)+1;
        Double preco;
        String nome;
        String curso;
        
        do {
        	System.out.printf("===> Cadastro de Produto! <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("1 - Incluir Produto \n" +
            				  "2 - Listar Produto \n" +
                              "3 - Sair \n");
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
            
            if(opcao == 1) {
            	Produto produto = new Produto();
            	
            	id = listaProduto.size() + valor;
            	produto.setId(id);
            	
            	System.out.printf("\nDigite o nome do produto: ");
                nome = ler.next();
                produto.setNome(nome);
                
                System.out.printf("Digite a quantidade do produto: ");
                qtd = ler.nextInt();
                produto.setQtd(qtd);
                
                System.out.printf("\nDigite o preço do produto: ");
                preco = ler.nextDouble();
                produto.setPreco(preco);
                
                listaProduto.add(produto);
            
                System.out.printf("Produto incluído com sucesso!");
                System.in.read();
                
         }
            
            else if(opcao == 2) {
            	db.ListarProdutoDB();
            }
            
        } while(opcao != 3);
        System.out.printf("Obrigado por realizar o cadastro");
       
    }


}