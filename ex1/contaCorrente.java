package ex1;

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
   
    public contaCorrente(String agencia, String numero, double saldo, double chequeEspecial, int id) {
        super(agencia, numero, saldo, id);
       
        this.chequeEspecial = chequeEspecial;
    }
}

