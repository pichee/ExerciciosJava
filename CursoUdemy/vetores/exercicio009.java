/*
 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram 
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir 
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou 
igual a 6.0 (seis).
 */
import java.util.Scanner;
public class exercicio {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Digite quantos alunos voce vai digitar:");
            int numero=sc.nextInt();
            double[] notas=new double[numero];
            String[] nomes=new String[numero];  
            double soma=0;
            for(int i=0;i<numero;i++){
                System.out.print("Digite o nome do aluno:");
                sc.nextLine();
                nomes[i]=sc.nextLine();
                System.out.print("Digite a primeira nota do"+nomes[i]+" :");
                double nota=sc.nextDouble();
                soma=nota;
                System.out.print("Digite a segunda nota do"+nomes[i]+" :");
                nota=sc.nextDouble();
                soma=(soma+nota)/2;
                notas[i]=soma;
                soma=0;
            }
            System.out.print("\nAprovados:\n");
            for(int i=0;i<numero;i++){
                if(notas[i]>=6){
                    System.out.print(nomes[i]+" ");
                }
                
            }
            
        }
    
}