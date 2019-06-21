package com.ipartek.formacion;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrdenarArrayTest {

	@Test(expected = Exception.class)
	public void arrayTodosIguales() throws Exception {
		int[] arrayTest = new int[10];
		int[] arrayOrdenado = new int[10];
		arrayTest[0] = 647;
		arrayTest[1] = 647;
		arrayTest[2] = 647;
		
		
		
		arrayTest[3] = 647;
		
		
		
		arrayTest[4] = 647;
		arrayTest[5] = 647;
		arrayTest[6] = 647;
		arrayTest[7] = 647;
		arrayTest[8] = 647;
		arrayTest[9] = 647;

		
		
		arrayOrdenado = OrdenarArray.ordenar(arrayTest);

	}

	@Test
	public void arrayDiez() throws Exception {
		int[] arrayTest = new int[10];
		int[] arrayOrdenado = new int[10];

		arrayTest[0] = 9;
		arrayTest[1] = 8;
		arrayTest[2] = 7;
		arrayTest[3] = 6;
		arrayTest[4] = 5;
		arrayTest[5] = 4;
		arrayTest[6] = 3;
		arrayTest[7] = 2;
		arrayTest[8] = 1;
		arrayTest[9] = 0;

		arrayOrdenado = OrdenarArray.ordenar(arrayTest);

		assertArrayEquals(arrayTest, arrayOrdenado);
	}

	@Test
	public void arrayAleatorios() throws Exception {
		int[] arrayTest = new int[15];
		int[] arrayOrdenado = new int[15];

		arrayTest[0] = 647;
		arrayTest[1] = 21;
		arrayTest[2] = 47;
		arrayTest[3] = 60;
		arrayTest[4] = 22;
		arrayTest[5] = 833;
		arrayTest[6] = 14;
		arrayTest[7] = 384;
		arrayTest[8] = -520;
		arrayTest[9] = 99874;
		arrayTest[10] = 798;
		arrayTest[11] = 3;
		arrayTest[12] = 117;
		arrayTest[13] = 34;
		arrayTest[14] = 98;

		arrayOrdenado = OrdenarArray.ordenar(arrayTest);
		assertArrayEquals(arrayTest, arrayOrdenado);
	}

}
