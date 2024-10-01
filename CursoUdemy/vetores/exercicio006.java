/*
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um 
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima 
o vetor C gerado.
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double maior=0;
        int posicao=0;
        System.out.print("Digite quantos numeros voce vai digitar:");
        int numero=sc.nextInt();
        double[] vetor=new double[numero];
            double[] vetorB=new double[numero];
                double[] vetorsoma=new double[numero];
        for(int i=0;i<numero;i++){
            System.out.print("Digite O número "+(i+1)+" do vetor A:");
            vetor[i]=sc.nextDouble();
        }
        for(int i=0;i<numero;i++){
            System.out.print("Digite O número "+(i+1)+" do vetor B:");
            vetorB[i]=sc.nextDouble();
            vetorsoma[i]=vetor[i]+vetorB[i];
        }
        System.out.print("\nVetor A:\n");
        for(int i=0;i<numero;i++){
            System.out.print(vetor[i]+"\n");
        }
        System.out.print("\nVetor B:\n");
        for(int i=0;i<numero;i++){
            System.out.print(vetorB[i]+"\n");
        }
        System.out.print("\nVetor Soma:\n");
        for(int i=0;i<numero;i++){
            System.out.print(vetorsoma[i]+"\n");
        }
        
        
    }
}