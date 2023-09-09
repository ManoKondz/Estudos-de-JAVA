package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int Base = 0, Expoente = 0, Res = 0;
		Scanner tlcd = new Scanner(System.in);
		System.out.println("Entre com a Base:");
		Base = tlcd.nextInt();
		System.out.println("Entre com o Expoente:");
		Expoente = tlcd.nextInt();
		for (int count = 1; count < Expoente; count++) {
			if (count == 1) {
				Res = Base * Base;
			} else {
				Res = Res * Base;
			}
		}
		System.out.printf("O resultado da potência é:" + Res);

	}

}
