/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais.
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner variavel=new Scanner(System.in);
        System.out.print("Digite o numero do funcionario:");
        int funcionario=variavel.nextInt();
        System.out.print("Digite quantas horas ele trabalhou:");
        int horas=variavel.nextInt();
        System.out.print("Digite quanto ele ganha por hora:");
        double ganhar=variavel.nextFloat();
        System.out.println("O funcionario "+funcionario);
        double salario=ganhar*horas;
        System.out.printf("Ganha ao tudo %.2f",salario);
        variavel.close();
    }
}