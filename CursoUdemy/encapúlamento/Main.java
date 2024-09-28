import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o número da conta:");
        int numero = sc.nextInt();
        System.out.printf("Digite o nome do titular:");
        String titular = sc.next();
        System.out.printf("Digite o Saldo inicial da conta:");
        double saldo = sc.nextDouble();
        contasBancarias contas = new contasBancarias(numero, titular, saldo);

        while (true){
            System.out.println("------------MENU------------\nCONFIGURAÇÕES DA CONTA:"+contas.getNumeroDaconta(numero)+"\n----------------------------\n");
            System.out.printf("1-Mudar nome do titular\n2-Deposito\n3-Saque\n4-Mostar todos os dados\nEscolha:");
            int escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    System.out.println("Digite o novo nome do titular:");
                    titular = sc.next();
                    contas.mudarNomeDaconta(titular);
                    break;
                case 2:
                    System.out.println("Digite o valor do deposito:");
                    saldo = sc.nextDouble();
                    contas.depositou(saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor do saque:");
                    saldo = sc.nextDouble();
                    saldo=saldo+5;
                    contas.saque(saldo);
                    break;
                case 4:
                    contas.mostrarDados();
                    break;
                default:
                    System.out.println("Opção invalida.");
            }
        }
    }
}
