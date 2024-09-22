package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite a nota do estudante no primeiro semestre[Maximo 30]:");
        estudante.primeroSemestre = scanner.nextDouble();
        System.out.println("Digite a nota do estudante no segundo semestre[Maximo 35]:");
        estudante.segundoSemestre = scanner.nextDouble();
        System.out.println("Digite a nota do estudante no terceiro semestre[Maximo 35]:");
        estudante.terceroSemestre = scanner.nextDouble();
        System.out.println("A media desse estudante foi " + estudante.mediaSemestre());
        estudante.passouSemestre(estudante.mediaSemestre());
    }}
    
