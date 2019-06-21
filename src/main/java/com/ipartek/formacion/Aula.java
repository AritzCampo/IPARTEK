package com.ipartek.formacion;

import java.util.ArrayList;

public class Aula {

	public static void main(String[] args) {
		// declarar array con nombre alumnos. generar numero aleatorio. el q salga lee.
		// mostrar.

		// declarar array con nombre alumnos
		ArrayList<Person> alumnos = new ArrayList<Person>();
		alumnos.add(new Person(23,"Ander"));
		alumnos.add(new Person(54,"Mounir"));
		alumnos.add(new Person(56,"Andoni"));
	//	alumnos.add(new Person("Asier"));
	//	alumnos.add(new Person("Jon C"));
	//	alumnos.add(new Person("Arkaitz"));
	//	alumnos.add(new Person("Manuel"));
	//	alumnos.add(new Person("Eder I"));
	//	alumnos.add(new Person("Eder S"));
	//	alumnos.add(new Person("Gaizka"));
	//	alumnos.add(new Person("Borja"));
	//	alumnos.add(new Person("Verónica"));
	//	alumnos.add(new Person("Jon A"));
	//	alumnos.add(new Person("Jose Luis"));


		int numero = (int) (Math.random() * alumnos.size());

		System.out.println("El Voluntario es " + alumnos.get(numero).getNombre());

		for (int i = 0; i < alumnos.size(); i++) {

			if (numero == i) {

				System.out.println("*** " + alumnos.get(i)); // toString()

			} else {

				System.out.println(i + " " + alumnos.get(i).getNombre());

			}

		} 

	}

}
