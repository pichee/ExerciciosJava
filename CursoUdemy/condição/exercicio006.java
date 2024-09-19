/*
 * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */
import java.util.Scanner;
public class j {
    
    public static void main(String[] args) {
        System.out.print("Digite um número:");
        Scanner numero=new Scanner(System.in);
        double meunumero=numero.nextDouble();
        numero.close();
        if(meunumero<=25){
            System.out.print("Esse numero pertence ao intervo (0:25)");
        }
        else if(meunumero>25 && meunumero<=50){
            System.out.print("Esse numero pertence ao intervo (25:50");
        }
        else if(meunumero>50 && meunumero<=75){
            System.out.print("Esse numero pertence ao intervo (50:75");
        }
        else if(meunumero>75 && meunumero<=100){
            System.out.print("Esse numero pertence ao intervo (75:100");
        }
        else{
            System.out.print("Numeri invalido");
        }
        }
    }