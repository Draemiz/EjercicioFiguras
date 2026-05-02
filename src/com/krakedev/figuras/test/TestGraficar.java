package com.krakedev.figuras.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

public class TestGraficar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graficador graficador = new Graficador();
		
		Figura figura = new Figura("Figura", "Azul");
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo");
		Triangulo triangulo = new Triangulo("Triangulo", "Verde");
		Rectangulo rectangulo = new Rectangulo("Rectangulo","Amarillo");
		
		System.out.println("FIGURA");
        System.out.println(figura);
        System.out.println("CUADRADO");
        System.out.println(cuadrado);
        System.out.println("TRIANGULO");
        System.out.println(triangulo);
        System.out.println("RECTANGULO");
        System.out.println(rectangulo);
        
        graficador.graficar(figura);
        graficador.graficar(cuadrado);
        graficador.graficar(triangulo);
        graficador.graficar(rectangulo);
		
	}
}
