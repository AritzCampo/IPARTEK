package com.ipartek.alumnosconficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.Alumno;

public class DAOAlumnoFichero {
	private ArrayList<Alumno> lista;
	private static DAOAlumnoFichero INSTANCE;
	static String ficheroNombre = "C:\\1713\\eclipse-workspace\\IPARTEK\\Alumnos.txt";
	static Scanner sc = new Scanner(System.in);
	static FileWriter fw;// new FileWriter(ficheroNombre);
	static FileReader fr;
	static BufferedWriter bw;// = new BufferedWriter(fw);
	static BufferedReader br; // = new BufferedReader(new FileReader(ficheroNombre));

	/**
	 * Encargado de devolver solo un objeto. PATRON SINGLETON
	 * 
	 * @return
	 */
	public static synchronized DAOAlumnoFichero getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new DAOAlumnoFichero();
		}

		return INSTANCE;

	}

	/**
	 * privado para q nadie pueda crear objetos.
	 */
	private DAOAlumnoFichero() {
		super();
		lista = new ArrayList<Alumno>();
		/*
		 * lista.add(new Alumno(12, "Antton")); lista.add(new Alumno(45, "MAriJose"));
		 * lista.add(new Alumno(2, "Pepe")); lista.add(new Alumno(44, "Txeila"));
		 */

	}

	public ArrayList<Alumno> getAll() throws IOException {
		// recupero todo el archivo en la lista
		fr = new FileReader(ficheroNombre);
		br = new BufferedReader(fr);
		String[] alumno;
		String lineaLeida;
		while ((lineaLeida = br.readLine()) != null) {

			alumno = lineaLeida.split(";");
			int id = Integer.parseInt(alumno[0]);
			Alumno objetoAlumno = new Alumno(id, alumno[1]);
			lista.add(objetoAlumno);
		}
		br.close();
		fr.close();

		return lista;
	}

	public Alumno getById(int id) {

		Alumno resul = null;
		for (Alumno a : lista) {
			if (a.getId() == id) {
				resul = a;
				break;
			}
		}
		return resul;
	}

	public boolean insert(Alumno a) throws IOException {
		// lo escribo en el fichero antes de cargarlo en la lista
		fw = new FileWriter(ficheroNombre, true);// true para q no sobreescriba el fichero
		bw = new BufferedWriter(fw);
		bw.write(a.getId());
		bw.write(";");
		bw.write(a.getNombre());
		bw.write(";");
		bw.write(a.getVecesElegido());
		bw.newLine();
		bw.close();
		fw.close();

		return lista.add(a);

	}

	public boolean insertPrimero(Alumno a) throws IOException {
		// lo escribo en el fichero antes de cargarlo en la lista
		fw = new FileWriter(ficheroNombre);
		bw = new BufferedWriter(fw);
		bw.write(String.valueOf(a.getId()));
		bw.write(";");
		bw.write(a.getNombre());
		bw.write(";");
		bw.write(a.getVecesElegido());
		bw.newLine();
		bw.close();
		fw.close();

		return lista.add(a);

	}

	public void volcadoFichero() throws IOException {
		for (int i = 0; i < lista.size(); i++) {
			if (i != 0) {
				this.insertPrimero(lista.get(i));
			} else {
				this.insert(lista.get(i));
			}

		}

	}

	public boolean delete(int id) throws IOException {
		boolean borradoOk = false;
		lista = this.getAll();
		Alumno resul = null;
		for (Alumno a : lista) {
			if (a.getId() == id) {
				resul = a;
				break;
			}
		}
		if (resul != null) {
			lista.remove(resul);
			borradoOk = true;
		}
		this.volcadoFichero();

		return borradoOk;
	}

	public boolean update(Alumno pojo) throws IOException {
		boolean correcto = false;
		lista = this.getAll();
		for (Alumno a : lista) {
			if (a.getId() == pojo.getId()) {
				a = pojo;
				correcto = true;
				break;
			}

		}
		this.volcadoFichero();
		return correcto;
	}

}
