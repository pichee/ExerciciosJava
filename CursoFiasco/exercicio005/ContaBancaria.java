public abstract class ContaBancaria implements Conta{
    private double dinheiroDaConta;
    private int numeroDaconta;
    private String nomedotitular;
    @Override
     public void consultarSaldo() {
        System.out.println(this.dinheiroDaConta);
    }

    @Override
     public void deposito(double money){
        this.dinheiroDaConta=this.dinheiroDaConta+money;
    }

    public ContaBancaria(double dinheiroDaConta, int numeroDaconta, String nomedotitular) {
        this.dinheiroDaConta = dinheiroDaConta;
        this.numeroDaconta = numeroDaconta;
        this.nomedotitular = nomedotitular;
    }

    public String getNomedotitular() {
        return nomedotitular;
    }

    public void setNomedotitular(String nomedotitular) {
        this.nomedotitular = nomedotitular;
    }

    public int getNumeroDaconta() {
        return numeroDaconta;
    }

    public void setNumeroDaconta(int numeroDaconta) {
        this.numeroDaconta = numeroDaconta;
    }

    public double getDinheiroDaConta() {
        return dinheiroDaConta;
    }

    public void setDinheiroDaConta(double dinheiroDaConta) {
        this.dinheiroDaConta = dinheiroDaConta;
    }

}
