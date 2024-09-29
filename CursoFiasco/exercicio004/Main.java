import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner escolha = new Scanner(System.in);
        NinjaBasico[] ninjabasicos = new NinjaBasico[10];
        NinjaAvancado[] ninjaAvancados = new NinjaAvancado[10];
        int contadorNinjasBasicos=0,tipo,idade;
        int contadorNinjasAvancados=0;
        String habilidade,nome;
        while (true) {
            System.out.print("------------MENU------------\n1-Adicionar ninja Basico\n2-Adicionar ninja Avancado\n3-Mostrar todos os ninjas\n4-Utilizar Habilidade Ninja Basico\n5-Utilizar Habilidade Ninja Avançado\n6-Sair\nESCOLHA:");
            int opcao = escolha.nextInt();
            TiposHabilidades tipoDoNinja = null;
            switch (opcao) {
                case 1:
                    if (contadorNinjasBasicos >= 10) {
                        System.out.println("Voce não pode adicionar mais ninjas basicos");
                        break;
                    }
                    escolha.nextLine();
                    System.out.print("Informe o nome do ninja:");
                    nome = escolha.nextLine();
                    System.out.print("Informe a idade do ninja:");
                    idade = escolha.nextInt();
                    escolha.nextLine();
                    System.out.print("A habilidade do ninja:");
                    habilidade = escolha.nextLine();
                    System.out.println("Tipo do ninja:\n1-TAIJUTSU\n2-NINJUTSU\n3-GENJUTSU\n4-KATON\n5-RINNENGAN");
                    tipo = escolha.nextInt();
                    switch (tipo) {
                        case 1:
                            tipoDoNinja = TiposHabilidades.TAIJUTSU;
                            break;
                        case 2:
                            tipoDoNinja = TiposHabilidades.NINJUTSU;
                            break;
                        case 3:
                            tipoDoNinja = TiposHabilidades.GENJUTSU;
                            break;
                        case 4:
                            tipoDoNinja = TiposHabilidades.KATON;
                            break;
                        case 5:
                            tipoDoNinja = TiposHabilidades.RINNENGAN;
                            break;
                        default:
                            System.out.println("Opção invalida tente adicionar o ninja novamente");
                            break;
                    }
                    if (tipoDoNinja != null) {
                        ninjabasicos[contadorNinjasBasicos] = new NinjaBasico();
                        ninjabasicos[contadorNinjasBasicos].setAll(habilidade, nome, idade, tipoDoNinja);
                        contadorNinjasBasicos++;
                    } else {
                        System.out.println("Algo deu errado");
                    }
                    break;
                case 2:
                    if (contadorNinjasAvancados >= 10) {
                        System.out.println("Voce não pode adicionar mais ninjas avançados");
                        break;
                    }
                    escolha.nextLine();
                    System.out.print("Informe o nome do ninja:");
                    nome = escolha.nextLine();
                    System.out.print("Informe a idade do ninja:");
                    idade = escolha.nextInt();
                    escolha.nextLine();
                    System.out.print("A habilidade do ninja:");
                    habilidade = escolha.nextLine();
                    System.out.println("Especialidade do ninja:");
                    String especialidade = escolha.nextLine();
                    System.out.println("Tipo do ninja:\n1-TAIJUTSU\n2-NINJUTSU\n3-GENJUTSU\n4-KATON\n5-RINNENGAN");
                    tipo = escolha.nextInt();
                    switch (tipo) {
                        case 1:
                            tipoDoNinja = TiposHabilidades.TAIJUTSU;
                            break;
                        case 2:
                            tipoDoNinja = TiposHabilidades.NINJUTSU;
                            break;
                        case 3:
                            tipoDoNinja = TiposHabilidades.GENJUTSU;
                            break;
                        case 4:
                            tipoDoNinja = TiposHabilidades.KATON;
                            break;
                        case 5:
                            tipoDoNinja = TiposHabilidades.RINNENGAN;
                            break;
                        default:
                            System.out.println("Opção invalida tente adicionar o ninja novamente");
                            break;
                    }
                    if (tipoDoNinja != null) {
                        ninjaAvancados[contadorNinjasAvancados] = new NinjaAvancado();
                        ninjaAvancados[contadorNinjasAvancados].setAll(habilidade, nome, idade, tipoDoNinja, especialidade);
                        contadorNinjasAvancados++;
                    } else {
                        System.out.println("Algo deu errado");
                    }
                    break;
                case 3:
                    System.out.println("Dados ninjas basicos:\n");
                    for (int i = 0; i < contadorNinjasBasicos; i++) {
                        ninjabasicos[i].mostrarInformacao(); 
                    }
                    System.out.println("\nDados ninjas avancados:\n");
                    for (int i = 0; i < contadorNinjasAvancados; i++) {
                        ninjaAvancados[i].mostrarInformacao();
                    }
                    break;
                case 4:
                    System.out.print("Escolha o número do ninja:");
                    int numero = escolha.nextInt();
                    numero=numero-1;
                    if (numero > contadorNinjasBasicos) {
                        System.out.println("Algo deu errado");
                    } else {
                        ninjabasicos[numero].executarHabilidade();
                    }
                    break;
                case 5:
                    System.out.print("Escolha o número do ninja:");
                    int numeroutro = escolha.nextInt();
                    numeroutro = numeroutro -1;
                    if (numeroutro > contadorNinjasAvancados) {
                        System.out.println("Algo deu errado");
                    } else {
                        ninjaAvancados[numeroutro].executarHabilidade();
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Numero invalido");
            }
        }
    }
}
