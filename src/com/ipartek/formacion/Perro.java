package com.ipartek.formacion;

public class Perro {
	
	private String nombre;
	private String raza;
	private int edad;
	private boolean vacunado;
	
	
	
	public Perro(String nombre, String raza, int edad, boolean vacunado) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		
		
		this.edad = edad;
		this.vacunado = vacunado;
	}
	public Perro() {
		super();
		this.nombre = "Sin nombre";
		this.raza = "Mil razas";
		this.edad = 0;
		this.vacunado = false;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	/**
	 * si edad es menor q 0 ponemos 0
	 * @param edad int valor en años
	 * @throws Edad <0
	 */
	public void setEdad(int edad) throws Exception {
		if (edad < 0) {
		//this.edad = 0;
		throw new PerroException(PerroException.ERROR_EDAD); //Lanzamos excepcion de forma manual
		}else {
			this.edad = edad;
		}
	}
	public boolean isVacunado() {
		return vacunado;
	}
	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", vacunado=" + vacunado + "]";
	}
	

}
