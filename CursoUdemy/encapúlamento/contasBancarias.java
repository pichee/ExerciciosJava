public class contasBancarias
{
    private int numeroDaconta;
    private String nomeDaconta;
    private double saldoDaconta;

    public contasBancarias(int numeroDaconta, String nomeDaconta, double saldoDaconta) {
        this.numeroDaconta = numeroDaconta;
        this.nomeDaconta = nomeDaconta;
        this.saldoDaconta = saldoDaconta;
    }
    public void mostrarDados(){
        System.out.println("\nNúmero da conta: " + numeroDaconta+"\nNome do titular:"+nomeDaconta+"\nsaldo da conta:R$"+saldoDaconta);
    }
    public int getNumeroDaconta(int numeroDaconta){
        this.numeroDaconta = numeroDaconta;
        return numeroDaconta;
    }
    public String mudarNomeDaconta(String nomeDaconta){
        this.nomeDaconta = nomeDaconta;
        return nomeDaconta;
    }
    public double depositou(double saldoDaconta) {
        this.saldoDaconta = saldoDaconta+this.saldoDaconta;
        return saldoDaconta;
    }
    public void saque(double saldoDaconta) {
        this.saldoDaconta = this.saldoDaconta-saldoDaconta;
    }
}
