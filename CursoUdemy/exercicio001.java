/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos.
 */

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner numeros=new Scanner(System.in);
        System.out.print("Digite um número:");
        int numero1=numeros.nextInt();
        System.out.print("Digite outro número:");
        int numero2=numeros.nextInt();
        int resultado=numero1-numero2;
        System.out.print(numero1+"-"+numero2+"="+resultado);
        numeros.close();
    }
    
}