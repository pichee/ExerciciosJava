public class Pessoa{
    int idade;
    String nome;
    String cidade;
    
    public Pessoa(String nome,int idade,String cidade){
        this.idade=idade;
        this.nome=nome;
        this.cidade=cidade;
    }
    public void mostra(){
        System.out.println("Idade:"+idade);
         System.out.println("NOME:"+nome);
          System.out.println("City:"+cidade);
    }
}
