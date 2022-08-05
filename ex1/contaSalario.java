package ex1;

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
	
	public contaSalario(String agencia, String numero, double saldo, double contaSalario, int id){
		super(agencia, numero,saldo, id);
		
		this.salario = salario;
	}
	
}
