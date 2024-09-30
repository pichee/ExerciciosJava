/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
bem como os nomes dessas pessoas caso houver.
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantas pessoas você vai cadastrar: ");
        int numPessoas = sc.nextInt();
        String[] nomes = new String[numPessoas];
        int[] idades = new int[numPessoas];
        String[] nomesMenos16 = new String[numPessoas];
        double[] alturas = new double[numPessoas];
        double somaAlturas = 0;
        int contador = 0;

        for (int i = 0; i < numPessoas; i++) {
            System.out.printf("Dados da pessoa %d:%n", i + 1);
            sc.nextLine();
            System.out.print("Digite o nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Digite a idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Digite a altura: ");
            alturas[i] = sc.nextDouble();
            somaAlturas += alturas[i];

            if (idades[i] < 16) {
                nomesMenos16[contador] = nomes[i];
                contador++;
            }
        }

        double mediaAlturas = somaAlturas numPessoas;
        System.out.printf("Média das alturas: %.2f%n", mediaAlturas);
        double porcentagemMenores16 = (double) contador / numPessoas * 100;  // Cálculo correto da porcentagem
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%%%n", porcentagemMenores16);

        System.out.println("Nomes de pessoas com menos de 16 anos:");
        for (int j = 0; j < contador; j++) {
            System.out.println(nomesMenos16[j]);
        }
        
        sc.close();
    }
}