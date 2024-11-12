package Apuntes;

import java.io.PrintStream;

public class Metodos {

}
class Numeros {
	int[] array;
	
	
	void crearArray(int tamaño){
		
		//crea array
		array = new int[tamaño];	
		crearNumeros();
		
	}

	void crearNumeros() {
		
		//Crear Numero
		for (int i=0;i<=25;i++) {
			int num;
			do {
				num =(int)( Math.random()*90)+1;
			} while (comprobarQueNoSeRepite(num));
			
			array[i]=num;
			
		}
	}
	
	boolean comprobarQueNoSeRepite(int numero) {
		
		
		for(int i=0;i<=24;i++) {
			
			if(array[i]==numero){
			return true;
			} 			
		}
		return false;
	}
	
	int mostrarNumeros() {
		
		for(int i = 0;i<=4;i++){
			int contador =4;
			int contador2 = 0;
			switch (i) {
				case 0: contador2 = 0;
						break;
				case 1: contador2 = 5;
						break;
				case 2: contador2 = 10;
						break;
				case 3: contador2 = 15;
						break;
				case 4: contador2 = 20;
						break;
			}
			
			while (contador>=0) {
				System.out.print( " " + array[contador2]);
				contador2++;
				contador--;
			}
			System.out.println("");
			contador =4;
			contador2 =contador2+5;
		
			
		}
		return 0;
	}
	
}	
