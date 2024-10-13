public class Gafanhoto extends Pessoa
{
    private int login;
    private int totalAssistido;
    public void viumais(){
        this.totalAssistido++;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }


    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    public Gafanhoto(String nome, Double experencia, String sexo, int idade, int totalAssistido, int login) {
        super(nome, experencia, sexo, idade);
        this.totalAssistido = totalAssistido;
        this.login = login;
    }
    @Override
    public String toString() {
        return "Gafanhoto\n" +
                "nome=" + nome +
                 "\nidade=" + idade +
                 "\nlogin=" + login +
                "\ntotalAssistido=" + totalAssistido;
    }
}
