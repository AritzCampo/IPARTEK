package ejercicios.basicos.secuencial;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* LEER DOS ENTEROS EJERCICIO 1
		int n1, n2;
        Scanner sc = new Scanner(System.in);
        //leer el primer número 
        System.out.println("Introduce un número entero: "); 
        n1 = sc.nextInt();      //lee un entero por teclado
        //leer el segundo número
        System.out.println("Introduce otro número entero: "); 
        n2 = sc.nextInt();      //lee un entero por teclado
        //mostrar resultado
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);*/
		
		/*LEER UN NOMBRE EJERCICIO 2
		Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce un nombre: ");
        cadena = sc.nextLine();
        System.out.println("Buenos Días " + cadena);*/
		
		/*LEER NUMERO Y SACAR DOBLE Y TRIPLE EJERCICIO 3
		int numero;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número entero: "); 
		numero = sc.nextInt();
		System.out.println("El numero es: " + numero);
		System.out.println("El doble del numero es: " + numero*2);
		System.out.println("El triple del numero es: " + numero*3);*/
		
		//pasar grados centigrados a fahrenheit EJERCICIO 4
	
		int grados, far;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce grados Celsius: ");
		grados = sc.nextInt();
		far = 32+(9*grados/5);
		System.out.println("Grados Celsius: " + grados);
		System.out.println("Grados FAHRENHEIT: " + far);
		sc.close();
		
		


	}

}
