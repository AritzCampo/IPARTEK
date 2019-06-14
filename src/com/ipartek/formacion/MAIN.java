package com.ipartek.formacion;

import java.util.Scanner;

public class MAIN {
/**
 * pedimos datos del perro y controlamos la excepcion de la edad. sacamos los datos del perro
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = 0;
		boolean vacunado = false;
		boolean repetir = true;

		System.out.println("Inicio programa");

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el nombre del perro :  ");
		String sNombre = sc.nextLine();

		System.out.println("Dime la raza del perro :  ");
		String sRaza = sc.nextLine();

		while (repetir) {
			System.out.println("Dime la edad del perro :  ");
			String sEdad = sc.nextLine();
			try {
				edad = Integer.parseInt(sEdad);
				repetir = false;
			} catch (Exception e) {
				System.out.println("*******   NECESITO UN NUMERO   ********");

			}
		}
		System.out.println("Esta vacunado? (si/no):  ");
		String sVacunado = sc.nextLine();
		if ((sVacunado.compareToIgnoreCase("si") == 0) || (sVacunado.compareToIgnoreCase("s") == 0)) {
			vacunado = true;
		}
		
		sc.close();

		Perro miPerro = new Perro(sNombre, sRaza, edad, vacunado);
		
		 System.out.println(miPerro.toString());

	}

}
