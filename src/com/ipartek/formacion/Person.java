package com.ipartek.formacion;

public class Person {

	
	 private  String nombre;
	 private  int edad;
	 private  float altura;
	 private  float peso;
	 private  String ojos;
	 private  char sexo;

	  
	 public String saludar() {
		return "Hola me llamo " + nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public String getOjos() {
		return ojos;
	}


	public void setOjos(String ojos) {
		this.ojos = ojos;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

    public Person() {
    	super();
    }
    
    public Person(String nombre) {
		this();
		this.setNombre(nombre);
		
	}
    
	public Person(String nombre, int edad, float altura, float peso, String ojos, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.ojos = ojos;
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", ojos="
				+ ojos + ", sexo=" + sexo + "]";
	}
	
	   

}
