public class Contas implements Opcoes{
    private int numero;
    private String holder;
    private double withdrawLimit;
    private double balance;

    public Contas(int numero, String holder, double withdrawLimit, double balance) {
        this.numero = numero;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
        this.balance = balance;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double valor) {
        System.out.println("NEW value is "+this.balance);
    }

    @Override
    public void withdraw(double emprestimo) {
        if (emprestimo<=this.withdrawLimit){
            this.balance=this.balance-emprestimo;

        }else{
            System.out.println("Withdraw ERROR");
            System.exit(0);
        }
    }
}
