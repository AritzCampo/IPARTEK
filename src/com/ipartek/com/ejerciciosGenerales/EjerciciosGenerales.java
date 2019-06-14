package com.ipartek.com.ejerciciosGenerales;

import java.util.Scanner;

/**
 * Ejercicios generales para no aburrirme
 * 
 * @author Curso
 *
 */
public class EjerciciosGenerales {

	public static void main(String[] args) {

		/*
		 * Ejercicio de cambiar numeros Scanner sc = new Scanner(System.in); int A, B,
		 * AUX; System.out.print("Introduzca valor de A: "); A = sc.nextInt();
		 * System.out.print("Introduzca Valor de B: "); B = sc.nextInt();
		 * System.out.println("Valores iniciales: A = " + A + "   B = " + B);
		 * //instrucciones para hacer el intercambio //se utiliza una variable auxiliar
		 * AUX = A; A = B; B = AUX; System.out.println("Valores intercambiados: A = " +
		 * A + "   B = " + B);
		 */

		/*
		 * //sacar la cantidad de digitos del numero introducido Scanner sc = new
		 * Scanner(System.in); String numeroRecoger; int numeroIni=0, numeroAux=1000,
		 * contador=0, numero=0; boolean repetir=true;
		 * 
		 * while (repetir) {
		 * 
		 * System.out.print("Introduzca valor de A: "); numeroRecoger = sc.nextLine();
		 * 
		 * try { numero = Integer.parseInt(numeroRecoger); numeroIni=numero; repetir =
		 * false;
		 * 
		 * } catch (Exception e) { // e.printStackTrace(); para sacar la traza por
		 * pantalla // System.out.println("MENSAJE EXCEPCION : " + e.getMessage());
		 * MENSAJE // EXCEPCION POR PANTALLA
		 * System.out.println("*****   HE DICHO UN NUMERO, DESGRACIADO  *******");
		 * 
		 * }
		 * 
		 * } while (numero != 0) { numero = numero/10; contador++;
		 * 
		 * }
		 * 
		 * System.out.println("El numero " + numeroIni + " tiene " + contador +
		 * " cifras."); sc.close();
		 */

		/*
		// pasar de binario a decimal
		Scanner sc = new Scanner(System.in);
		String binario;
		int numero = 0, aux = 0, digito = 0, decimal=0, exponente=0;
		boolean esBinario = false;

		
		while (!esBinario) {
		System.out.print("Introduzca numero binario: ");
		binario = sc.nextLine();

		try {
			numero = Integer.parseInt(binario);
			aux = numero;
			while (aux != 0) {
				digito = aux % 10;
				if (digito != 0 && digito != 1) {
					System.out.println("*****  TIENE Q SER UN NUMERO BINARIO  *******");
					aux = 0;
					break;
				}else {
					aux = aux / 10;
				}				
			}
			while (numero != 0) {
	                
	                digito = numero % 10;
	                
	                decimal = decimal + digito * (int) Math.pow(2, exponente);
	            
	                exponente++;
	              
	                numero = numero / 10;
	      }
			  
			 System.out.println("Decimal: " + decimal);
			 
		} catch (Exception e) {
			
			System.out.println("*****  TIENE Q SER UN NUMERO BINARIO  *******");

		}

		

		sc.close();
	}*/

}
}
