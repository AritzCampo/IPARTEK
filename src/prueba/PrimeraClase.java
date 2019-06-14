package prueba;

public class PrimeraClase {

	public static void main(String[] args) {
		// declarar array con nombre alumnos. generar numero aleatorio. el q salga lee. mostrar.
		
		String [] alumnos = new String [14];
		alumnos[0] = "Mounir";
		alumnos[1] = "Andoni";
		alumnos[2] = "Asier";
		alumnos[3] = "Jon C";
		alumnos[4] = "Arkaitz";
		alumnos[5] = "Aritz";
		alumnos[6] = "Manuel";
		alumnos[7] = "Eduardo";
		alumnos[8] = "Eder I";
		alumnos[9] = "Eder S";
		alumnos[10] = "Gaizka";
		alumnos[11] = "Borja";
		alumnos[12] = "Veronica";
		alumnos[13] = "Jon A";
		
		/*for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}*/
		
		int numero;
		numero = (int) (Math.random() * alumnos.length); 
		//System.out.println(alumnos[0]);
		System.out.println(alumnos[numero]);
				
		
	}

}
