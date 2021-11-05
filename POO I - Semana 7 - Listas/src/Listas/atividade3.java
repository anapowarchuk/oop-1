package Listas;

import java.util.Stack;

public class atividade3 {

	public static void main(String[] args) {
		Stack<String> n = new Stack<String>();

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
