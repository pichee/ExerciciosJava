public abstract class  Pessoa {
    protected String nome;
    protected int idade;
    private String sexo;
    private Double experencia;

    public Pessoa(String nome, Double experencia, String sexo, int idade) {
        this.nome = nome;
        this.experencia = experencia;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getExperencia() {
        return experencia;
    }

    public void setExperencia(Double experencia) {
        this.experencia = experencia;
    }

    public void ganharexperencia() {
        this.experencia = this.experencia + 0.5;
    }
}
