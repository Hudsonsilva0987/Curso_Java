package Exercicios.Ex1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1ComClasse {

	public static void main(String[] args) {
		Double a, b, c;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe qual valor do primeiro lado do triangulo X");
		a = sc.nextDouble();
		System.out.println("Informe qual valor do segundo lado do triangulo X");
		b = sc.nextDouble();
		System.out.println("Informe qual valor do terceiro lado do triangulo X");
		c = sc.nextDouble();
		Triangulo x = new Triangulo(a, b, c);

		System.out.println("Informe qual valor do primeiro lado do triangulo Y");
		a = sc.nextDouble();
		System.out.println("Informe qual valor do segundo lado do triangulo Y");
		b = sc.nextDouble();
		System.out.println("Informe qual valor do terceiro lado do triangulo Y ");
		c = sc.nextDouble();
		Triangulo y = new Triangulo(a, b, c);
		System.out.printf("Ã�rea do triangulo X : %.4f%n ", x.area(x));
		System.out.printf("Ã�rea do triangulo Y : %.4f%n", y.area(y));
		if (x.area(x) > y.area(y)) {
			System.out.printf("Ã�rea do triangulo X  : %.4f%n Ã© maior ", x.area(x));
		} else {
			System.out.printf("Ã�rea do triangulo Y :  %.4f%n Ã© maior ", y.area(y));
		}
		sc.close();
	}
}
