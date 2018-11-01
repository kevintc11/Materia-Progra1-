/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosHerencia;

/**
 *
 * @author usuario
 */
public abstract class Libro {
    private String nombre;
    private String autor;
    private String edicion;
    private int hojas;

    public Libro(String nombre, String autor, String edicion, int hojas) {
        this.nombre = nombre;
        this.autor = autor;
        this.edicion = edicion;
        this.hojas = hojas;
    }

    public Libro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public int getHojas() {
        return hojas;
    }

    public void setHojas(int hojas) {
        this.hojas = hojas;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", edicion=" + edicion + ", hojas=" + hojas + '}';
    }
    
    public abstract int tiempoPrestamo();
}
