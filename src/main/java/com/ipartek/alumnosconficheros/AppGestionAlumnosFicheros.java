package com.ipartek.alumnosconficheros;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.ipartek.formacion.Alumno;
//import com.ipartek.formacion.modelo.DAOAlumnoArrayList;

public class AppGestionAlumnosFicheros {
	static DAOAlumnoFichero dao;
	static Scanner sc = null;

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
	 * Funcion para recuperar la opcion del usuario. No sale hasta q la opcion es
	 * correcta
	 * 
	 * @return La opcion q elige el usuario
	 * 
	 */
	public static int pedirOpcionMenu() {

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
	 * Saca un listado de los alumnos ordenado por numero de veces que han sido
	 * elegidos
	 * 
	 * @param alumnos arrayList de personas, recibe el objeto arrayList global para
	 *                trabajar con el
	 * @throws IOException
	 */
	public static void listarAlumnosRanking() throws IOException {
		ArrayList<Alumno> lista = dao.getAll();
		if (lista.size() != 0) {
			Collections.sort(lista);
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(i + 1 + " " + lista.get(i).getNombre() + " " + lista.get(i).getVecesElegido());
			}
		}else {
			System.out.println("LISTA VACIA");
		}
	}

	/**
	 * Inserta un alumno nuevo al final de la lista
	 * 
	 * @param alumnos, arrayList de personas, recibe el objeto arrayList global para
	 *                 trabajar con el
	 * @throws IOException
	 */
	public static void insertarAlumno() throws IOException {
		String nombreAlumno;
		String strId;
		int id = 0;
		Alumno nuevo = new Alumno();
		System.out.println("INTRODUZCA UN NOMBRE :  ");
		nombreAlumno = sc.nextLine();
		boolean correcto = false;
		while (!correcto) {
			System.out.println("INTRODUZCA UN ID :  ");
			strId = sc.nextLine();
			try {
				id = Integer.parseInt(strId);
				correcto = true;
			} catch (Exception e) {
				System.out.println("ID ERRONEO");
			}
		}
		nuevo.setNombre(nombreAlumno);
		nuevo.setId(id);
		if (dao.insert(nuevo)) {
			System.out.println("Nuevo alumno insertado");
		} else {
			System.out.println("Error al insertar");
		}

	}

	public static void eliminarAlumno() throws IOException {
		ArrayList<Alumno> lista = dao.getAll();
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
						for (int i = 0; i < lista.size(); i++) {
							if (lista.get(i).getNombre().equals(nombreAlumno)) {
								// dao.delete(i);
								if (dao.delete(lista.get(i).getId())) {
									System.out.println("Nuevo alumno borrado");
								} else {
									System.out.println("Error al borrar");
								}
							}
						}
					} else if (opcion == 2) {
						correcto = false;
						while (!correcto) {
							System.out.println("INTRODUZCA UNA POSICION :  ");
							sOpcion = sc.nextLine();
							try {
								opcion = Integer.parseInt(sOpcion);
								// dao.delete(lista.get(opcion -1).getId());
								if (dao.delete(lista.get(opcion - 1).getId())) {
									System.out.println("Nuevo alumno borrado");
								} else {
									System.out.println("Error al borrar");
								}
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
	 * 
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
	 * 
	 * @param alumnos, arrayList de personas, recibe el objeto arrayList global para
	 *                 trabajar con el
	 * @throws IOException
	 */
	public static void buscarAlumno() throws IOException {
		ArrayList<Alumno> lista = dao.getAll();
		int i = generarAleatorio(lista.size());
		lista.get(i).setVecesElegido(lista.get(i).getVecesElegido() + 1);
		dao.update(lista.get(i));
		System.out.println("El alumno q leera es :  " + lista.get(i).getNombre());
	}

	public static void main(String[] args) throws IOException {
		int opcion = 0;
		// dao = new DAOAlumnoArrayList();
		dao = DAOAlumnoFichero.getInstance();
		sc = new Scanner(System.in);

		while (opcion != 5) {

			generarMenu();

			opcion = pedirOpcionMenu();

			switch (opcion) {
			case 1:
				try {
					listarAlumnosRanking();
					break;
				} catch (Exception e) {
					System.out.println("todavia no hemos creado la lista");
					break;
				}
			case 2:
				insertarAlumno();
				break;
			case 3:
				eliminarAlumno();
				break;
			case 4:
				buscarAlumno();
				break;
			default:
				System.out.println("Hasta otra");
				break;
			}
		}
		sc.close();

	}

}
