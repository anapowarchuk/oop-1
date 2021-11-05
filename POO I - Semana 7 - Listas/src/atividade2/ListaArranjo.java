package atividade2;

import java.util.ArrayList;


public class ListaArranjo {
	public static void main(String[] args) {
		ArrayList<String> n = new ArrayList<String>();

		n.add("A");
		n.add("B");
		n.add("C");
		n.add("D");
		System.out.print(n.get(0) + " - ");
		System.out.print(n.get(1) + " - ");
		System.out.print(n.get(2) + " - ");
		System.out.print(n.get(3));
	}
}