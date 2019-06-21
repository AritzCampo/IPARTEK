package com.ipartek.com.excepciones;

import com.ipartek.formacion.Perro;

public class PropagacionExcepcion {

	public static void main(String[] args) throws Exception {
		System.out.println("Comienza MAIN");
		metodoA();
		System.out.println("Termina MAIN");
				
		
	}
	
	
	private static void metodoA() throws Exception{
		
		System.out.println("Comienza metodo A");
		//metodoB();
		Perro p = new Perro();
		p.setEdad(-1);
				
		 System.out.println(p);
	    System.out.println("Termina metodo A");
	}
	
	
	
	private static void metodoB() {
		System.out.println("Comienza metodo B");
		
		System.out.println("Termina metodo B");
		
	}

}
