/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002
*/
import java.util.Scanner;
public class u {

    public static void main(String[] args) {
        int senha=0;
        while(0==0){
            System.out.print("Digite sua senha:");
            Scanner variavel=new Scanner(System.in);
            senha=variavel.nextInt();
            if (senha==2022){
                break;
            }
            System.out.print("Senha incorreta\n");
        }
        System.out.print("Senha correta");
    }}