/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexample;

/**
 * 
 * 
 *@version 25/octubre/2018
 * @author Kevin Trejos
 */
public class Square extends Figura2D{
    private int lado;

    public Square() {
        this(0,0,0,"");
    }

    public Square(int lado, int x, int y, String name) {
        super(name, x, y);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return super.toString() + "Square{" + "lado=" + lado + '}';
    }

    @Override
    public double calcularArea() {
        double area = lado * lado;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = lado * 4;
        return perimetro;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando");
    }
    
    
}
