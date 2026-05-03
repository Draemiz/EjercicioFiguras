package com.krakedev.figuras;

public class Rectangulo extends Figura {
	
	private int base;
	private int altura;
	
	public Rectangulo(String nombre, String color, int altura, int base) {
			super(nombre,color);
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public int calcularPerimetro() {
		return 2*base+2*altura;
	}
	
	@Override
	public int calcularArea() {
		return base*altura;
	}
	
}
