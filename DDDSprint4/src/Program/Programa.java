package Program;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Random;
public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		ArrayList<Usuario> listaUsuario = new ArrayList<>();
		Random rand = new Random();
		int id, idade, opcao, telefone;
		String nome, email, senha, enderecos, formacoes, cursos, idiomas, experiencias, certificacoes;


		do {
			System.out.printf("\n===> Tela de cadastro <===\n\n");
			System.out.printf("1 - Criar cadastro\n"+
							  "2 - Exibir informações\n"+
							  "3 - Sair\n");
			
			System.out.printf("\nDigite a opção desejada: \n");
			opcao=ler.nextInt();
			
			if(opcao==1) {
				Usuario usuario = new Usuario();
				id = listaUsuario.size()+1;
				usuario.setId(id);
				
				System.out.printf("\nDigite seu nome: ");
				nome=ler.next();
				usuario.setNome(nome);
				
				System.out.printf("Digite sua idade: ");
				idade=ler.nextInt();
				usuario.setIdade(idade);
				
				System.out.printf("Digite seu email: ");
				email=ler.next();
				usuario.setEmail(email);
				
				System.out.printf("Crie uma senha: ");
				senha=ler.next();
				usuario.setSenha(senha);
		
				System.out.printf("Possui contato cadastrado?\n");
				System.out.printf("1 - Sim \n" +
                        		  "2 - Não \n");
				System.out.printf("Digite a opção desejada: ");
				opcao = ler.nextInt();
				
				
				if(opcao == 2) {
                	System.out.printf("Quer cadastrar seu contato?\n");
                    System.out.printf("1 - Sim \n" +
                                      "2 - Não \n");
                    System.out.printf("Digite a opção desejada: ");
                    opcao = ler.nextInt();
                    
                    if(opcao == 1) {
                    	Contatos contato = new Contatos();
                    	System.out.printf("\nDigite seu telefone: ");
                        telefone = ler.nextInt();
                        contato.setTelefone(telefone);
                        usuario.setContatos(contato);
                        }
                    }
				
				
					System.out.printf("Possui endereço cadastrado?\n");
					System.out.printf("1 - Sim \n" +
					        		  "2 - Não \n");
					System.out.printf("Digite a opção desejada: ");
					opcao = ler.nextInt();
				
				
					if(opcao == 2) {
						System.out.printf("Quer cadastrar seu endereço?\n");
						System.out.printf("1 - Sim \n" +
										  "2 - Não \n");
                        System.out.printf("Digite a opção desejada: ");
                        opcao = ler.nextInt();
                    
                        if(opcao == 1) {
                        Endereco endereco = new Endereco();
                        System.out.printf("\nDigite seu endereço: ");
                        enderecos = ler.next();
                        endereco.setEndereco(enderecos);
                        usuario.setEnderecos(endereco);
				        }
				  }
					
					
					System.out.printf("Possui formação cadastrada?\n");
					System.out.printf("1 - Sim \n" +
					        		  "2 - Não \n");
					System.out.printf("Digite a opção desejada: ");
					opcao = ler.nextInt();
					
					
						if(opcao == 2) {
							System.out.printf("Quer cadastrar sua formação?\n");
							System.out.printf("1 - Sim \n" +
											  "2 - Não \n");
	                        System.out.printf("Digite a opção desejada: ");
	                        opcao = ler.nextInt();
	                    
	                        if(opcao == 1) {
	                        Formacao formacao = new Formacao();
	                        System.out.printf("\nDigite sua formação: ");
	                        formacoes = ler.next();
	                        formacao.setFormacao(formacoes);
	                        usuario.setFormacoes(formacao);
					        }
					  }
						
						
						System.out.printf("Possui cursos cadastrados?\n");
						System.out.printf("1 - Sim \n" +
						        		  "2 - Não \n");
						System.out.printf("Digite a opção desejada: ");
						opcao = ler.nextInt();
						
						
							if(opcao == 2) {
								System.out.printf("Quer cadastrar seus cursos?\n");
								System.out.printf("1 - Sim \n" +
												  "2 - Não \n");
		                        System.out.printf("Digite a opção desejada: ");
		                        opcao = ler.nextInt();
		                    
		                        if(opcao == 1) {
		                        Cursos curso = new Cursos();
		                        System.out.printf("\nDigite seus cursos: ");
		                        cursos = ler.next();
		                        curso.setCursos(cursos);
		                        usuario.setCurso(curso);
						        }
						  }
							
							
							System.out.printf("Possui idiomas cadastrados?\n");
							System.out.printf("1 - Sim \n" +
							        		  "2 - Não \n");
							System.out.printf("Digite a opção desejada: ");
							opcao = ler.nextInt();
							
							
								if(opcao == 2) {
									System.out.printf("Quer colocar quais idiomas você fala?\n");
									System.out.printf("1 - Sim \n" +
													  "2 - Não \n");
			                        System.out.printf("Digite a opção desejada: ");
			                        opcao = ler.nextInt();
			                    
			                        if(opcao == 1) {
			                        Idiomas idioma = new Idiomas();
			                        System.out.printf("\nDigite seus idiomas: ");
			                        idiomas = ler.next();
			                        idioma.setIdiomas(idiomas);
			                        usuario.setIdioma(idioma);
							        }
							  }
								
								
								System.out.printf("Possui experiencia cadastrada?\n");
								System.out.printf("1 - Sim \n" +
								        		  "2 - Não \n");
								System.out.printf("Digite a opção desejada: ");
								opcao = ler.nextInt();
								
								
									if(opcao == 2) {
										System.out.printf("Quer colocar suas experiencias?\n");
										System.out.printf("1 - Sim \n" +
														  "2 - Não \n");
				                        System.out.printf("Digite a opção desejada: ");
				                        opcao = ler.nextInt();
				                    
				                        if(opcao == 1) {
				                        Experiencia experiencia = new Experiencia();
				                        System.out.printf("\nDigite suas experiencias: ");
				                        experiencias = ler.next();
				                        experiencia.setTemExperiencia(experiencias);
				                        usuario.setExperiencia(experiencia);
								        }
								  }
									
									
									System.out.printf("Possui certificado cadastrado?\n");
									System.out.printf("1 - Sim \n" +
									        		  "2 - Não \n");
									System.out.printf("Digite a opção desejada: ");
									opcao = ler.nextInt();
									
									
										if(opcao == 2) {
											System.out.printf("Quer cadastrar seus certificados?\n");
											System.out.printf("1 - Sim \n" +
															  "2 - Não \n");
					                        System.out.printf("Digite a opção desejada: ");
					                        opcao = ler.nextInt();
					                    
					                        if(opcao == 1) {
					                        Certificacao certificacao = new Certificacao();
					                        System.out.printf("\nDigite suas certificações: ");
					                        certificacoes = ler.next();
					                        certificacao.setTipoCertificacao(certificacoes);
					                        usuario.setCertificacao(certificacao);
									        }
									  }

				listaUsuario.add(usuario);
				System.out.printf("Cadastrado feito com sucesso!");
				System.in.read();
			
			}else if(opcao==2) {
				for(Usuario a: listaUsuario) {
					System.out.printf("\nID: %d - NOME: %s "+
									  "\nEmail: %s - Idioma: %s"+
									  "\nTelefone: %d - Idade: %d",a.getId(),a.getNome().toUpperCase(), a.getEmail(), a.getIdioma().getIdiomas().toUpperCase(), a.getContatos().getTelefone(), a.getIdade());
				}
				System.out.printf("\nDigite o id da sua conta: ");
				id=ler.nextInt();
				Usuario usuario = listaUsuario.get(id-1);
				System.in.read();
			}
					}while(opcao!=3);
			ler.close();
			
	}
}