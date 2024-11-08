package Ejercicios;
import java.util.Scanner;
import java.util.Random;

public class EjerecicioC12 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        String[] simb = {"*", "+", "/", "-"};
        int puntuacion = 0;
       
        int res = 1;
        
        while (res==1) {
        	
        	//Crear 2 numeros random
        	int random = new Random().nextInt(10) + 1;
            int random2 = new Random().nextInt(10) + 1;
            
            //Crea simbolo de operacion
            int operadorIndex = new Random().nextInt(simb.length);
            String s = simb[operadorIndex];
            
            //Inicia seleccion de operacion
        	System.out.print("Indica cual es el resultado de: ");
        	System.out.println(random + s + random2);
            int num = sc.nextInt();
            switch (s) {
                case "*":
                    res = random * random2;
                    break;
                case "+":
                    res = random + random2;
                    break;
                case "/":
                    res = random / random2;
                    break;
                case "-":
                    res = random - random2;
                    break;

            }
            
            //Si accierta suma 1 y reinicia
            if (res == num) {
                System.out.println("Correcto");
                res = 1;
                puntuacion++;
               
             // Si falla termina   
            } else {
                System.out.println("Incorrecto");
                System.out.println("Tu puntuacion ha sido: " + puntuacion);
                res = 2;
                return;
                
            }

            System.out.println("Tu puntuacion ha sido " +puntuacion);

        }
        
	}

}
