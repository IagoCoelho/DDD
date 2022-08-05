package ex1;

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
   
    public contaPoupanca(String agencia, String numero, double saldo, double rentabilidade, int id) {
        super(agencia, numero, saldo, id);
       
        this.rentabilidade = rentabilidade;
    }
}

