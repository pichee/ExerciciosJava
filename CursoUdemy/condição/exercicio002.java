/*
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
*/
import java.util.Scanner;
public class u {
    
    public static void main(String[] args) {
        Scanner variavel=new Scanner(System.in);
        System.out.print("Digite um número:");
        double numero=variavel.nextDouble();
        variavel.close();
        if (numero%2==0){
            System.out.print("Este número é par");
            System.exit(0);
        }
        System.out.print("Este número é impar");
    }
    
}