/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
- Imprimir todos os elementos do vetor 
- Mostrar na tela a soma e a média dos elementos do vetor
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite quantos numeros voce vai digitar:");
        int numero=sc.nextInt();
        double soma=0;
        double[] vetor= new double[numero];
            for(int i=0;i<numero;i++){
                System.out.print("Digite um número:");
                vetor[i]=sc.nextDouble();
                soma=soma+vetor[i];
            }    
        soma=soma/numero;
        System.out.print("Todos os numeros digitados:\n");
               
        for(int i=0;i<numero;i++){
                System.out.println(vetor[i]);
                
            } 
         System.out.printf("A media desses numeros é %.2f%n",soma);        
    }
    
}