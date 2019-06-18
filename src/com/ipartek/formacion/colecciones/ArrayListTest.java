package com.ipartek.formacion.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.junit.Test;

import static org.junit.Assert.*;



public class ArrayListTest {

	@Test
	public void test() {
		// String[] paises = new String [3];
		ArrayList<String> paises = new ArrayList<String>();

		assertTrue(paises.isEmpty());

		paises.add("barakaldo");
		paises.add("EEUU");
		paises.add("Korea la buena");

		assertFalse(paises.isEmpty());
		
		//length o size
		assertTrue(paises.size()!=0);
		assertEquals(3,paises.size());
		
		
		
		//insertar "kuala lumpur" entre barakaldo y eeuu
		paises.add(1,"Kuala Lumpur");	
		assertEquals("Kuala Lumpur",paises.get(1));
		
		
		//insertar "Barakaldo de nuevo" para comprobar si se puede repetir
		paises.add("barakaldo");
		int cont=0;
		
		Iterator<String> it = paises.iterator();
		while (it.hasNext()) {
			String pais = it.next();
			if ("barakaldo".equals(pais)) {
				cont++;
			}
		}
		assertEquals(2,cont);
				
		
		//eliminar "korea la buena"
		assertTrue(paises.remove("Korea la buena"));
		assertFalse(paises.remove("Korea la buena"));
		
		
		//usar contains para saber si existe "barakaldo" y "korea la buena"
		assertTrue(paises.contains("barakaldo"));
		assertFalse(paises.contains("Korea la buena"));		
		
		
		//TODO mirar como ordenar alfabeticamente
		
		Collections.sort(paises);
		
		assertEquals("EEUU",paises.get(0));		
		
		
		//probar eliminar todo
		
		paises.clear();
		assertTrue(paises.isEmpty());
		
		
		
		

		
		
		
		
		

		
		
		
		
	}

}
