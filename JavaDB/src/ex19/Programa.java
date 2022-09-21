package ex19;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.sql.Connection;

public class Programa {

	public static void main(String[] args) throws IOException {
        AlunoDB db = new AlunoDB();
        Random random = new Random();
        Scanner ler = new Scanner(System.in);
        
        ArrayList<Aluno> listaAluno = new ArrayList<>();
        
        int id;
        int ra;
        int opcao;
        int valor = random.nextInt(100)+1;
        String nome;
        String curso;
        
        do {
        	System.out.printf("===> Sistema de Cadastro de Aluno! <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("1 - Incluir Aluno \n" +
            				  "2 - Listar Aluno \n" +
                              "3 - Sair \n");
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
            
            if(opcao == 1) {
            	Aluno aluno = new Aluno();
            	
            	id = listaAluno.size() + valor;
            	aluno.setId(id);
            	
            	System.out.printf("\nDigite o nome do aluno: ");
                nome = ler.next();
                aluno.setNome(nome);
                
                System.out.printf("Digite o ra do aluno: ");
                ra = ler.nextInt();
                aluno.setRa(ra);
                
                System.out.printf("\nDigite o curso do aluno: ");
                curso = ler.next();
                aluno.setCurso(curso);
                
                listaAluno.add(aluno);
            
                System.out.printf("Aluno incluído com sucesso!");
                System.in.read();
                
         }
            
            else if(opcao == 2) {
            	db.ListarUsuarioDB();
            }
            
        } while(opcao != 3);
        System.out.printf("Obrigado por realizar o cadastro");
       
    }


}