package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int numCalc = scanner.nextInt();
        int resultado = calcFat(numCalc);
        System.out.printf("O resultado é %d", resultado);
        scanner.close();

	}
	 public static int calcFat(int N) {
		 if (N == 0) {
			 return 1;
		 } else {
			 return (N * calcFat(N - 1)); 
		 }	 
	 }
}
