package application;
public class dados {
    public String nome;
    public Double imposto;
    public Double salario;
    public Double getSalario() {
        return salario-imposto;
    }

    public Double porcentagem;
    public Double novoSalario(){
        return salario+(salario*(porcentagem/100))-imposto;
    }
}
