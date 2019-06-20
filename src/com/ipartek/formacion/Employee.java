package com.ipartek.formacion;

import java.util.Date;

public class Employee extends Person{
	public final float SALARIO_MINIMO = 937.05f;
	
	private int numeroEmpleado;
	private Date fechaContrato;
	private float salario;
	
	
	
	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public Date getFechaContrato() {
		return fechaContrato;
	}
	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		this.numeroEmpleado = 0;
		this.fechaContrato = new Date();
		this.salario = SALARIO_MINIMO;
	}
	public Employee(int id, String nombre, int edad, float altura, float peso, String ojos, char sexo, float salario) {
		super(id, nombre, edad, altura, peso, ojos, sexo);
		this.salario = salario;
	}

	
	
	
	
	
}
