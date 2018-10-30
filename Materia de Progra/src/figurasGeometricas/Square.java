/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasGeometricas;

/**
 * Esta clase representa un cuadrado
 * 
 *@version 25/octubre/2018
 * @author Kevin Trejos
 */
public class Square extends FigurasGeometricas{
    private int lado;

    public Square() {
        this(0,0,0,"");
    }

    public Square(int lado, int x, int y, String name) {
        super(x, y, name);
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
}
