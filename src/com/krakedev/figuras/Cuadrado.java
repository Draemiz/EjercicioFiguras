package com.krakedev.figuras;

public class Cuadrado extends Figura{
	
	private int lado;

	public Cuadrado (String nombre, String color, int lado) {
		super(nombre, color);
		this.lado = lado;
	}
	
	@Override
	public int calcularPerimetro() {
		return 4*lado;
	}
}
