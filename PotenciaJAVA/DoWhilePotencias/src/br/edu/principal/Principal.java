package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner tlcd = new Scanner(System.in);
		int Base = 0, Expoente = 0, Res = 0, Count = 1;
		System.out.println("Entre com a base:");
		Base = tlcd.nextInt();
		System.out.println("Entre com a expoente:");
		Expoente = tlcd.nextInt();
		do {
			if (Count == 1) {
				Res = Base*Base;
			} else {
				Res *= Base;
			}
			Count++;
		} while (Count < Expoente);
		System.out.println("O resultado é " + Res);
	}

}
