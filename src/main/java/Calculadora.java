package com.ipartek.formacion;

public class Calculadora {
	
	/**
	 * Suma 2 enteros
	 * @param a int 
	 * @param b int
	 * @return a+b
	 */
	public static int sumar (int a, int b) {
	  return a + b;
	}

	public static int restar (int a, int b) {
		  return a - b;
	
		}
	public static int multiplicar (int a, int b) {
		 return a * b;

		}
	public static int dividir (int a, int b) throws ArithmeticException {
		return a / b;
		
		}
}
