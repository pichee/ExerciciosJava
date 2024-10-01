/*
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média 
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for 
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double soma=0,contador=0;
        boolean par=false;
    Scanner sc=new Scanner(System.in);
    System.out.print("Digite quantos números voce quer:");
    int numero=sc.nextInt();
        double[] vetor=new double[numero];
            for(int i=0;i<numero;i++){
                System.out.print("Digite um número para posição:"+(i+1));
                vetor[i]=sc.nextDouble();
                if(vetor[i]%2==0){
                soma=vetor[i]+soma;
                    contador++;
                    par=true;
            } }
        soma=soma/contador;
        if(par==true){
        System.out.printf("Media numeros pares=%.3f%n",soma);
        }
        else{
            System.out.printf("Nao possui numeros pares");
        }
        }}