/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        double pi=3.14159;
        Scanner variavel=new Scanner(System.in);
        System.out.print("Digite o valor do raio:");
        double raio=variavel.nextFloat();
        double resultado=pi*(raio*raio);
            System.out.print("O area desse circulo é igual a "+resultado);
        variavel.close();
        
    }
    
}
