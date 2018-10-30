/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexample;

/**
 *
 * @author usuario
 */
public class Circle extends Figura2D{
    private static double PI = 3.14;
    private double radio;

    public Circle() {
        this(0.0,0,0,"");
    }

    public Circle(double radio, int x, int y, String name) {
        super(name, x, y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.toString() + "Circle{" +  ", radio=" + radio + '}';
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando");
    } 

    @Override
    public double calcularArea() {
        double area = PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * PI * radio;
        return perimetro; 
    }
    
    
}
