package Exercicios.Ex5;

import java.util.*;

public class Application {

    public static void main ( String []args) {
        String name;
        int id;
        Double salary;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees do you want to register ? ");
        int qnt = sc.nextInt();

        List<Empregados> lista = new ArrayList<>();

        for (int i = 0 ; i < qnt; i++) {
            System.out.println("Name : ");
            name = sc.next();
            System.out.println("ID : ");
            id = sc.nextInt();
            while(hasId(lista,id)){
                System.out.println("Id already exist try again !!");
                id = sc.nextInt();
            }
            System.out.println("Salary : ");
            salary = sc.nextDouble();
            lista.add(new Empregados(name, id, salary));
        }

        for (Empregados list :lista) {
            System.out.println("List of Employees : \n ");
            System.out.println(list);
        }
        System.out.println("Enter the employeer id that will hava salary increase : ");
        id = sc.nextInt();
        while(hasPosition(lista, id) == null){
            System.out.println("ID no exist Try again !!!");
            id = sc.nextInt();
        }
        Integer pos = hasPosition(lista,  id);
        System.out.println("Porcentage increase in salary");
        Double porcent = sc.nextDouble();
        lista.get(pos).upSalary(porcent);


        for (Empregados list :lista) {
            System.out.println("List of Employees : \n ");
            System.out.println(list);
        }

        sc.close();
    }



    static Integer hasPosition(List<Empregados> list, int id){
        for(int i = 0; i < list.size(); i ++){
            if(list.get(i).getId() == id){
                return i;
            }

        }
        return null;
    }
    static Boolean hasId(List<Empregados> list, int id){
        Empregados emp = list.stream().filter(x -> x.getId() == id ).findFirst().orElse(null);
        return emp != null;
    }
}
