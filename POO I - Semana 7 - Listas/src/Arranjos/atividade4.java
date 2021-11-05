package Arranjos;

public class atividade4 {
	public static void main(String args[]) {
		int[] va = new int[30];
		int[] vb = new int[30];
		int[] vc = new int[30];
		int[] vd = new int[30];

		// a
		va[0] = 1;
		for (int cont = 1; cont < va.length; cont++) {
			if (cont % 2 == 0) {
				va[cont] = (-va[cont - 1] + 1);
			} else
				va[cont] = (-va[cont - 1] - 1);
		}
		System.out.println("Vetor A:");
		for (int cont : va) {
			System.out.print("[" + cont + "]  ");
		}
		
		System.out.println("\n \n");

		// b
		for (int cont = 0; cont < vb.length; cont++) {
			if (cont == 0) {
				vb[cont] = 1;
			} 
			else {
				if (cont % 2 == 0) {
					vb[cont] = vb[cont - 1] + 1;
				} else
					vb[cont] = vb[cont - 1];
			}

		}
		System.out.println("Vetor B:");
		for (int cont : vb) {
			System.out.print("[" + cont + "]  ");
		}

		System.out.println("\n \n");
		
		// c
		vc[0] = 1;
		for (int cont = 1; cont < vc.length; cont++) {
			vc[cont] = vc[cont - 1] * 2;
		}
		System.out.println("Vetor C:");
		for (int cont : vc) {
			System.out.print("[" + cont + "]  ");
		}
		
		System.out.println("\n \n");

		// d
		vd[0] = 1;
		for (int cont = 1; cont < vd.length; cont++) {
			if (cont > 2) {
				vd[cont] = vd[cont - 1] + vd[cont - 2];
			} else
				vd[cont] = cont;
		}
		System.out.println("Vetor D:");
		for (int cont : vb) {
			System.out.print("[" + cont + "]  ");
		}

	}
}
