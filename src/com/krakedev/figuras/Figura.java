package com.krakedev.figuras;

public class Figura {

	private String nombre;
	private String color;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", color=" + color;
	}
	
	//Constructor

	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}
	
	public int CalcularPerimetro() {
		return 0;
	}

	public int calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
}
