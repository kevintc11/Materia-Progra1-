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
public abstract class Figura2D extends Figures{

    public Figura2D() {
        super("",0,0);
    }

    public Figura2D(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public String toString() {
        return "Figura2D{" + "Nombre: " + super.getName() + ", Punto x. " + super.getX() + ", Punto y:" + super.getY() + '}';
    }

    @Override
    public abstract void dibujar();
    
    public abstract double calcularArea();
    
    public abstract double calcularPerimetro();
}
