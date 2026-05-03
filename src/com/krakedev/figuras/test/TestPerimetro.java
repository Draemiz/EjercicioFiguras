package com.krakedev.figuras.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestPerimetro {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Cuadrado cuadrado= new Cuadrado("Cuadrado", "Azul.",10);
		Rectangulo rectangulo = new Rectangulo("Rectangulo","Amarillo.",10,20);
		Graficador graficador = new Graficador();
		TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo("Triangulo rectangulo", "rosa",4,5);
		
		
		System.out.println("Cuadrado");
        System.out.println("Perimetro Cuadrado "+ cuadrado.calcularPerimetro());
        System.out.println("Rectangulo");
        System.out.println("Perimetro Recangulo "+ rectangulo.calcularPerimetro());
        
        System.out.println("---------------");
        
        Figura figura = new Cuadrado("figura", "azul", 1);
        System.out.println("Perimetro Figura "+ figura.calcularPerimetro());
        
        System.out.println("\n--- POLIMORFISMO ---");
        
        graficador.graficar(cuadrado);
        
        System.out.println("---------------");
        
        graficador.graficar(rectangulo);
        
        System.out.println("---------------");
        
        graficador.graficar(trianguloRectangulo);
        
	}
}
