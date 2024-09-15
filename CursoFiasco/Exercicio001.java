/*
Crie um programa que represente três ninjas da Vila da Folha (Konoha) de "Naruto" e suas respectivas missões.Cada ninja tem um nome, uma idade e uma
missão atribuída a ele, com o nome da missão, nível de dificuldade e status de conclusão.
Ninjas menores de 15 anos só podem concluir missões de nível C ou D.
Ninjas com 15 anos ou mais podem concluir missões de qualquer nível.
 */
public class Main {
    public static void main(String[] args) {
    //Ninja 1:
        String nomeNinja1="Manabu Akado";
        int idade1 =14;
        String nomeMissao1="Ajudar os refugiados";
        char dificuldadeMissao1='C';
    //Ninja 2:
        String nomeNinja2="Madara Uchiha";
        int idade2 =100;
        String nomeMissao2="Matar o Hokage da Agua";
        char dificuldadeMissao2='S';
        boolean status2=false;
    //Ninja 3:
        String nomeNinja3="Boruto Uzumaki";
        int idade3 =14;
        String nomeMissao3="Ajudar as veias atravessar a rua";
        char dificuldadeMissao3='B';
        boolean status3=false;
    //Status Ninja 1:
        System.out.println("Nome do Ninja: "+nomeNinja1);
        System.out.println("Idade do Ninja: "+idade1);
        System.out.println("Missao: "+nomeMissao1);
        System.out.println("Dificuldade: "+dificuldadeMissao1);
        if (idade1>15){
            System.out.println("Status:Concluido");
        }
        else if (idade1<15 && dificuldadeMissao1=='C' || dificuldadeMissao1=='D' ){
            System.out.println("Status:Concluido");
        }
        else{
            System.out.println("Status:Não Concluido");
        }
        System.out.println();
    //Status Ninja 2:
        System.out.println("Nome do Ninja: "+nomeNinja2);
        System.out.println("Idade do Ninja: "+idade2);
        System.out.println("Missao: "+nomeMissao2);
        System.out.println("Dificuldade: "+dificuldadeMissao2);
        if (idade2>15){
            System.out.println("Status:Concluido");
        }
        else if (idade2<15 && dificuldadeMissao2=='C' || dificuldadeMissao2=='D' ){
            System.out.println("Status:Concluido");
        }
        else{
            System.out.println("Status:Não Concluido");
        }
        System.out.println();
    //Status Ninja 3:
        System.out.println("Nome do Ninja: "+nomeNinja3);
        System.out.println("Idade do Ninja: "+idade3);
        System.out.println("Missao: "+nomeMissao3);
        System.out.println("Dificuldade: "+dificuldadeMissao3);
        if (idade3>15){
            System.out.println("Status:Concluido");
        }
        else if (idade3<15 && dificuldadeMissao3=='C' || dificuldadeMissao3=='D' ){
            System.out.println("Status:Concluido");
        }
        else{
            System.out.println("Status:Não Concluido");
        }




}}
