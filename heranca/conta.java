package heranca;

import java.util.ArrayList;

public class conta {
    private String agencia;
    private String numero;
    private double saldo;
    private int id;
    private String nome;
    private int idade;
    private String email;
    private ArrayList <String> extrato;
   
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAgencia() {
        return agencia;
    }
 
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
 
    public String getNumero() {
        return numero;
    }
 
    public void setNumero(String numero) {
        this.numero = numero;
    }
 
    public double getSaldo() {
        return saldo;
    }
 
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
 
    protected String exibirMensagem() {
        return "Bem vindo ao Internet Banking do Prof. Joseffe!";
    }  
   
    conta(){
       
    }
   
    conta(String agencia, String numero, double salario, int id, String nome, int idade, String email, ArrayList <String> extrato){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = salario;
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.extrato = extrato;
    }
    
    public void Depositar (double valorDeposito) {
		saldo += valorDeposito;
		extrato.add("Depósito + $" + valorDeposito);
	}
}