/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 

e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner escolha=new Scanner(System.in);
			int numero;
		while(true){
			System.out.print("Digite  quantos numeros voce quer maximo 10:");
		numero=escolha.nextInt();
		if (numero<=10 && numero>=1)
		{
			break;
     	}
     	else
     	{
     		System.out.print("\nNumero invalido tente novamente\n");
	
	}}
	int[] vetor=new int[numero];
	int[] vetorNegativo=new int[numero];
	int contadorNegativo=0;
	for(int i=0;i<numero;i++){
		System.out.print("Digite um número:");
		vetor[i]=escolha.nextInt();
		if(vetor[i]<0){
			vetorNegativo[contadorNegativo]=vetor[i];
           contadorNegativo++;
		}}
	System.out.print("Numeros negativos:\n");
	for(int i=0;i<contadorNegativo;i++){
		    System.out.print(vetorNegativo[i]);
		}}}