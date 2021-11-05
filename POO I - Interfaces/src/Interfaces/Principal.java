package Interfaces;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		System.out.println("CARRO\n");
		System.out.println("Informe a marca");
		String marca = leitura.nextLine();
		System.out.println("Informe o modelo");
		String modelo = leitura.nextLine();
		System.out.println("Informe a motorização");
		double motorizacao = leitura.nextDouble();
		System.out.println("Informe o peso");
		double peso = leitura.nextDouble();
		System.out.println("Informe o ano");
		int ano = leitura.nextInt();
		System.out.println("Informe o numero de eixos");
		int numEixos = leitura.nextInt();
		System.out.println("Informe o numero de passageiros");
		int numP = leitura.nextInt();

		Carro car = new Carro(marca, modelo, motorizacao, peso, ano, numEixos, numP);
		System.out.println("IPVA DO CARRO: " + car.calculaIPVA(2011, 1.0));
		System.out.println("\nSEGURO DO CARRO: " + car.calculaSeguro(2011, 1.0));
		System.out.println("\nPEDAGIO: " + car.calculaPedagio(1));

		
		
		System.out.println("\n____________________\nCAMINHÃO\n");
		System.out.println("Informe a marca");
		marca = leitura.nextLine();
		System.out.println("Informe o modelo");
		modelo = leitura.nextLine();
		System.out.println("Informe a motorização");
		motorizacao = leitura.nextDouble();
		System.out.println("Informe o peso");
		peso = leitura.nextDouble();
		System.out.println("Informe o ano");
		ano = leitura.nextInt();
		System.out.println("Informe o numero de eixos");
		numEixos = leitura.nextInt();
		System.out.println("Informe a capacidade");
		double capac = leitura.nextDouble();
		leitura.close();
		
		Caminhao cam = new Caminhao(marca, modelo, motorizacao, peso, ano, numEixos, capac);
		System.out.println("IPVA DO CAMINHÃO: " + cam.calculaIPVA(2011, 1.0));
		System.out.println("\nSEGURO DO CAMINHÃO: " + cam.calculaSeguro(2011, 1.0));
		System.out.println("\nPEDAGIO: " + cam.calculaPedagio(1));
	}
	}