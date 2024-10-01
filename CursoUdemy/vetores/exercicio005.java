/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
considerando a primeira posição como 0 (zero).
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
        for(int i=0;i<numero;i++){
            System.out.print("Digite um número:");
            vetor[i]=sc.nextDouble();
            if(vetor[i]>maior){
                maior=vetor[i];
                posicao=i;
            }
        }
        System.out.print("O maior número é "+maior+"\nLocalizado na posição:"+posicao+1);
       
    }
}