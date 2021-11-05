package Veterinaria;

public class Veterinaria {
	
	public Animal proximo(){
		Animal a;
		double x= Math.random();
		if (x>0.5)
			a= new Gato();
		else
			a= new Cachorro();
		return a;
	}
	public void cuidar (Animal a){
		a.Cacar();
		a.Barulho();
	}
	public static void main(String[] args) {
		Veterinaria v= new Veterinaria(); //instanciamento de veterinaria
		
		Animal a;
		
		for(int i=0; i<10; i++){
			System.out.println("\n");
			a=v.proximo();
			v.cuidar(a);
		}
		
	}
}
