package com.ipartek.formacion.modelo;

import java.util.ArrayList;

import com.ipartek.formacion.Alumno;



public class DAOAlumnoArrayList implements IPersistible<Alumno> {

	private ArrayList<Alumno> lista;
    private static DAOAlumnoArrayList INSTANCE;
	/**
	 * Encargado de devolver solo un objeto. PATRON SINGLETON
	 * @return
	 */
	public static synchronized DAOAlumnoArrayList getInstance(){
		
		if (INSTANCE == null) {
			INSTANCE = new DAOAlumnoArrayList();
		}
		
		return INSTANCE;
		
	}
	/**
	 * privado para q nadie pueda crear objetos.
	 */
	private DAOAlumnoArrayList() {
		super();
		lista = new ArrayList<Alumno>();
		/*lista.add(new Alumno(12, "Antton"));
		lista.add(new Alumno(45, "MAriJose"));
		lista.add(new Alumno(2, "Pepe"));
		lista.add(new Alumno(44, "Txeila"));*/

	}

	@Override
	public ArrayList<Alumno> getAll() {

		return lista;
	}

	@Override
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

	@Override
	public boolean insert(Alumno a) {
		return lista.add(a);

	}

	@Override
	public boolean delete(int id) {
		Alumno resul = null;
		for (Alumno a : lista) {
			if (a.getId() == id) {
				resul = a;
				break;
			}
		
		}
		return lista.remove(resul);
	}

	@Override
	public boolean update(Alumno pojo) {
		boolean correcto = false;
		for (Alumno a : lista) {
			if (a.getId() == pojo.getId()) {
				a = pojo;
				correcto = true;
				break;
			}
		
		}
		return correcto;
	}

}
