package com.ipartek.formacion.modelo;

import java.util.ArrayList;


/**
 * 
 * operaciones basicas de CRUD para pojos
 * @author Aritz
 *
 */
public interface IPersistible<P> {
	
	ArrayList<P> getAll();
	
	P getById(int id);
	
	boolean insert(P a);
	
	boolean delete (int id);
	
	boolean update (P pojo);
}
