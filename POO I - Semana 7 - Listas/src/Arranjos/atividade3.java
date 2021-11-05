package Arranjos;

public class atividade3 {

	public static void main(String[] args) {
		int  a []  = {2,3,5,6,8,9,10,11,12,13};
		int cont=0;
		for (cont=0; cont<10; cont ++) {
			cont=cont+a[cont];
		}
		int media=cont/10;
		System.out.println("A média dos dez valores do arranjo é" + media);
	}

}
