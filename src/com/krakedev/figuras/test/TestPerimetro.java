package com.krakedev.figuras.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Cuadrado cuadrado= new Cuadrado("Cuadrado", "Azul,",10);
		Rectangulo rectangulo = new Rectangulo("Rectangulo","Amarillo",10,20);
		
		System.out.println("Cuadrado");
        System.out.println("Perimetro Cuadrado "+ cuadrado.calcularPerimetro());
        System.out.println("Rectangulo");
        System.out.println("Perimetro Recangulo "+ rectangulo.calcularPerimetro());
        
        Figura figura = new Figura("fig", "azul");
        System.out.println("Perimetro Figura "+ figura.calcularPerimetro());
	}
}
