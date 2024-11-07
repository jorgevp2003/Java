package Back;


public class Clases {
	//Constructor de clases.
String nombre;
int ataque;
int defensa;
int aguilidad;
int vida;



public Clases (String nombre, int ataque, int defensa,int aguilidad, int vida) {
	
this.nombre = nombre;
this.ataque = ataque;
this.defensa= defensa;
this.aguilidad= aguilidad;
this.vida = vida;

	
	}



int elecionClase(int num) {
	switch(num) {
	case 1: System.out.println("Has elegido Asesino");
		break;
	case 2: System.out.println("Has elegido Guerrero");
		break;
	case 3: System.out.println("Has elegido Arquero");
		break;
	}
	return num;
}
}
		




