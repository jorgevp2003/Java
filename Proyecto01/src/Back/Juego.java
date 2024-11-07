package Back;

public class Juego {

	public static void main(String[] args) {
		//Clases 
		Clases Asesino = new Clases("Asesino",70, 30, 80, 200);		
		System.out.println("Bienvenido viajero, para empezar tu aventura tendras que empezar por eleguir una clase.");
		System.out.println(" ");
		System.out.println("Primera clase: " + Asesino.nombre);
		System.out.println("Ataque: " + Asesino.ataque + ", Aguilidad " + Asesino.aguilidad +", Vida " + Asesino.vida + " Defensa: " + Asesino.defensa );
		

	}

}
