/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trejoskevinexamen1;

/**
 * Esta clase contiene los productos
 * 
 *@version 18/octubre/2018
 * @author Kevin Trejos
 */
public class Producto {
    
    private String codigo;
    private String descripcion;
    private double precio;
    
 
    public Producto() {
        Producto producto = new Producto("vacio", "vacio", 0);
    }

    public Producto(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
    
    
}
