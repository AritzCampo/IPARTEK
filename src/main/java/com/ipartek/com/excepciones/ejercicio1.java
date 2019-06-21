package com.ipartek.com.excepciones;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubsyso
		int numero1 = 0;
		int numero2 = 0;
		boolean repetir = true;

		System.out.println("Inicio programa");

		Scanner sc = new Scanner(System.in);
		while (repetir) {

			System.out.println("por favor introduce el primer numero:  ");
			String sNumero1 = sc.nextLine();

			try {
				numero1 = Integer.parseInt(sNumero1);
				repetir = false;

			} catch (Exception e) {
				// e.printStackTrace(); para sacar la traza por pantalla
				// System.out.println("MENSAJE EXCEPCION : " + e.getMessage()); MENSAJE
				// EXCEPCION POR PANTALLA
				System.out.println("*****   HE DICHO UN NUMERO, DESGRACIADO  *******");

			}
		}
		repetir = true;
		while (repetir) {
			System.out.println("por favor introduce el segundo numero:  ");
			String sNumero2 = sc.nextLine();
			try {
				numero2 = Integer.parseInt(sNumero2);
				repetir = false;

			} catch (Exception e) {
				// e.printStackTrace(); para sacar la traza por pantalla
				// System.out.println("MENSAJE EXCEPCION : " + e.getMessage()); MENSAJE
				// EXCEPCION POR PANTALLA
				System.out.println("*****   HE DICHO UN NUMERO, DESGRACIADO  *******");

			}

		}

		int suma = numero1 + numero2;

		System.out.println("La suma es " + suma);
		sc.close();

		System.out.println("Fin programa");

	}
}
