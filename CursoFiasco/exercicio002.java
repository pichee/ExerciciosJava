/*
Você foi encarregado pelo Hokage para gerenciar o
cadastro de ninjas na Vila da Folha. Sua missão é criar
um sistema simples em Java para cadastrar novos
ninjas e listar todos os ninjas cadastrados.
Tópicos a serem utilizados:
Arrays: Para armazenar os nomes dos ninjas.
Switch Cases: Para implementar um menu
interativo.
Loops: Para navegar pelas opções do menu e
iterar sobre os ninjas cadastrados.
Condicionais: Para controlar a execução das
opções do menu e validar o número de ninjas
cadastrados.
*/
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
    int escolha = 0, tamanho = 0;
    String[] nomes = new String[40];
    while (escolha != 3) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        escolha = leitor.nextInt();
        switch (escolha){
            case 1:
                System.out.print("Digite o nome do ninja: ");
                nomes[tamanho] = leitor.next();
                tamanho++;
                break;
            case 2:
                for (int i = 0; i < tamanho; i++){
                    System.out.print(nomes[i]+"\n");
                }
                break;
            case 3:
                System.out.println("\nSaindo do Sistema");
                System.exit(0);

        }
    }
}
}
