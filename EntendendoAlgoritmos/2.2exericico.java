/*Suppose you’re building an app for restaurants to take customer orders. Your app needs to store a list of orders. Servers keep adding orders to this list, and chefs take orders of f the list and make them. 
It’s an order queue: servers add orders to the back of the queue, and the chef takes the fi rst order of f the queue and cooks it.

Suponha que você esteja criando um aplicativo para restaurantes para receber pedidos de clientes. Seu aplicativo precisa armazenar uma lista de pedidos. Os garçons continuam adicionando pedidos a essa lista, e os chefs pegam os pedidos da lista e os fazem. 
É uma fila de pedidos: os garçons adicionam os pedidos ao final da fila, e o chef pega o primeiro pedido da fila e o cozinha.*/
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main{
    public static void main(String[] args) {
        Queue<Integer> pedidos=new LinkedList<>();
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("1-Adicionar pedido\n2-remover pedido\n3-Fechar aplicativo\nEscolha:");
            int escolha=scan.nextInt();
            switch(escolha){
                case 1:
                pedidos.add(1);
                System.out.println("Pedido adicionado com sucesso");
                break;
                case 2:
                if(pedidos.isEmpty()){
                    System.out.println("A lista esta vazia ");
                }
                else{
                    pedidos.poll();
                    System.out.println("O pedido foi removido");
                }
                break;
                case 3:
                System.exit(0);
                break;
                
                
            }
        }
        
    }
}