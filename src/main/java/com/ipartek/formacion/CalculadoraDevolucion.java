package com.ipartek.formacion;



public class CalculadoraDevolucion {

	public static float[] BILLETES_MONEDAS = {
			// billetes
			500, 200, 100, 50, 20, 10, 5,
			// monedas
			2, 1, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };

	/**
	 * calculamos las vueltas a entregar con el minimo numero de billetes y monedas
	 * a entregar
	 * 
	 * @param importe   coste de la compra
	 * @param entregado dinero entregado para pagar
	 * @return int[] cantidad de billetes y mionedas
	 * @see public static float[] BILLETES_MONEDAS
	 * @throws Exception si el importe > entregado
	 */
	public static int[] vueltas(float importe, float entregado) throws Exception {
		float diferencia = 0;
		float aux = 0;
		int resultado[] = new int[15];

		if (entregado == importe) {

			for (int i = 0; i <= 14; i++) {
				resultado[i] = 0;
			}
			throw new Exception("El importe es exacto, no hay devoluciones");
		} else {

			if (entregado < importe) {
				throw new Exception("Pagame lo que pone, no menos");
			} else {
				if (importe <= 0) {
					throw new Exception("El importe no puede ser negativo");
				} else {
					diferencia = entregado - importe;
					for (int i = 0; i <= 14; i++) {

						if (diferencia >= BILLETES_MONEDAS[i]) {
							if (i < 9) {
								resultado[i] = (int) diferencia / (int) BILLETES_MONEDAS[i];
								diferencia = diferencia % BILLETES_MONEDAS[i];
								} else {
								
									aux = diferencia / BILLETES_MONEDAS[i];
									resultado[i] = (int) aux;
									diferencia = diferencia % BILLETES_MONEDAS[i];
								

							}
						}else {
							if (diferencia > 0 && diferencia < 0.01) {
								resultado[i] = 1;
						}

					}

				}

			}
		}

		return resultado;
	}
	}
}
