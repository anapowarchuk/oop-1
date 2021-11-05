package Arranjos;

import java.util.Scanner;

public class atividade5 {
	public static void main(String args[]) {
		System.out.println("Digite o tamanho do seu primeiro arranjo\n");
		Scanner leitura = new Scanner(System.in);
		int n = leitura.nextInt();
		int [] data1 = new int[n];
		for (int cont = 0; cont < n; cont++) {
			System.out.println("Qual o valor do seu arranjo na posição" + cont + "?\n");
			data1[cont]=leitura.nextInt();
		}
		System.out.println("Arranjo Data1: \n");
		for (int cont=0; cont<n; cont ++) {
			System.out.print(data1[cont] + " ");
		}
		System.out.println("\n");
		//------------------------------------------------------		
		System.out.println("Digite o tamanho do seu segundo arranjo\n");
		int m = leitura.nextInt();
		int [] data2 = new int[m];
		for (int cont = 0; cont < m; cont++) {
			System.out.println("Qual o valor do seu arranjo na posição" + cont + "?\n");
			data2[cont]=leitura.nextInt();
		}
		System.out.println("Arranjo Data2: \n");
		for (int cont=0; cont<m; cont ++) {
			System.out.print(data2[cont] + " ");
		}
		System.out.println("\n");
		//------------------------------------------------------
		int o;
		o=n+m;
		int [] data3 = new int [o];
		System.out.println("Arranjo Data3: \n");
		for (int cont=0; cont<n; cont ++) {
			System.out.print(data1[cont]+ " ");
		}
		for (int cont=0; cont<m; cont ++) {
			System.out.print(data2[cont] + " ");
		}
		System.out.println("\n");
		leitura.close();
		}
	
}
