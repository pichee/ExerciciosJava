import java.util.Scanner;
import java.util.Random;
class cruz{
    public void mostrarcruz(int escolhido,int[][] matrix,int linha,int coluna,int maxl,int maxc){
        if(linha-1>=0){
        System.out.print("\nCima:"+matrix[linha-1][coluna]);
    }
        if(linha+1<=maxl){
        System.out.print("\nBaixo:"+matrix[linha+1][coluna]);
    }
        if(coluna+1<=maxc){
        System.out.print("\nDireita:"+matrix[linha][coluna+1]);
        }
        if(coluna-1>=0){
        System.out.print("\nEsquerda:"+matrix[linha][coluna-1]);
        }
        
    }
}

public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        cruz cruz=new cruz();    
        System.out.println("Digite quantas linhas a matrix vai ter:");
        int linhas=sc.nextInt();
        System.out.println("Digite quantas colunas a matrix vai ter:");
        int colunas=sc.nextInt();
        int[][] matrix=new int[linhas][colunas];
        for(int i=0;i<linhas;i++){
            for(int j=0;j<colunas;j++){
                matrix[i][j]=random.nextInt(100);
            }
        }
        for(int i=0;i<linhas;i++){
            for(int j=0;j<colunas;j++){
                System.out.print(matrix[i][j]+" ");
            }
              System.out.print("\n");
        }
        System.out.print("Digite um número que esta na matrix:");
        int escolha=sc.nextInt();
        for(int i=0;i<linhas;i++){
            for(int j=0;j<colunas;j++){
                if(escolha==matrix[i][j]){
                    cruz.mostrarcruz(escolha,matrix,i,j,linhas,colunas);
                }
            }
    }}}