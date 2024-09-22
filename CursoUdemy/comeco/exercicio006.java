/*
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B.
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner coringa=new Scanner(System.in);
        double tri,cir,tra,qua,reta,v1,v2,v3;
        System.out.print("Digite o primeiro valor:");
        v1=coringa.nextDouble();
        System.out.print("Digite o segundo valor:");
        v2=coringa.nextDouble();
        System.out.print("Digite o terceiro valor:");
        v3=coringa.nextDouble();
        tri=(v1*v3)/2;
        cir=(v3*v3)*3.14;
        tra=(v1+v2)*v3/2;
        qua=v2*v2;
        reta=v1*v2;
        coringa.close();
        System.out.printf("TRIANGULO: %.3f%n", tri);
		System.out.printf("CIRCULO: %.3f%n", cir);
		System.out.printf("TRAPEZIO: %.3f%n", tra);
		System.out.printf("QUADRADO: %.3f%n", qua);
		System.out.printf("RETANGULO: %.3f%n", reta);
        
        
        
    }
}
