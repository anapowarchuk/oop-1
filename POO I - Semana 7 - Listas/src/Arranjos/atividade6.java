package Arranjos;

import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
		System.out.println("Digite o tamanho do arranjo\n");
		Scanner leitura = new Scanner(System.in);
		int n = leitura.nextInt();
		int[] a = new int[n];
		for (int cont = 0; cont < n; cont++) {
			System.out.println("Qual o valor do seu arranjo na posição" + cont + "?\n");
			a[cont] = leitura.nextInt();
		}
		System.out.println("Arranjo: \n");
		for (int cont = 0; cont < n; cont++) {
			System.out.print(a[cont] + " ");
		}
		System.out.println("\n");
		leitura.close();

		boolean ordenado = true;
		for (int cont = 0; cont < n - 1; cont++) {

			if (a[cont] >= a[cont]) {
				ordenado = false;
				break;
			}
		}

		if (ordenado) {
			System.out.println("O array está ordenado");
		} else {
			System.out.println("O array não está ordendado");
		}
	}
}
