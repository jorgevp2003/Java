package Back;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		//Clases 
		
		Clases Asesino = new Clases("Asesino",70, 30, 80, 200);	
		Clases Guerrero = new Clases("Guerrero",50,60,50,400);
		Clases Arquero = new Clases("Arquero",80,30,60,100);
		
		//Introducion a las clases 
		
		System.out.println("Bienvenido viajero, para empezar tu aventura tendras que empezar por eleguir una clase.");
		System.out.println(" ");
		System.out.println("Primera clase: " + Asesino.nombre);
		System.out.println("Ataque: " + Asesino.ataque + ", Aguilidad " + Asesino.aguilidad +", Vida " + Asesino.vida + " Defensa: " + Asesino.defensa );
		System.out.println("");
		System.out.println("Segunda clase: " + Guerrero.nombre);
		System.out.println("Ataque: " + Guerrero.ataque + ", Aguilidad " + Guerrero.aguilidad +", Vida " + Guerrero.vida + " Defensa: " + Guerrero.defensa );
		System.out.println("");
		System.out.println("Tercera clase: " + Arquero.nombre);
		System.out.println("Ataque: " + Arquero.ataque + ", Aguilidad " + Arquero.aguilidad +", Vida " + Arquero.vida + " Defensa: " + Arquero.defensa );
		System.out.println("");
		
		//Selecion de clases
		
		System.out.print("Ahora tendras que eleguir entre 1 de ellas: ");
		System.out.print("1 Asesino, 2 Guerrero, 3 Arquero");
		Scanner sc = new Scanner(System.in);
		int clase = sc.nextInt();
		Arquero.elecionClase(clase);
		
		
	
		
	}

}
