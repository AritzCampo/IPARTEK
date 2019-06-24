package com.ipartek.repasoExamen;


public abstract class Ordenador implements Comparable<Ordenador> {
	
	
	public static int CPU_64 = 64;
	public static int CPU_32 = 32;
	
	private String nombre;
	private String placaBase;
	private int velocidadCpu;
	private int numeroBits;

	
	@Override
	public int compareTo(Ordenador o) {
		// TODO Auto-generated method stub		
		return o.getVelocidadCpu() - this.getVelocidadCpu();
	}
	
	public Ordenador() {
		super();
		this.nombre = null;
		this.placaBase = null;
		this.velocidadCpu = 0;
		this.numeroBits = CPU_32;
		
	}

	public Ordenador(String nombre, String placaBase, int velocidadCpu, int numeroBits) {
		super();
		this.nombre = nombre;
		this.placaBase = placaBase;
		this.velocidadCpu = velocidadCpu;
		this.numeroBits = numeroBits;
	}

	@Override
	public String toString() {
		return "Ordenador [nombre=" + nombre + ", placaBase=" + placaBase + ", velocidadCpu=" + velocidadCpu
				+ ", numeroBits=" + numeroBits + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlacaBase() {
		return placaBase;
	}

	public void setPlacaBase(String placaBase) {
		this.placaBase = placaBase;
	}

	public int getVelocidadCpu() {
		return velocidadCpu;
	}

	public void setVelocidadCpu(int velocidadCpu) {
		this.velocidadCpu = velocidadCpu;
	}

	public int getNumeroBits() {
		return numeroBits;
	}

	public void setNumeroBits(int numeroBits) {
		this.numeroBits = numeroBits;
	}


	
	

}
