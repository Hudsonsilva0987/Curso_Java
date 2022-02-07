package com.hudson.silva.cursoJava.Exceptions.Exemplo1;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args){
        String nomes ;
        int qnt;

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Diga a qnt de nomes que deseja inserir : ");
            qnt = sc.nextInt();
            String [] name = new  String[qnt];

            for(int i = 0; i < 3; i++) {
                System.out.println("Nome : ");
                nomes = sc.next();
                name[i] = nomes;
            }
            for(String lista : name){
                System.out.println(lista);
            }
        }catch (InputMismatchException e){
            System.out.println("Valor Invalido !!");
        }
    sc.close();
    }

}
