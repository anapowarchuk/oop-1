package Arranjos;

public class atividade7 {

	public static void main(String[] args) {
		String B[] = { "a", "b", "c", "d", "e", "f", "g" };
		String normal = " ";
		for (int cont = 0; cont < B.length; cont++) {
			normal = normal + B[cont];
		}
		System.out.println("Arranjo normal:" + normal);

		String contrario = "";

		for (int cont = (B.length - 1); cont >= 0; cont--) {
			contrario = contrario + B[cont];
		}
		System.out.println("Arranjo ao contrário:" + contrario);

		if (normal == contrario) {
			System.out.println("\n\n\t\tEssa palavra é palíndromo :)");
		} else {
			System.out.println("\n\n\t\tEssa palavra não é palíndromo :(");
		}

	}

}
