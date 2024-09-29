public class NinjaBasico implements Ninja{
    public String nome;
    public int idade;
    public String habilidade;
    public TiposHabilidades tiposHabilidades;
    public void setAll(String habilidade, String nome, int idade, TiposHabilidades tiposHabilidades) {
        this.habilidade = habilidade;
        this.nome = nome;
        this.idade = idade;
        this.tiposHabilidades=tiposHabilidades;
    }
    @Override
    public void mostrarInformacao() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("TiposHabilidades: " + tiposHabilidades);
    }
    @Override
    public void executarHabilidade() {
        System.out.println("A habilidade " + habilidade+" Foi executada\n");
    }
}
