package com.krakedev.figuras.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figura figura = new Cuadrado("forma", "rojo", 5);
        Cuadrado cuadrado = new Cuadrado("cuadrado","azul",4);
        Triangulo triangulo = new Triangulo("triangulo","morado");

        System.out.println("FIGURA");
        System.out.println(figura);
        System.out.println("CUADRADO");
        System.out.println(cuadrado);
        System.out.println("TRIANGULO");
        System.out.println(triangulo);

	}

}
