package heranca;

public class contaSalario extends conta{
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public contaSalario() {
	}
	
	public contaSalario(String agencia, String numero, double saldo, double contaSalario, int id, String nome, int idade, String email){
		super(agencia, numero,saldo, id, nome, idade, email);
		
		this.salario = salario;
	}
	
}