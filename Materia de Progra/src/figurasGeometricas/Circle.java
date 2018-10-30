/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasGeometricas;

/**
 * Esta clase representa un círculo
 * 
 *@version 25/octubre/2018
 * @author Kevin Trejos
 */
public class Circle extends FigurasGeometricas{
    private static double PI = 3.14;
    private double radio;

    public Circle() {
        this(0.0,0,0,"");
    }

    public Circle(double radio, int x, int y, String name) {
        super(x, y, name);
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
    
    
}
