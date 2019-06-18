package com.ipartek.formacion;

/**
 * 
 * @author Curso
 *
 */

public class Youtube {

	public static final int LONGITUD_CODIGO = 11;
	public static final String URL = "https://www.youtuve.com/watch?v=";
	public static final int LONGITUD_MIN_TITULO = 2;
	public static final int LONGITUD_MAX_TITULO = 150;

	// propiedades
	private String titulo; // minimo 2 letras max 150
	private String codigo; // exactamente 11 caracteres
	private int reproducciones;//>=0

	// Constructores
	public Youtube(String titulo, String codigo) throws Exception {
		super();
		/*this.titulo = titulo;
		this.codigo = codigo;*/
		this.setTitulo(titulo);
		this.setCodigo(codigo);
		this.reproducciones = 0;
	}

	// get y set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws Exception {
		if (titulo != null && titulo.length() >= LONGITUD_MIN_TITULO && titulo.length() <= LONGITUD_MAX_TITULO) {
			this.titulo = titulo;
		} else {
			throw new Exception("Titulo debe ser entre " + LONGITUD_MIN_TITULO + " y " + LONGITUD_MAX_TITULO);
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) throws Exception {

		if (codigo != null && codigo.length() == LONGITUD_CODIGO) {
			this.codigo = codigo;

		} else {
			throw new Exception("Longitud codigo debe ser " + LONGITUD_CODIGO);

		}
	}

	public int getReproducciones() {
		return reproducciones;
	}

	public void setReproducciones(int reproducciones) {
		this.reproducciones = reproducciones;
	}

	// funciones
	@Override
	public String toString() {
		return "Youtube [titulo=" + titulo + ", codigo=" + codigo + ", reproducciones=" + reproducciones + "]";
	}

	public String getUrl() {
		return URL + codigo;
	}
	
	

}
