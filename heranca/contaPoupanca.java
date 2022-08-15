package heranca;

public class contaPoupanca extends conta{
    private double rentabilidade;
 
    public double getRentabilidade() {
        return rentabilidade;
    }
 
    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
   
    public contaPoupanca() {
    }
   
    public contaPoupanca(String agencia, String numero, double saldo, double rentabilidade, int id, String nome, int idade, String email) {
        super(agencia, numero, saldo, id, nome, idade, email);
       
        this.rentabilidade = rentabilidade;
    }
}