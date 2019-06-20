package com.ipartek.formacion;

public class Alumno extends Person implements Comparable<Alumno>{

	private int vecesElegido;
	
	

	public Alumno() {
		super();
		this.vecesElegido = 0;
	}
	

	public Alumno(int id, String nombre, int edad, float altura, float peso, String ojos, char sexo, int vecesElegido) {
		super(id, nombre, edad, altura, peso, ojos, sexo);
		this.vecesElegido = vecesElegido;
		
	}
	
	public Alumno(int id, String nombre) {
		super(id, nombre);
		vecesElegido = 0;
	}

	public Alumno(int id, String nombre, int vecesElegido) {
		super(id, nombre);
		this.vecesElegido = vecesElegido;
	}

	@Override
	public int compareTo(Alumno o) {
		return o.getVecesElegido() - this.vecesElegido;
	}
	@Override
	public String toString() {
		return super.toString() + "Alumno [vecesElegido=" + vecesElegido + "]";
	}


		public int getVecesElegido() {
		return vecesElegido;
	}

	public void setVecesElegido(int vecesElegido) {
		this.vecesElegido = vecesElegido;
	}
}
