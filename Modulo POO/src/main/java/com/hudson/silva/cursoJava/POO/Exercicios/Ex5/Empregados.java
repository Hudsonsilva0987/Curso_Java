package com.hudson.silva.cursoJava.POO.Exercicios.Ex5;

public class Empregados {
    private String name;
    private int id;
    private Double salary;


    public Empregados() {
    }

    public Empregados(String name, int id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }
    public Double upSalary(Double porcent){
       return salary += getSalary() * porcent/100;

    }

    public String toString() {
        return
                "ID : " + getId() +
                "\n Name : " + getName()  +
                "\n Salary  : " + getSalary();
    }
}
