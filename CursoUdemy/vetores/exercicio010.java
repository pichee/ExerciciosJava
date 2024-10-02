/*
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa 
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número 
de homens.
 */
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de pessoas que vai cadastrar: ");
        int numero = sc.nextInt();

        double maior = 0, menor = 999998, altura, somaAlturaMulheres = 0;
        int contadorHomens = 0, contadorMulheres = 0;

        for (int i = 0; i < numero; i++) {
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            altura = sc.nextDouble();
            
            System.out.print("Digite o gênero da pessoa (M/F): ");
            char genero = sc.next().toUpperCase().charAt(0);

            // Verificar maior e menor altura
            if (altura > maior) {
                maior = altura;
            }
            if (altura < menor) {
                menor = altura;
            }

            if (genero == 'M') {
                contadorHomens++;
            } else if (genero == 'F') {
                contadorMulheres++;
                somaAlturaMulheres += altura;
            } else {
                System.out.println("Gênero inválido.");
            }
        }
        double mediaAlturaMulheres = contadorMulheres > 0 ? somaAlturaMulheres / contadorMulheres : 0;

        // Exibir resultados
        System.out.println("Maior altura: " + maior);
        System.out.println("Menor altura: " + menor);
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("Número de homens: " + contadorHomens);

        sc.close();
    }
}