import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Enter accont data:\n");
                Scanner sc = new Scanner(System.in);
                System.out.println("Number:");
                int numero = sc.nextInt();
                System.out.println("Holder:");
                String holder = sc.next();
                System.out.println("Inicial Balance:");
                double balance = sc.nextDouble();
                System.out.println("withdraw limit");
                double withdraw = sc.nextDouble();
                Contas novaconta = new Contas(numero, holder, withdraw, balance);
                System.out.println("Enter a value amont the withdraw:");
                double emprestimo = sc.nextDouble();
                sc.close();
                novaconta.withdraw(emprestimo);
                novaconta.deposit(emprestimo);
                break;
            } catch (Exception e) {
                System.out.println("Voce digitou alguma informação incorreta,preste atenção :)\n");
            }
        }





    }}
