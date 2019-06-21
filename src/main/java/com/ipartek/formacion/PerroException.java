package com.ipartek.formacion;
/**
 * Excepcion personalizada para el POJO del perro
 * @author Curso
 *
 */
public class PerroException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public static String ERROR_EDAD = "La edad debe ser mayor q 0";
	
	public PerroException(String error) {
		super(error);
	}
	
	
	

}