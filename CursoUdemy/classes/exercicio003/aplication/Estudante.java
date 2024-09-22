package application;

public class Estudante {
    public  double primeroSemestre;
    public  double segundoSemestre;
    public  double terceroSemestre;
    public  double mediaSemestre(){
        return (primeroSemestre+segundoSemestre+terceroSemestre);
    }
    public void passouSemestre(double valor){
        if (valor>60){
            System.out.println("Aprovado");
        }
        else{
           System.out.println("Reprovado");
        }
    };
}
