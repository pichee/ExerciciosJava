/*
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */
import java.util.Scanner;
public class u {
    
    public static void main(String[] args) {
        Scanner variavel=new Scanner(System.in);
        System.out.print("Digite um número:");
        double numero=variavel.nextDouble();
        variavel.close();
        if (numero<0){
            System.out.print("Este número é negativo");
            System.exit(0);
        }
        System.out.print("Este número é positivo");
    }
    
}