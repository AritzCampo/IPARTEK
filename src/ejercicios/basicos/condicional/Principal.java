package ejercicios.basicos.condicional;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException{
		//VER SI UN CARACTER INTRODUCIDO ES NUMERO O LETRA EJERCICIO 9
		//  Character car1;
        /*System.out.print("Introduzca car�cter: ");
        car1 = (char)System.in.read(); //lee un car�cter
        if(Character.isDigit(car1)) //utilizamos el m�todo isDigit de la clase Character
           System.out.println("Es un n�mero");
        else {
           System.out.println("No es un n�mero");
           if (Character.isUpperCase(car1))
        	   System.out.println("Este en Mayusculas");
           else
        	   System.out.println("Este en Minusculas");
        }*/
		  char car1, car2;
	        System.out.print("Introduzca primer car�cter: ");
	        car1 = (char)System.in.read(); //lee un car�cter
	        System.in.read();  //saltar el intro que ha quedado en el buffer
	        System.out.print("Introduzca segundo car�cter: ");
	        car2 = (char)System.in.read(); //lee el segundo car�cter
	        System.out.println("\n"); 
	        if(car1 == car2)
	           System.out.println("Son iguales");    
	        else
	           System.out.println("No son iguales");

	}

}
