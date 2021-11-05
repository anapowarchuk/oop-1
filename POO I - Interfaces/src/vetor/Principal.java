package vetor;

import java.util.Scanner;

public class Principal { //arranjo irregular
	public static void main (String[] args) {
		int [] [] transporte = new int [7] [];
		transporte [0] = new int [10];
		transporte [1] = new int [10];
		transporte [2] = new int [10];
		transporte [3] = new int [10];
		transporte [4] = new int [10];
		transporte [5] = new int [2];
		transporte [6] = new int [2];

		Scanner leitura =  new Scanner (System.in);
		
	for (int i =0; i < transporte.length; i ++) { //linha 
		for (int j = 0; j <transporte [i].length; j ++){//coluna
			transporte [i] [j] = leitura.nextInt();
		}
	}
	leitura.close();
	}
}