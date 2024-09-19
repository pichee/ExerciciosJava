/*
Ler um número inteiro N e calcular todos os seus divisores.
*/

import java.util.Scanner;
public class u {

    public static void main(String[] args) {
        int x=0;
        Scanner variavel=new Scanner(System.in);
        System.out.print("Digite um número:");
        x=variavel.nextInt();
        System.out.print("Divisores\n");
        for(int i=1;i<x;i++){
            if(x%i==0){
                System.out.print(i+"\n");
           
            }
            
        }
    }
}