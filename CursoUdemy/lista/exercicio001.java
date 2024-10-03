/*
 * Fazer um programa para ler um número inteiro N e depois os 
dados (id, nome e salario) de N funcionários. Não deve haver 
repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de 
um determinado funcionário. Para isso, o programa deve ler 
um id e o valor X. Se o id informado não existir, mostrar 
uma mensagem e abortar a operação. Ao final, mostrar a 
listagem atualizada dos funcionários, conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não 
permitir que o salário possa ser mudado livremente. Um 
salário só pode ser aumentado com base em uma operação 
de aumento por porcentagem dada.
Obs:nao vou colicar o encapsulamento pois estou fazendo no celular.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
class empresa{
            private List<String> nome=new ArrayList<>();
            private List <Integer> ids=new ArrayList<>();
            private List <Double> salario=new ArrayList<>();
        public void dados(String nome,int ids,double salario){
        this.nome.add(nome);
        this.ids.add(ids);
        this.salario.add(salario);
    }
    public boolean existe(int id){
        return ids.contains(id);
    }
    public void mostrar(int i){
        System.out.print("\nId:"+ids.get(i)+"\nNome:"+nome.get(i)+"\nSalario:"+salario.get(i));
    }
    public int buscador(int id,int tamanho){
        for(int i=0;i<tamanho;i++){
            if(ids.get(i)==id){
                return i;
            }
        }
        return -1;
        
    }
    public double getSalario(int numero){
        return salario.get(numero);
    }
    public double novoSalario(int numero,double valor){
         salario.set(numero,valor);
         return salario.get(numero);
        
    }
}

public class exercicio {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            empresa empresa=new empresa();
            System.out.print("Digite quantos funcionarios vão ser cadastrados:");
            int numero=sc.nextInt();
            int id;
            double salario;
            String nome;
            for(int i=0;i<numero;i++){
                while(true){
                System.out.print("Digite o id do funcionario:");
                    id=sc.nextInt();
                    if(!empresa.existe(id)){
                       break; 
                    }
                    System.out.print("Id já utilizado tente novamente\n");
                    
                }
                System.out.print("Digite o salario do funcionario:");
                salario=sc.nextDouble();
                sc.nextLine();
                System.out.print("Digite o nome do funcionario");
                nome=sc.nextLine();
                empresa.dados(nome,id,salario);
            }
            System.out.print("Lista:\n");
            for(int i=0;i<numero;i++){
                empresa.mostrar(i);
            }
            System.out.print("Escolha um funcionario utilizando o id:");
            id=sc.nextInt();
            int boleanou=empresa.buscador(id,numero);
            if(boleanou!=-1){
                System.out.print("Quantod % do salario do dessa rapaz vocr quer aumentar:");
                int porcentagem=sc.nextInt();
                double salarioBase=empresa.getSalario(boleanou);
                double soma=(porcentagem/100)*salarioBase+salarioBase;
                System.out.print("O novo salario desse funcionario é"+soma);
                System.exit(0);
                
            }
            
            System.out.print("Funcionario não encontrado");
            
            
            
        }
        }