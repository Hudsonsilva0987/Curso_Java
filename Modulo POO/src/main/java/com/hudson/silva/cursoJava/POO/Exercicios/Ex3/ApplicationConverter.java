package com.hudson.silva.cursoJava.POO.Exercicios.Ex3;

import java.util.Locale;
import java.util.Scanner;

public class ApplicationConverter {

    public static void main (String []args){
        Locale.setDefault(Locale.US);
        Double dollar = 0.00;
        Scanner sc = new Scanner(System.in);

        dollar = sc.nextDouble();
        CurrencyConverter value = new CurrencyConverter(dollar);
        System.out.printf("%.2f%n", value.converter());


        sc.close();
    }
}
