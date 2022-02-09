package Exercicios.Ex4;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String [] args){

        String name;
        int number;
        Double balance;
        String answer;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account acc1 = new Account();

        System.out.println("Enter Account number : ");
        number = sc.nextInt();
        System.out.println("Enter Account Holder : ");
        name = sc.next();
        System.out.println(" Is there na initial deposit ?  (y/n) ");
        answer = sc.next();

        if (answer.equalsIgnoreCase("y")){
            System.out.println("Enter initial deposit value : ");
            balance = sc.nextDouble();
            acc1 = new Account(name, number, balance);
        }else{
             acc1 = new Account(name, number, 0.00);
        }
        System.out.println(acc1.toString());


        acc1.deposit(200.00);
        System.out.println(acc1.toString());
        acc1.withdraw(300.00);
        System.out.println(acc1.toString());
        sc.close();
    }
}
