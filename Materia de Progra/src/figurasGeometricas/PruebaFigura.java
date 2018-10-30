/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasGeometricas;

/**
 * Esta es la clase prueba
 * 
 *@version 25/octubre/2018
 * @author Kevin Trejos
 */
public class PruebaFigura {
    public static void main(String[] args) {
        Square square = new Square(3, 20, 50, "cuadrado");
        System.out.println("" + square.toString());
        Triangle triangle = new Triangle(10, 10, 12, 7, "Triángulo");
        System.out.println("" + triangle.toString());
    }
    
}
