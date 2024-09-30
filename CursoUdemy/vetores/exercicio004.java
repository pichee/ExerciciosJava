/*
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
   tela todos os números pares, e também a quantidade de números pares.
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite quantos números voce vai digitar:");
        int numero=sc.nextInt();
        int[] vetor=new int[numero];
        int[] vetorPares=new int[numero];
        int contadorNumerosPares=0;
        for(int i=0;i<numero;i++){
            System.out.print("Digite o número:");
        vetor[i]=sc.nextInt();
            if(vetor[i]%2==0){
                vetorPares[contadorNumerosPares]=vetor[i];
                contadorNumerosPares++;
            }
        }
        System.out.print("Esse vetor tem um total de "+contadorNumerosPares+" numeros pares");
        System.out.print("\nNumeros pares\n");
        for(int i=0;i<contadorNumerosPares;i++){
            System.out.print(vetorPares[i]+" ");
            
            
    }
}}