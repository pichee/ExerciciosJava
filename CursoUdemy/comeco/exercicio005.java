/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner coringa=new Scanner(System.in);
        System.out.print("Digite o codigo da peça 1:");
        int peca=coringa.nextInt();
        System.out.print("Quantas pecas voce comprou: ");
        double quantidade1=coringa.nextFloat();
        System.out.print("Quanto custa cada peça:");
        double valor1=coringa.nextFloat();
        System.out.print("Digite o codigo da peça 2:");
        int peca2=coringa.nextInt();
        System.out.print("Quantas pecas voce comprou: ");
        double quantidade2=coringa.nextFloat();
        System.out.print("Quanto custa cada peça:");
        double valor2=coringa.nextFloat();
        double total=(quantidade1*valor1)+(quantidade2*valor2);
       System.out.print("Valor total a pagar="+total);
        coringa.close();
        
    }
}
