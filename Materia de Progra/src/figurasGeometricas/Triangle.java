/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasGeometricas;

/**
 * Esta clase representa un triangulo
 * 
 *@version 25/octubre/2018
 * @author Kevin Trejos
 */
public class Triangle extends FigurasGeometricas{
    private int base;
    private int altura;

    public Triangle(int base, int altura, int x, int y, String name) {
        super(x, y, name);
        this.base = base;
        this.altura = altura;
    }

    public Triangle() {
        this(0,0,0,0,"");
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangle{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
