
package application;
import java.util.Scanner;

public class U {
    public static void main(String[] args) {
        Scanner variavel=new Scanner(System.in);
        Retangulo retangulo=new Retangulo();
        System.out.print("Digite uma altura:");
        retangulo.altura=variavel.nextDouble();
        System.out.print("Digite a largura:");
        retangulo.largura=variavel.nextDouble();
        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETER = %.2f%n", retangulo.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
        variavel.close();


    }
}
