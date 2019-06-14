package com.ipartek.formacion;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSumar() {

		int a = 3, b = 2;
		int resultado = Calculadora.sumar(a, b);
		int esperado = 5;
		assertEquals(esperado, resultado);
		

	}

	@Test
	public void testRestar() {
		//fail("Not yet implemented");
		assertEquals(0, Calculadora.restar(2,2));
		assertEquals(-1, Calculadora.restar(2,3));
		assertEquals(1, Calculadora.restar(3,2));
		
	}
	@Test
	public void testMultiplicar() {
	//	fail("Not yet implemented");
		assertEquals(4, Calculadora.multiplicar(2,2));
		assertEquals(0, Calculadora.multiplicar(2,0));
		assertEquals(0, Calculadora.multiplicar(0,2));
		assertEquals(4, Calculadora.multiplicar(2,2));
		
	}
	@Test
	public void testDividir() {
		//fail("Not yet implemented");
		assertEquals(0, Calculadora.dividir(0,2));
		assertEquals(2, Calculadora.dividir(4,2));
		assertEquals(5, Calculadora.dividir(20,4));
		
		try{
			Calculadora.dividir(2,0);
			fail("deberia haber lanzado excepcion");
		}catch (Exception e){
			assertTrue (true);
		}
		
	}
}
