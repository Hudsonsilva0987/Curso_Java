package com.hudson.silva.cursoJava.POO.Exercicios.Ex4;

public class Account {

    private String holder;
    private int number;
    private Double balance;

    public Account(){}

    public Account(String holder, int number) {
        this.holder = holder;
        this.number = number;
    }

    public Account(String holder, int number, Double balance) {
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }


    public Double getBalance() {
        return balance;
    }

    public void deposit(Double value){
        balance += value;

    }
    public void withdraw (Double value){
        balance -= 5.00;
        balance -= value;

    }

    public String toString(){
        return " Account Data : \n"
                + " Account : " + getNumber()
                + ", Holder : " + getHolder()
                + ", Balance : $ " + getBalance();
    }


}
