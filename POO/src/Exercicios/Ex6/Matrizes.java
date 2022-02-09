package Exercicios.Ex6;

import java.util.ArrayList;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanho = sc.nextInt();
		int[][] mat = new int[tamanho][tamanho];

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		diagonal(mat, tamanho);
		negativos(mat, tamanho);

		sc.close();

	}

	public static void diagonal(int[][] mat, int tamanho) {
		ArrayList<Integer> diagonalP = new ArrayList<>();
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if (i == j) {
					diagonalP.add(mat[i][j]);
				}
			}
		}
		for (Integer matr : diagonalP) {
			System.out.println(matr);
		}
	}

	public static void negativos(int[][] mat, int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if (mat[i][j] < 0) {
					System.out.println("Numeros negativos : " + mat[i][j]);
				}
			}
		}
	}
}
