package ex1;

public class conta {
    private String agencia;
    private String numero;
    private double saldo;
    private int id;
   
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
   
    conta(String agencia, String numero, double salario, int id){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = salario;
        this.id = id;
    }
}
