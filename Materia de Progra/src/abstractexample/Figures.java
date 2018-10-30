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
public abstract class Figures {
    private String name;
    private int x;
    private int y;

    public Figures() {
        this("",0,0);
    }

    public Figures(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    @Override
    public String toString() {
        return "Figures{" + "name=" + name + ", x=" + x + ", y=" + y + '}';
    }
    
    public abstract void dibujar();
}
