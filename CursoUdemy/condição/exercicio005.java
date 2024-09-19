/*
Com base na tabela abaixo, escreva um programa que lei
*/
import java.util.Scanner;
public class u {

    public static void main(String[] args) {
        double produto=0;
        Scanner variavel=new Scanner(System.in);
        System.out.print("Codigo Produto Preço\n1     Cachorro-quente R$4,00");
        System.out.print("\n2     X-salada       R$4,50");
        System.out.print("\n3     X-bacon      R$5,00");
        System.out.print("\n4     Torrada      R$2,00");
        System.out.print("\n5     Cocacola      R$1,50\nQual item voce escolhe:");
        int escolha=variavel.nextInt();
        switch(escolha){
            case 1:
            System.out.print("Quantos voce comprou:");
            produto=variavel.nextDouble();
            produto=produto*4;
            break;
            case 2:
            System.out.print("Quantos voce comprou:");
            produto=variavel.nextDouble();
            produto=produto*4.50;
            break;
            case 3:
            System.out.print("Quantos voce comprou:");
            produto=variavel.nextDouble();
            produto=produto*5.00;
            break;
            case 4:
            System.out.print("Quantos voce comprou:");
            produto=variavel.nextDouble();
            produto=produto*2.00;
            break;
            case 5:
            System.out.print("Quantos voce comprou:");
            produto=variavel.nextDouble();
            produto=produto*1.50;
            break;
            default:
            System.out.print("Voce nao digitou item certo");
            variavel.close();
            System.exit(0);
            
            
            
        }
        System.out.print("O total a pagar:"+produto);
        variavel.close();
    }

}