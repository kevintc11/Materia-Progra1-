/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasGeometricas;
/**
 * Esta clase es la clase madre
 * 
 *@version 25/octubre/2018
 * @author Kevin Trejos
 */
public class FigurasGeometricas {
    private int x;
    private int y;
    private String name;

    public FigurasGeometricas() {
        this(0,0,"");
    }

    public FigurasGeometricas(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FigurasGeometricas{" + "x=" + x + ", y=" + y + ", name=" + name + '}';
    }
}
