package Listas;

import java.util.LinkedList;


public class atividade1 {
	public static void main(String[] args) {
		LinkedList<String> n = new LinkedList<String>();

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