import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Pedido{
    private List<String> produtos=new ArrayList<>();
    private List<Integer> quantidade=new ArrayList<>();
    private List<Double> preco=new ArrayList<>();
    private String nome;
    private String email;
    private String data;
    public void cliente(String nome,String email,String data){
        this.nome=nome;
        this.email=email;
        this.data=data;
    }
    public void adicionar(String produto,int quantidade,Double preco ){
        produtos.add(produto);
        this.quantidade.add(quantidade);
        this.preco.add(preco);
    }
    public void mostrar(int i){
        System.out.print(produtos.get(i)+",  $"+quantidade.get(i)+",Total:"+preco.get(i));
    }
    public void total(){
        double pagar=0;
        for(double total:preco){
             pagar=pagar+total;
        }
        System.out.print("Total:"+pagar);  
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pedido pedido=new Pedido();
        System.out.print("Digite o Seu nome:");
        String nome=sc.nextLine();
        System.out.print("Digite o Seu email:");
        String email=sc.nextLine();
        System.out.print("Digite sua Data de Nascimento(dd/mm/yyyy):");
        String data=sc.nextLine();
        pedido.cliente(nome,email,data);
        System.out.print("------------------------");
        //Interface colocar dps
        System.out.print("Digite quantos itens diferentes voce vai comprar:");
        int numeroItens=sc.nextInt();
        for(int i=0;i<numeroItens;i++){
            sc.nextLine();
            System.out.print("Digite o nome:");
            nome=sc.nextLine();
            System.out.print("Digite a quantidade");
            int quantidade=sc.nextInt();
            System.out.print("Digite o preço:");
            double preco=sc.nextDouble();
            preco=preco*quantidade;
            pedido.adicionar(nome,quantidade,preco);
        }
        System.out.print("Ites:");
        for(int i=0;i<numeroItens;i++){
            pedido.mostrar(i);
        }
        pedido.total();
        
        
    }
    
}