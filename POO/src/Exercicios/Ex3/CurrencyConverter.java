package Exercicios.Ex3;

public class CurrencyConverter {

    private Double dollar;
    public static final Double REAL = 3.10;

    public CurrencyConverter(Double dollar){
        this.dollar = dollar;
    }

    public Double getDollar() {
        return dollar;
    }

    public void setDollar(Double dollar) {
        this.dollar = dollar;
    }

    public Double converter(){
        Double value = getDollar() * REAL;
        return value + value * 0.06;
    }
}
