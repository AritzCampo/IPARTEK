package com.ipartek.repasoExamen;

public class Portatil extends Ordenador {
	
	public static int BATERIA_LLENA = 100;
	
	private int tamanyoPantalla;
	private int capacidadBateria;
		
	
	public Portatil() {
		super();
		this.tamanyoPantalla = 0;
		this.capacidadBateria = BATERIA_LLENA;

	}
	public Portatil(String nombre, String placaBase, int velocidadCpu, int numeroBits, int tamañoPantalla) {
		super(nombre, placaBase, velocidadCpu, numeroBits);
		this.tamanyoPantalla = tamañoPantalla;
		this.capacidadBateria = BATERIA_LLENA;
	}

	public int getTamañoPantalla() {
		return tamanyoPantalla;
	}
	@Override
	public String toString() {
		return "Portatil [tamañoPantalla=" + tamanyoPantalla + ", capacidadBateria=" + capacidadBateria + "]";
	}
	public void setTamañoPantalla(int tamañoPantalla) {
		this.tamanyoPantalla = tamañoPantalla;
	}
	public int getCapacidadBateria() {
		return capacidadBateria;
	}
	public void setCapacidadBateria(int capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}

	

}
