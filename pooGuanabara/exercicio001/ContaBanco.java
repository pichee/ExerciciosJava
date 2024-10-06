package Contas;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    //METODOS:
    public void abrirConta(int numConta,String tipo,String dono,float saldo,boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;

    }
    public void mostrarConta() {
        System.out.println("Conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono
        + "\nSaldo: " + this.saldo
        + "\nStatus: " + this.status
        );
    }
    public void depositar(float valor){
        this.saldo += valor+this.saldo;

    }
    public void sacar(float valor){
        this.saldo -= valor-this.saldo;

    }
    public void pagarMensalidade(){
        this.saldo =this.saldo-15;
    }
}
