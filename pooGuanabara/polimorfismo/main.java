import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ProdutoImportado[] produtoimportado= new ProdutoImportado[10];
        ProdutoUsado[] produtousado= new ProdutoUsado[10];
        int usado=0;
        int importado=0;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu Principal\n1-Adicionar produto Usado\n2-Adicionar Produto Importado\n3-Mostrar todos os produtos\nEscolha:");
            int escolha=scanner.nextInt();
            switch (escolha){
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome= scanner.next();
                    System.out.println("Digite o preco do produto: ");
                    double preco= scanner.nextDouble();
                    System.out.println("Digite a data de fabriçação no formato dd/MM/yyyy:");
                    String data= scanner.next();
                    produtousado[usado]=new ProdutoUsado(nome,preco,data);
                    usado++;
                    break;
                case 2:
                       System.out.println("Digite o nome do produto: ");
                       String nome1= scanner.next();
                       System.out.println("Digite o preco do produto: ");
                       double preco1= scanner.nextDouble();
                       System.out.println("Digite  % de taxa cobrado");
                       int taxa= scanner.nextInt();
                       produtoimportado[importado]=new ProdutoImportado(nome1,preco1,taxa);
                       importado++;
                       break;
                case 3:
                    for (int i=0;i<usado;i++){
                        System.out.println(produtousado[i].toString());
                    }
                    for (int i=0;i<importado;i++){
                        System.out.println(produtoimportado[i].toString());
                    }



            }
        }
    }
}
