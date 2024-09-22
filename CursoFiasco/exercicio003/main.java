package exercicio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int escolha=0;
        Scanner sc = new Scanner(System.in);
        Ninja ninja = new Ninja();
        Uchiha u = new Uchiha();
        while (escolha!=4){
            System.out.println("\nMENU\n1-Adicionar Ninja\n2-Adicior ninja Uchicha\n3-Mostrar ninjas\n4-Sair\nEscolher:");
            escolha = sc.nextInt();
        switch (escolha){
            case 1:
                        sc.nextLine();
                        System.out.println("Digite o nome do ninja:");
                        ninja.name=sc.nextLine();
                        System.out.println("Digite a idade do ninja:");
                        ninja.age=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Digite a missão do ninja:");
                        ninja.missao=sc.nextLine();
                        System.out.println("Digite a dificuldade da missão do ninja:");
                        ninja.dificuldadeMissao=sc.nextLine();
                        System.out.println("Digite o status da missão ninja:");
                        ninja.statusDamissao=sc.nextLine();
                        break;
            case 2:
                sc.nextLine();
                System.out.println("Digite o nome do ninja:");
                u.name=sc.nextLine();
                System.out.println("Digite a idade do ninja:");
                u.age=sc.nextInt();
                sc.nextLine();
                System.out.println("Digite a missão do ninja:");
                u.missao=sc.nextLine();
                System.out.println("Digite a dificuldade da missão do ninja:");
                u.dificuldadeMissao=sc.nextLine();
                System.out.println("Digite o status da missão ninja:");
                u.statusDamissao=sc.nextLine();
                break;
            case 3:
                if (u.name!=null &&ninja.name!=null){
                ninja.informacao();
                u.informacaos();
                }
                else{
                    System.out.printf("Voce não colocou as informaçoes dos ninjas");
                }
                break;
            case 4:
                escolha=4;
                break;
            default:
                        System.out.printf("Algo deu errado tente novamente");
                        break;
                }
        }

    }
}
