package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int Mat [] [] = new int [3] [3];
		for (int i = 0; i < Mat.length; i++) {
			for (int j = 0; j < Mat.length; j++) {
				Mat[i][j] = i * 3 + j * 1;
				
			}
			
		}
		for (int i = 0; i < Mat.length; i++) {
			for (int j = 0; j < Mat.length; j++) {
				System.out.print(Mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
