package com.ipartek.repasoExamen;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AppGestionOrdenadores {

	private static final String FILE_NAME = "ordenadores.txt";

	static Scanner sc = null;
	static ArrayList<Ordenador> listaOrdenadores;

	/**
	 * Funcion que muestra el menu
	 */
	public static void generarMenu() {
		System.out.println("                MENU PRINCIPAL");
		System.out.println("**********************************");
		System.out.println("*1.-    LISTAR ORDENADORES       *");
		System.out.println("*2.-    CREAR PORTATIL           *");
		System.out.println("*3.-    CREAR SOBREMESA          *");
		System.out.println("*4.-    CHEQUEAR BATERIA         *");
		System.out.println("*5.-    SALIR                    *");
		System.out.println("**********************************");

	}

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

	public static void insertarPortatil() {

		String nombre;
		String placaBase;
		String srtVelocidadCpu;
		int velocidadCpu = 0;
		// String srtNumeroBits;
		int numeroBits = 32;
		// String srtTamanyoPantalla;
		int tamanyoPantalla = 0;
		// String srtCapacidadBateria;
		int capacidadBateria = 100;

		Portatil nuevo = new Portatil();
		System.out.println("INTRODUZCA UN NOMBRE :  ");
		nombre = sc.nextLine();
		System.out.println("INTRODUZCA UNA PLACA BASE :  ");
		placaBase = sc.nextLine();
		boolean correcto = false;
		while (!correcto) {
			System.out.println("INTRODUZCA VELOCIDAD CPU :  ");
			srtVelocidadCpu = sc.nextLine();
			try {
				velocidadCpu = Integer.parseInt(srtVelocidadCpu);
				correcto = true;
			} catch (Exception e) {
				System.out.println("Velocidad erronea");
			}
		}
		nuevo.setNombre(nombre);
		nuevo.setPlacaBase(placaBase);
		nuevo.setNumeroBits(numeroBits);
		nuevo.setTamañoPantalla(tamanyoPantalla);
		nuevo.setCapacidadBateria(capacidadBateria);
		nuevo.setVelocidadCpu(velocidadCpu);

		if (listaOrdenadores.add(nuevo)) {
			System.out.println("ORDENADOR CREADO");
		} else {
			System.out.println("No se inserto");
		}
		/*
		 * correcto = false; while (!correcto) {
		 * System.out.println("INTRODUZCA NUMERO DE BITS :  "); srtNumeroBits =
		 * sc.nextLine(); try { numeroBits = Integer.parseInt(srtNumeroBits); correcto =
		 * true; } catch (Exception e) { System.out.println("Bits erroneos"); } }
		 * 
		 * correcto = false; while (!correcto) {
		 * System.out.println("INTRODUZCA VELOCIDAD CPU :  "); srtVelocidadCpu =
		 * sc.nextLine(); try { velocidadCpu = Integer.parseInt(srtVelocidadCpu);
		 * correcto = true; } catch (Exception e) {
		 * System.out.println("Velocidad erronea"); } }
		 * 
		 * correcto = false; while (!correcto) {
		 * System.out.println("INTRODUZCA VELOCIDAD CPU :  "); srtVelocidadCpu =
		 * sc.nextLine(); try { velocidadCpu = Integer.parseInt(srtVelocidadCpu);
		 * correcto = true; } catch (Exception e) {
		 * System.out.println("Velocidad erronea"); } }
		 * 
		 * correcto = false; while (!correcto) {
		 * System.out.println("INTRODUZCA VELOCIDAD CPU :  "); srtVelocidadCpu =
		 * sc.nextLine(); try { velocidadCpu = Integer.parseInt(srtVelocidadCpu);
		 * correcto = true; } catch (Exception e) {
		 * System.out.println("Velocidad erronea"); } }
		 */

	}

	public static void insertarSobremesa() {

		String nombre;
		String placaBase;
		String srtVelocidadCpu;
		int velocidadCpu = 0;
		// String srtNumeroBits;
		int numeroBits = 32;
		// String srtTamanyoPantalla;
		String tipoTorre = "grande";
		// String srtCapacidadBateria;
		boolean grabadora = false;

		Sobremesa nuevo = new Sobremesa();
		System.out.println("INTRODUZCA UN NOMBRE :  ");
		nombre = sc.nextLine();
		System.out.println("INTRODUZCA UNA PLACA BASE :  ");
		placaBase = sc.nextLine();
		boolean correcto = false;
		while (!correcto) {
			System.out.println("INTRODUZCA VELOCIDAD CPU :  ");
			srtVelocidadCpu = sc.nextLine();
			try {
				velocidadCpu = Integer.parseInt(srtVelocidadCpu);
				correcto = true;
			} catch (Exception e) {
				System.out.println("Velocidad erronea");
			}
		}
		nuevo.setNombre(nombre);
		nuevo.setPlacaBase(placaBase);
		nuevo.setNumeroBits(numeroBits);
		nuevo.setTipoTorre(tipoTorre);
		nuevo.setGrabadora(grabadora);
		nuevo.setVelocidadCpu(velocidadCpu);

		if (listaOrdenadores.add(nuevo)) {
			System.out.println("ORDENADOR CREADO");
		} else {
			System.out.println("No se inserto");
		}

	}

	public static void listarOrdenadoresCpu() {
		// ArrayList<Alumno> lista = dao.getAll();
		int i = 1;
		Collections.sort(listaOrdenadores);
		for (Ordenador elemento : listaOrdenadores) {

			System.out.print(i + " " + listaOrdenadores.get(i - 1).getNombre() + " "
					+ listaOrdenadores.get(i - 1).getVelocidadCpu() + " ");
			i++;
			if (elemento instanceof Portatil) {
				System.out.println("PORTATIL");
			} else if (elemento instanceof Sobremesa) {
				System.out.println("SOBREMESA");
			}
		}
	}

	public static void grabarFichero() {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			System.out.println("He creado el fichero " + FILE_NAME);
			oos.writeObject(listaOrdenadores);
			oos.flush();
		} catch (Exception e) {
			System.out.println("NO ESTOYCREANDO EL FICHERO");
			e.printStackTrace();
		}
	}

	/*private void desSeralizarLista() {

		try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME)) ){	

			lista =  (ArrayList<Alumno>) ois.readObject();

		}catch (Exception e) {
			// e.printStackTrace();   EOF
		}
	}*/

	

	public static void main(String[] args) {

		listaOrdenadores = new ArrayList<Ordenador>();

		int opcion = 0;

		sc = new Scanner(System.in);

		while (opcion != 5) {

			generarMenu();

			opcion = pedirOpcionMenu();

			switch (opcion) {
			case 1:
				listarOrdenadoresCpu();
				break;
			case 2:
				insertarPortatil();
				break;
			case 3:
				insertarSobremesa();
				break;
			case 4:
				// buscarAlumno();
				break;
			default:
				String grabar;
				System.out.println("DESEA GRABAR DATOS EN FICHERO? si/no");
				grabar = sc.nextLine();
				if (grabar.equals("si")) {
					grabarFichero();
				}
				opcion = 6;
				break;
			}
		}
		sc.close();

		// if ( elemento instanceof Diamante )

	}

}
