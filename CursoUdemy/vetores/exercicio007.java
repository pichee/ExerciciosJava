/*
 * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, 
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos 
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double soma=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Digite quantos números voce quer:");
    int numero=sc.nextInt();
        double[] vetor=new double[numero];
            for(int i=0;i<numero;i++){
                System.out.print("Digite um número para posição:"+(i+1));
                vetor[i]=sc.nextDouble();
                soma=vetor[i]+soma;
            } 
        soma=soma/numero;
        System.out.printf("Media=%.3f%n",soma);
        System.out.printf("\nValores abaixo da media:\n");
        
        for(int i=0;i<numero;i++){
            if(vetor[i]<soma){
                System.out.print(vetor[i]+" ");
                }
            } 
            
}}
    
