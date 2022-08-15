package heranca;

public class contaCorrente extends conta{
    private double chequeEspecial;
 
    public double getChequeEspecial() {
        return chequeEspecial;
    }
 
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
   
    public contaCorrente() {
    }
   
    public contaCorrente(String agencia, String numero, double saldo, double chequeEspecial, int id, String nome, int idade, String email) {
        super(agencia, numero, saldo, id, nome, idade, email);
       
        this.chequeEspecial = chequeEspecial;
    }
}