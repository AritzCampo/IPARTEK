package com.ipartek.formacion;

public class OrdenarArray {
/**
 * Ordena un array de menor a mayor
 * @param arrayDesordenado array con numeros desordenados
 * @return int[] array ordenado de menor a mayor
 * @throws Exception
 */
	public static int[] ordenar(int[] arrayDesordenado) throws Exception {

		//int[] arrayOrdenado = new int[arrayDesordenado.length];
		int aux = 0;

		  for (int i = arrayDesordenado.length - 1; i >= 0; i--) {
				if (arrayDesordenado[0] != arrayDesordenado[i]) {
					break;
				} else {
					if (i==0) {
						throw new Exception("todas las posiciones son el mismo numero");
					}
					
					

				}
			}

			for (int j = 0; j <= arrayDesordenado.length - 1; j++) {
				for (int i = 0; i <= arrayDesordenado.length - 2; i++) {
					if (arrayDesordenado[i] >= arrayDesordenado[i + 1]) {

						aux = arrayDesordenado[i + 1];
						arrayDesordenado[i + 1]=arrayDesordenado[i];
						arrayDesordenado[i] = aux;
					}

				}

			}


	return arrayDesordenado;
}

}
