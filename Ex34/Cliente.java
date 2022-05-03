package Ex34;

public class Cliente {
	public int id;
	public String nome;
	public int idade;
	public String email;
	public ContaBancaria conta;
	
	Cliente() {
		
	}
	
	Cliente(int id, String nome, String email, int idade, ContaBancaria conta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public void atualizarEmail(String novoEmail) {
		this.email = novoEmail;
	}
	
	public String exibirNomeIdade() {
		return this.nome + " - " + this.idade;
	}
	
	public String exibirDadosConta() {
		return "Ag: " + this.conta.agencia + " - " + "Num: " + this.conta.numero;
	}

}