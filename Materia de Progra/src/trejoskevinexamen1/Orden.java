/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trejoskevinexamen1;

/**
 * Esta clase contiene las ordenes
 * 
 *@version 18/octubre/2018
 * @author Kevin Trejos 
 */
public class Orden {
    Producto producto = new Producto();
    private String cedula;
    private int cantidad;
    

    public Orden() {
        Orden orden = new Orden("00000", 0, producto);
    }

    public Orden(String cedula, int cantidad, Producto producto) {
        this.cedula = cedula;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    @Override
    public String toString() {
        return "Orden{" + "cedula=" + cedula + ", cantidad=" + cantidad + ", producto=" + producto + '}';
    }
    
    
    
}
