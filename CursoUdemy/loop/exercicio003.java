/*
Leia um valor inteiro.Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
X, se for o caso.
*/

import java.util.Scanner;
public class u {

    public static void main(String[] args) {
        int x=0;
        Scanner variavel=new Scanner(System.in);
        System.out.print("Digite um número:");
        x=variavel.nextInt();
        for(int i=0;i<=x;i++){
            if(i%2==1){
                System.out.print(i+"\n");
           
            }
            
        }
    }
}