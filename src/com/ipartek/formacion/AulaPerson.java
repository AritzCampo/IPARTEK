package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Generamos un menu para insertar, borrar, mostrar y buscar alumno de forma
 * aleatoria Usuario introduce la opcion y lo sigue haciendo hasta q elige salir
 * Los objetos del arraylist son objetos de tipo Person
 * 
 * @author Aritz
 *
 */
public class AulaPerson {
	static ArrayList<Alumno> alumnos;//variables globales para trabajar sobre ellas desde cualquier funcion
	static Scanner sc = null;//scanner para leer

	/**
	 * Funcion que muestra el menu
	 */
	public static void generarMenu() {
		System.out.println("                MENU PRINCIPAL");
		System.out.println("***********************************************");
		System.out.println("*1.-    LISTAR ALUMNOS ORDENADOS POR RANKING  *");
		System.out.println("*2.-    CREAR ALUMNO                          *");
		System.out.println("*3.-    ELIMINAR ALUMNO                       *");
		System.out.println("*4.-    GENERAR VOLUNTARIO                    *");
		System.out.println("*5.-    SALIR                                 *");
		System.out.println("***********************************************");

	}
    /**
     * Funcion para recuperar la opcion del usuario. No sale hasta q la opcion es correcta 
     * @return La opcion q elige el usuario
     * 
     */
	public static int pedirOpcionMenu(){

		boolean correcto = false;
		String sOpcion;
		int opcion = 0;
		while (!correcto) {

			System.out.println("INTRODUZCA UNA OPCION :  ");
			sOpcion = sc.nextLine();

			try {
				opcion = Integer.parseInt(sOpcion);
				if (opcion >= 1 && opcion <= 5) {
					correcto = true;
				} else {
					System.out.println("INTRODUZCA UN NUMERO ENTRE 1 Y 5 POR FAVOR");
				}
			} catch (Exception e) {

				System.out.println("INTRODUZCA UN NUMERO ENTRE 1 Y 5 POR FAVOR");
			}
		}

		return opcion;
	}
    /**
     * Saca un listado de los alumnos ordenado por numero de veces que han sido elegidos
     * @param alumnos arrayList de personas, recibe el objeto arrayList global para trabajar con el
     */
	public static void listarAlumnosRanking(ArrayList<Alumno> alumnos) {
		Collections.sort(alumnos);
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println(i + 1 + " " + alumnos.get(i).getNombre() + " " + alumnos.get(i).getVecesElegido());
		}
	}
    /**
     * Inserta un alumno nuevo al final de la lista
     * @param alumnos, arrayList de personas, recibe el objeto arrayList global para trabajar con el
     */
	public static void insertarAlumno(ArrayList<Alumno> alumnos) {
		String nombreAlumno;
		System.out.println("INTRODUZCA UN NOMBRE :  ");
		nombreAlumno = sc.nextLine();
		alumnos.add(new Alumno(nombreAlumno));
		System.out.println("Nuevo alumno insertado");

	}
    /**
     * Eliminamos alumno. Preguntamos si eliminar por nombre o por posicion. 
     * No sale si no es opcion correcta. 
     * @param alumnos,arrayList de personas, recibe el objeto arrayList global para trabajar con el
     */
	public static void eliminarAlumno(ArrayList<Alumno> alumnos) {
		String nombreAlumno;
		boolean correcto = false;
		String sOpcion;
		int opcion = 0;
		while (!correcto) {
			System.out.println("****************************************");
			System.out.println("*1.-    ELIMINAR POR NOMBRE            *");
			System.out.println("*2.-    ELIMINAR POR POSICION          *");
			System.out.println("*3.-    VOLVER                         *");
			System.out.println("****************************************");
			System.out.println();
			System.out.println("INTRODUZCA OPCION PARA ELIMINAR :  ");
			sOpcion = sc.nextLine();
			try {
				opcion = Integer.parseInt(sOpcion);
				if (opcion >= 1 && opcion <= 3) {
					correcto = true;
					if (opcion == 1) {
						System.out.println("INTRODUZCA UN NOMBRE :  ");
						nombreAlumno = sc.nextLine();
						for (int i = 0; i < alumnos.size(); i++) {
							if (alumnos.get(i).getNombre().equals(nombreAlumno)) {
								alumnos.remove(i);
							}
						}
					} else if (opcion == 2) {
						correcto = false;
						while (!correcto) {
							System.out.println("INTRODUZCA UNA POSICION :  ");
							sOpcion = sc.nextLine();
							try {
								opcion = Integer.parseInt(sOpcion);
								alumnos.remove(opcion - 1);
								correcto = true;

							} catch (Exception e) {

								System.out.println("POSICION INCORRECTA");
							}
						} // end while posicion correcta
					} else {
						correcto = true;
					} // end else
				} else {
					System.out.println("INTRODUZCA UN NUMERO ENTRE 1 Y 3 POR FAVOR");
					correcto = false;
				}
			} catch (Exception e) {

				System.out.println("INTRODUZCA UN NUMERO ENTRE 1 Y 3 POR FAVOR");
			}

		} // end while segundo menu

	}
    /**
     * Genera un numero aleatorio para ver a quien le toca leer
     * @param longitud, int longitud maxima del arrayList
     * @return int posicion. La posicion de la persona a leer
     */
	public static int generarAleatorio(int longitud) {
		int alumnoSeleccionado = 0;
		alumnoSeleccionado = (int) (Math.random() * longitud);
		// System.out.println(alumnos[0]); System.out.println(alumnos[numero]);

		return alumnoSeleccionado;
	}
    /**
     * Busca el alumno al que le toca leer y lo muestra. llama a generarAleatorio
     * @param alumnos, arrayList de personas, recibe el objeto arrayList global para trabajar con el
     */
	public static void buscarAlumno(ArrayList<Alumno> alumnos) {
		int i = generarAleatorio(alumnos.size());
		alumnos.get(i).setVecesElegido(alumnos.get(i).getVecesElegido() + 1);
		System.out.println("El alumno q leera es :  " + alumnos.get(i).getNombre());
	}

	public static void main(String[] args) throws Exception {
		int opcion = 0;
		sc = new Scanner(System.in);

		alumnos = new ArrayList<Alumno>();

		
		while (opcion != 5) {

			generarMenu();

			opcion = pedirOpcionMenu();

			switch (opcion) {
			case 1:
				listarAlumnosRanking(alumnos);
				break;
			case 2:
				insertarAlumno(alumnos);
				break;
			case 3:
				eliminarAlumno(alumnos);
				break;
			case 4:
				buscarAlumno(alumnos);
				break;
			default:
				System.out.println("Hasta otra");
				break;
			}
		}
		sc.close();
	} // end main

}
