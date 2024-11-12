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
			
			while (contador>0) {
				System.out.printf( "%3d ", array[contador2]);
				contador2++;
				contador--;
			}
			System.out.println("");
			contador =4;
			contador2 =contador2+5;
		
			
		}
		return 0;
	}
	
	
	
	// Metodos para jugar.
	int comprobarSuma0() {
		
		int suma=0;
		for (int i=0;i<=24;i++) {
			suma = suma +array[i];
		}
		if (suma<=0) {
			return 0;
		}else return 1;
		
	}
	

	//comprueba si lo tienes y en caso de que si lo sustituye por 0
	
boolean comprobarSiTienes(int numero) {
		
		
		for(int i=0;i<=24;i++) {
			
			if(array[i]==numero){
				array[i]= 0;
			return true;
			} 			
		}
		return false;
	}

	void jugarBingo() {
		
		while(comprobarSuma0()>0){
		
			int num =sacarBola();
			
			
			if (comprobarSiTienes(num)==true) {
				System.out.println("Tienes el "+ num);
				
			}else {System.out.println("No tienes "+ num);
			}
			
			//Esperar 0.1 sec
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			mostrarNumeros();
			
			
			
		}
	
	}
	int sacarBola() {
		int num =(int)( Math.random()*90)+1;
		int array[]= new int[91];
		int contador= 0;
		
		while(contador<=89) {
			while(num==array[contador]) {
				num=(int)(Math.random()*90)+1;
				contador++;
	
			}
			
			array[contador]=num;
			
			
			
		}return num;
		
	}
	
}	
