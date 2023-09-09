package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int Base = 0, Expoente = 0, Res = 0, Count = 1;
		Scanner tlcd = new Scanner(System.in);
		System.out.println("Entre com a Base");
		Base = tlcd.nextInt();
		System.out.println("Entre com o Expoente");
		Expoente = tlcd.nextInt();
		while (Count < Expoente) {
			
			if (Count == 1) {
				Res = Base * Base;
			} else {
				Res *= Base;
			}
			Count++;
		}
		System.out.println("O resultado da operação é" + Res);
		
	}

}
