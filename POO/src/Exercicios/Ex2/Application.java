package Exercicios.Ex2;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String []args){
        String name;
        Double price;
        int quantity;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("name of product ?");
        name = sc.nextLine();
        System.out.println("Price of product ?");
        price = sc.nextDouble();
        System.out.println("Quantity of product ?");
        quantity = sc.nextInt();

        Produtos prod1 = new Produtos(name, price, quantity);
        System.out.println(prod1.toString());
        System.out.println("Total no estoque : R$ " + prod1.TotalValueInStock() + " Reais ");

        prod1.addProduct(2);
        System.out.println(prod1.toString());
        System.out.println("Total no estoque : R$" + prod1.TotalValueInStock() + " Reais ");

        prod1.removeProduct(3);
        System.out.println(prod1.toString());
        System.out.println("Total no estoque : R$" + prod1.TotalValueInStock() + " Reais");
    sc.close();
    }
}
