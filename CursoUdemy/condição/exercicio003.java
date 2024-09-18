/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente.
*/

import java.util.Scanner;
public class u {
    
    public static void main(String[] args) {
        Scanner variavel=new Scanner(System.in);
        System.out.print("Digite um número:");
        double numero=variavel.nextDouble();
        System.out.print("Digite outro número:");
        double numero1=variavel.nextDouble();
        variavel.close();
        if (numero%numero1==0 || numero1%numero==0){
            System.out.print("Esses números são multiplos");
            System.exit(0);
        }
        System.out.print("Esses números não são multiplos");
    }
    
}