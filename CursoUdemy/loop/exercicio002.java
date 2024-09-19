/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
exemplo.*/

import java.util.Scanner;
public class u {

    public static void main(String[] args) {
        int gasolina=0,alcol=0,diesel=0,loop=0;
        while(loop==0){
            System.out.print("\nO que voce usa\n1.Álcool\n2.Gasolina\n3.Diesel\n4.Sair\nResposta:");
            Scanner variavel=new Scanner(System.in);
            int escolha=variavel.nextInt();
                    switch(escolha){
            case 1:
            alcol++;
            break;
            case 2:
            gasolina++;
            break;
            case 3:
            diesel++;
            break;
            case 4:
             loop=1;           
            break;
        }
            
        }
        System.out.print("Alcol="+alcol+"\ngasolina="+gasolina+"\nDiesel="+diesel);
           
    }
    
    
}