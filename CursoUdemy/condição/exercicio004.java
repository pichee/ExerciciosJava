/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

import java.util.Scanner;
public class u {
    
    public static void main(String[] args) {
        Scanner variavel=new Scanner(System.in);
        System.out.print("Digite o horário que começou:");
        double numero=variavel.nextDouble();
        System.out.print("Digite o horário que acabou:");
        double numero1=variavel.nextDouble();
        variavel.close();
         if (numero==numero1){
            System.out.print("A quantidade de horas é 24 ");
            System.exit(0);
        }
        if (numero<numero1){
            double horas=numero1-numero;
            System.out.print("A quantidade de horas é "+horas);
            System.exit(0);
        }
        double horas=(24-numero)+numero1;
        
        System.out.print("A quantidade de horas é "+horas);
    }
    
}