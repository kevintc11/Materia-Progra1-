/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexample;

/**
 * Esfera, cubo y pirámide
 * 
 *@version 25/octubre/2018
 * @author Kevin Trejos
 */
public abstract class Figuras3D extends Figures{

    public Figuras3D() {
    }

    public Figuras3D(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public String toString() {
        return "Figuras3D{" + super.toString() + '}';
    }

    @Override
    public abstract void dibujar();
}
