package com.ipartek.com.excepciones;

import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroException;

/**
 * Se pueden capturar mas de un tipo de excepciones. Siempre la ultima en
 * capturar q sea Exception q es la mas generica.
 * 
 * @author Curso
 *
 */
public class CapturarTiposExcepciones {

	public static void main(String[] args) {

		try {
			
			Perro[] jauria = new Perro[2];
			jauria[0]=new Perro();
			jauria[1]=new Perro("Arin", "Pastor Aleman", 3, true);
			for (int i = 0; i < 3; i++) {
			    System.out.println(jauria[i].toString());
			}
			
	
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Te has salido fuera del Array");
			e.printStackTrace();
		}/*catch (PerroException e) {
			System.out.println("PerroException null");
			e.printStackTrace();
		}*/catch (NullPointerException e) {
			System.out.println("Excepcion null");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Excepcion generica, siempre la ultima");
			e.printStackTrace();
		}
	}

}
