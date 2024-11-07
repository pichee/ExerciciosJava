
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
		List<Pessoa> listaPessoas=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		listaPessoas.add(new Pessoa("João", 25, "São Paulo"));
        listaPessoas.add(new Pessoa("Maria", 30, "Rio de Janeiro"));
        listaPessoas.add(new Pessoa("Carlos", 22, "Belo Horizonte"));
        listaPessoas.add(new Pessoa("Ana", 28, "Salvador"));
        listaPessoas.add(new Pessoa("Lucas", 35, "Fortaleza"));
        listaPessoas.add(new Pessoa("Fernanda", 40, "Curitiba"));
        listaPessoas.add(new Pessoa("Rafael", 27, "Recife"));
        listaPessoas.add(new Pessoa("Patrícia", 33, "Porto Alegre"));
        listaPessoas.add(new Pessoa("Gustavo", 29, "Florianópolis"));
        listaPessoas.add(new Pessoa("Beatriz", 26, "Brasília"));
        
        while(true){
            System.out.println("MENU\n1-Mostrar todas as Pessoas da lista"+
            "\n2-Remover uma pessoa\n"+
            "3-Ver uma pessoa especifica\n"+
            "4-Sair do programa");
            int escolha=sc.nextInt();
            switch(escolha){
                case 1:
                    for (Pessoa p : listaPessoas) {  
                        p.mostra();  
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Digite o número da Pessoa que voce quer eliminar");
                    int eliminar=sc.nextInt();
                    eliminar-=1;
                    listaPessoas.remove(eliminar);
                    break;
                case 3:
                    System.out.println("Digite o número da Pessoa que voce quer ver");
                    int ver=sc.nextInt();
                    ver-=1;
                    listaPessoas.get(ver).mostra();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
            
        }
	}
}
