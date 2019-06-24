package com.ipartek.formacion.modelo;

import java.util.ArrayList;


/**
 * 
 * operaciones basicas de CRUD para pojos
 * @author Aritz
 *
 */
public interface IPersistible<P> {
	/**
	 * Listado de P
	 * @return lista de P, si no hay datos lista inicializada
	 */
	ArrayList<P> getAll();
	/**
	 * recupera P por su identificador
	 * @param id, int identificador
	 * @return P,si no existe null
	 */
	P getById(int id);
	/**
	 * Crea un nuevo registro
	 * @param P objeto
	 * @return true si lo inserta, false si no
	 */
	boolean insert(P a);
	/**
	 * Elimina un nuevo registro por identificador
	 * @param  id int identificador
	 * @return true si lo inserta, false si no
	 */
	
	boolean delete (int id);
	/**
	 * Modifica un nuevo registro
	 * @param p, objeto
	 * @return true si lo inserta, false si no
	 */
	boolean update (P pojo);
}
