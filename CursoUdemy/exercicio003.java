/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner numeros=new Scanner(System.in);
        System.out.print("Digite o valor de A:");
        int a=numeros.nextInt();
        System.out.print("Digite o valor de B:");
        int b=numeros.nextInt();
        System.out.print("Digite o valor de C:");
        int c=numeros.nextInt();
        System.out.print("Digite o valor de D:");
        int d=numeros.nextInt();
        int diferenca=(a*b-c*d);
        System.out.print("O valor final é "+diferenca);
        
    }
}