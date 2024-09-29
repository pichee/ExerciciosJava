public class NinjaAvancado extends NinjaBasico implements Ninja {
    private String especialidade;
    public void setAll(String habilidade, String nome, int idade, TiposHabilidades tiposHabilidades,String especialidade) {
        this.habilidade = habilidade;
        this.nome = nome;
        this.idade = idade;
        this.tiposHabilidades=tiposHabilidades;
        this.especialidade = especialidade;
    }
    @Override
    public void mostrarInformacao() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("TiposHabilidades: " + tiposHabilidades);
        System.out.println("Especialidade: " + especialidade);
    }
    @Override
    public void executarHabilidade() {
        System.out.println("A habilidade" + habilidade+" Foi executada\n");
    }
}
