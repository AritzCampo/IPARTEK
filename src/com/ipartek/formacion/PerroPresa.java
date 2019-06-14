package com.ipartek.formacion;

public class PerroPresa extends Perro{
	private int ataque;

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	public void atacar () {
		System.out.println("grrrrrrrrr");
	}

}
