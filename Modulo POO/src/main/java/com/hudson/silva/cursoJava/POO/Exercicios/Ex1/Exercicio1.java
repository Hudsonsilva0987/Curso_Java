package com.hudson.silva.cursoJava.POO.Exercicios.Ex1;

//Exercicio sem Orientação a Objetos
// Calcule a área dos triangulos e informe qual a maior.

import java.util.Locale;
import java.util.Scanner;
public class Exercicio1 {

    public static void main(String []args){
        Double a, b, c;

        Double p[] = new Double[3];
        Double area[] = new Double[3];
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 2; i++){
            System.out.println("Informe qual valor do primeiro lado do triangulo " + i);
            a = sc.nextDouble();
            System.out.println("Informe qual valor do segundo lado do triangulo " + i);
            b = sc.nextDouble();
            System.out.println("Informe qual valor do terceiro lado do triangulo " + i);
            c = sc.nextDouble();

            p[i] = (a + b + c)/2;
            area[i] = Math.sqrt(p[i] * ((p[i] - a)*(p[i] - b)*(p[i] - c)));
        }
        System.out.printf("Triangulo X tem área : %.4f%n", area[1]);
        System.out.printf("Triangulo Y tem área:  %.4f%n: ", area[2]);

        if(area[1] > area[2]){
            System.out.printf("Triangulo X tem a maior área, área : %.4f%n ", area[1]);
        }else{
            System.out.printf("Triangulo Y tem a maior área, área : %.4f%n ", area[2]);
        }


    }
}
