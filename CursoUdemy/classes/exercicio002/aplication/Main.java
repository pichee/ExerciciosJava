package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        dados d = new dados();
        System.out.println("Digite o nome do funcionario");
        Scanner sc = new Scanner(System.in);
        d.nome = sc.nextLine();
        System.out.println("Digite o salario do funcionario");
        d.salario = sc.nextDouble();
        System.out.println("Digite o imposto do funcionario");
        d.imposto = sc.nextDouble();
        System.out.println("Nome:"+d.nome+"\nSalario:"+d.getSalario()+"\nImposto:"+d.imposto);
        System.out.println("Digite a quantidade de aumento do funcionario em porcentagem:");
        d.porcentagem = sc.nextDouble();
        System.out.println("O seu novo salario é "+d.novoSalario());

    }
}
