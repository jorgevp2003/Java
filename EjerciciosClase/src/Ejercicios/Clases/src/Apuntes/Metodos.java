package Apuntes;

import java.io.PrintStream;

public class Metodos {

}
class numeros {
	int num;
	
	public numeros (int num) {
		this.num = num;
	}
		
	
	
	int[] random() {
		int contador1 = 0;
		int contador2 = 0;
		int array[] = new int[27];
		
		for(int v = 1;v<=25;v++) {
			
			//Genera numero random
			int num = (int) (Math.random()*91);
			
			//Comprueba que no este usado
				while (contador1 <= 25) {
					if (num != array[contador1]) {
						contador1++;
					} else break;
				
					//Si no esta usado se asigna a un array.
						if (contador1 ==25) {
							array[contador2] = num;
							contador2++;
						} else {
								v = v-1;
						       }
			
			}	
		}
		return array;
	
	}
	
		PrintStream mostrar(numeros num) {
			
			int contador3 = 0;
			int contador4 =1;
			
			int array[] = num.random();
			  
			//Imprimir de 5 en 5
			
			while (contador3 <=24) {
				while (contador4 <=5) {
					System.out.print(array[contador3]);
					contador3++;
					contador4++;
				}
				
				//Resetear fila de 5
				
				if (contador4 == 5) {
					contador4 = 5;
				} else break;
			}
			return System.out.printf("god");
		}
		
		
	
}
