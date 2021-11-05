package Arranjos;

import java.util.Scanner;

public class atividade8 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];

		Scanner leitura = new Scanner(System.in);
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite o valor na linha " + linha + " coluna " + coluna + " do seu arranjo");
				matriz[coluna][linha] = leitura.nextInt();
			}
		}
		leitura.close();
		System.out.println("\n \n ");
		System.out.println("Matriz:");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print("[" + matriz[coluna][linha] + "]" + " ");
			}
			System.out.println(" ");
		}

		System.out.println("\n \n ");
//a
		for (int linha = 0; linha < 3; linha++) {
			int soma = 0;
			for (int coluna = 0; coluna < 3; coluna++) {
				soma = soma + matriz[coluna][linha];
			}
			System.out.println("A soma dos valores da linha " + linha + " é " + soma );
		}
		
		System.out.println("\n \n ");
		
//b 
		for (int coluna = 0; coluna < 3; coluna++) {
			int produto = 1;
			for (int linha = 0; linha < 3; linha++) {
				produto = produto * matriz[coluna][linha];
			}
			System.out.println("O produto dos valores da coluna " + coluna + " é " + produto);
		}
		System.out.println("\n \n ");
		

//c
		System.out.println("Elementos da diagonal principal: ");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if (linha == coluna) {
					System.out.print("[" + matriz[coluna][linha] + "]  ");
				}
			}
		}

	}
}
