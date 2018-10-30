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
public abstract class Figura3D extends Figures{

    public Figura3D() {
        this("",0,0);
    }

    public Figura3D(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public String toString() {
        return "Figura3D{" + super.toString() + '}';
    }

    @Override
    public abstract void dibujar();
}
