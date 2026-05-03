package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura {
	
	private int catetoA;
	private int catetoB;
	private int hipotenusa;
	
	public TrianguloRectangulo(String nombre, String color) {
		super(nombre,color);
	}
	
	public TrianguloRectangulo(String nombre, String color, int catetoA, int catetoB) {
		super(nombre,color);
		this.catetoA = catetoA;
		this.catetoB = catetoB;
		calcularHipotenusa();
	}
	
	private void calcularHipotenusa() {
		double hipotenusaDouble =  Math.sqrt(catetoA^2+catetoB^2);
		this.hipotenusa = (int) Math.round(hipotenusaDouble);
	}

	@Override
	public int calcularPerimetro() {
		return catetoA + catetoB + hipotenusa;
	}
	
	@Override
	public int calcularArea() {
		return (catetoA*catetoB)/2;
	}
}
