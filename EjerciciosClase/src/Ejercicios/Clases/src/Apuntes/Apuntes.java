package Apuntes;
import java.util.Scanner;

public class Apuntes {

	public static void main(String[] args) {
		
		
		//Arrays
		//Asignamos los valores al arry.
		int []numeros = {1,2,3,4,5};
		
		System.out.println(numeros.length);
	
		//Llamamos a la posicion numero3.
		
		System.out.println(numeros[3]);
		
		//Creamos un array con 5 casillas tipo int
		
		int array[] = new int[5];
		
		
		//Asignar valor a una casilla del array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nuevo valor que quieres guardar: ");
		int valor = sc.nextInt(	);
		System.out.println("Introduce la casilla en la que quieres guardar el valor: ");
		int casilla = sc.nextInt();
		array[casilla]=valor;
		
		System.out.println(array[casilla]);
		
		//Podemos usar array.length para saber el tamaño de el array
		System.out.println(array.length);
		
		
		//Mini ejercicio
		System.out.println("Mini ejercicio:");
		
		int v[ ]= new int[6];
		int contador =0;
		while (contador<v.length) {
			System.out.println("Valor:");
			valor = sc.nextInt();
			v[contador]=valor;
			contador++;
		}
		
		int suma = 0;
		
		for (int i = 0;i<v.length;i++ ) {

				suma = suma + v[i];
			} 
			System.out.println(suma);
			return;
			
		}
		
		
		

}
