package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Generalos un menu para insertar, borrar, mostrar  y buscar alumno de forma aleatoria
 * Usuario introduce la opcion y lo sigue haciendo hasta q elige salir
 * @author Aritz
 *
 */
public class AulaPerson {
	/*
	 * menu
	 * 
	 * 
	 * 1 listar alumnos ordenado ranking
	 * 
	 * 2 crear alumno (nombre, edad)
	 * 
	 * 3 eliminar alumno
	 * 
	 * 4 buscar voluntario (no puede salir el mismo de nuevo)
	 * 
	 * 
	 * 
	 * lo mas encapsulado posible la eleccion con switch case
	 * 
	 * 
	 * switch ( op ) { case '+': System.out.println( a + b ); break; case '-':
	 * System.out.println( a - b ); break; case '*': System.out.println( a * b );
	 * break; case '/': System.out.println( a / b ); break; default:
	 * System.out.println("error" ); break; }
	 */
	
	public static void rellenarLista() {
		//TODO rellenar manualmente para pruebas
	}

	public static void generarMenu() {
		// TODO generar menu interfaz

	}

	public static int pedirOpcionMenu() throws Exception {

		Scanner sc = new Scanner(System.in);
		boolean correcto = false;
		String sOpcion;
		int opcion = 0;
		while (!correcto) {
			System.out.println("INTRODUZCA UNA OPCION :  ");
			sOpcion = sc.nextLine();
			try {
				opcion = Integer.parseInt(sOpcion);
				if (opcion > 1 && opcion < 5) {
					correcto = true;
				}
			} catch (Exception e) {
				throw new Exception("INTRODUZCA UN NUMERO ENTRE 1 Y 5 POR FAVOR");
			}
		}
		sc.close();
		return opcion;
	}

	public static void listarAlumnosRanking() {
		// TODO listar todos los alumnos
	}

	public static void insertarAlumno() {
		// TODO inserta alumno
	}

	public static void eliminarAlumno() {
		// TODO elimina alumno
	}

	public static int buscarAlumno(int longitud) {
		// TODO genera alumno aleatorio
		int alumnoSeleccionado = 0;
		alumnoSeleccionado = (int) (Math.random() * longitud);
	  //System.out.println(alumnos[0]); System.out.println(alumnos[numero]);
		

		return alumnoSeleccionado;
	}

	public static void main(String[] args) throws Exception {
		int opcion = 0;

		final ArrayList<Person> alumnos = new ArrayList<Person>();
		
		rellenarLista();

		generarMenu();

		opcion = pedirOpcionMenu();

		while (opcion != 5) {

			switch (opcion) {
			case 1:
				listarAlumnosRanking();
				break;
			case 2:
				insertarAlumno();
				break;
			case 3:
				eliminarAlumno();
				break;
			case 4:
				buscarAlumno(alumnos.size());
				break;
			default:
				System.out.println("Hasta otra");
				break;
			}
		}

		
	}

}
