package Exercicios.Ex2;

public class Produtos {
    private String name;
    private Double price;
    private int quantity;

    public Produtos(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    Double TotalValueInStock(){
        return getPrice() * getQuantity();
    }

    void addProduct(int quantity){
        this.quantity += quantity;
    }

    void removeProduct(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return "Name : " + getName() +
                    " Price : "+ getPrice() +
                        " Quantity : " + getQuantity();
    }
}

