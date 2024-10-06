import Contas.ContaBanco;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBanco[] contas = new ContaBanco[100];
        Scanner sc = new Scanner(System.in);
        int num,dinheiro=0,contador=0;
        String tipo,dono;
        float deposito;
        Boolean status=true;
        while (true){
            System.out.println("\n1-Adicionr conta\n2-deposito\n3-Sacar\n4-Pagar mensalidade\n5-Mostrar detalhes\nEscolha:");
            int escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    System.out.println("Digite o número da conta:");
                     num = sc.nextInt();
                    while (true){
                        System.out.println("Sua conta vai ser\n1-poupança\n2-corrrente");
                        int op = sc.nextInt();
                        switch (op){
                            case 1:
                                tipo="poupança";
                                break;
                            case 2:
                                tipo="corrente";
                                break;
                            default:
                                System.out.println("número incorreto\nTENTE NOVAMENTE\n");
                                continue;
                        }
                        sc.nextLine();
                        System.out.println("Nome do dono da conta: ");
                        dono = sc.nextLine();
                        if (tipo.equals("poupança")){
                            dinheiro=150;
                        }
                        else{
                            dinheiro=50;
                        }
                        contas[contador]=new ContaBanco();
                        contas[contador].abrirConta(num,tipo,dono,dinheiro,status);
                        contador++;
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Digite o número da conta:");
                    num = sc.nextInt();
                    System.out.println("Digite o valor do deposito");
                    deposito = sc.nextFloat();
                    Boolean mostrar=false;
                    for (ContaBanco  conta : contas){
                        if (conta != null && conta.getNumConta() == num){
                            conta.depositar(deposito);
                            System.out.println("Deposito feito com sucesso");
                            mostrar=true;
                            break;
                        }
                    }
                    if (!mostrar){
                        System.out.println("Deposito falhou");
                    }
                    break;
                case 3:
                    System.out.println("Digite o número da conta:");
                    num = sc.nextInt();
                    System.out.println("Digite o saque do deposito");
                    deposito = sc.nextFloat();
                    mostrar=false;
                    for (ContaBanco  conta : contas){
                        if (conta != null && conta.getNumConta() == num){
                            conta.sacar(deposito);
                            System.out.println("Saque feito com sucesso");
                            mostrar=true;
                            break;
                        }
                    }
                    if (!mostrar){
                        System.out.println("Saque falhou");
                    }
                    break;
                case 4:
                    System.out.println("Digite o número da conta:");
                    num = sc.nextInt();
                    mostrar=false;
                    for (ContaBanco  conta : contas){
                        if (conta != null && conta.getNumConta() == num){
                            conta.pagarMensalidade();
                            System.out.println("Mensalidade paga");
                            mostrar=true;
                            break;
                        }
                    }
                    if (!mostrar){
                        System.out.println("Algo deu errado");
                    }
                    break;
                case 5:
                    System.out.println("Digite o número da conta:");
                    num = sc.nextInt();
                    mostrar=false;
                    for (ContaBanco  conta : contas){
                        if (conta != null && conta.getNumConta() == num){
                            conta.mostrarConta();
                            mostrar=true;
                            break;
                        }
                    }
                    if (!mostrar){
                        System.out.println("Algo deu errado");
                    }
                    break;
            }
        }
    }
}
