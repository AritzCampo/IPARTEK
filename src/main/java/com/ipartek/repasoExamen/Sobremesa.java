package com.ipartek.repasoExamen;

public class Sobremesa extends Ordenador {
	
	private String tipoTorre;
	private boolean grabadora;
		
	
	@Override
	public String toString() {
		return "Sobremesa [tipoTorre=" + tipoTorre + ", grabadora=" + grabadora + "]";
	}

	public String getTipoTorre() {
		return tipoTorre;
	}

	public void setTipoTorre(String tipoTorre) {
		this.tipoTorre = tipoTorre;
	}

	public boolean getGrabadora() {
		return grabadora;
	}

	public void setGrabadora(boolean grabadora) {
		this.grabadora = grabadora;
	}

	public Sobremesa() {
		super();
		this.tipoTorre = null;
		this.grabadora = false;
	}

	public Sobremesa(String nombre, String placaBase, int velocidadCpu, int numeroBits, String tipoTorre, boolean grabadora) {
		super(nombre, placaBase, velocidadCpu, numeroBits);
		this.tipoTorre = tipoTorre;
		this.grabadora = grabadora;
	}

}
