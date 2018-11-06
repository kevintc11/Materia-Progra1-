/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosHerencia.superClasesAbstractasInterfaces;

/**
 *
 * @author usuario
 */
public abstract class Periodico implements Biblioteca{
    private String nombreImprenta;
    private int numeroID;
    private int añoPublicacion;

    public Periodico() {
    }

    public Periodico(String nombreImprenta, int numeroID, int añoPublicacion) {
        this.nombreImprenta = nombreImprenta;
        this.numeroID = numeroID;
        this.añoPublicacion = añoPublicacion;
    }

    public String getNombreImprenta() {
        return nombreImprenta;
    }

    public void setNombreImprenta(String nombreImprenta) {
        this.nombreImprenta = nombreImprenta;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public String toString() {
        return "Periodico{" + "nombreImprenta=" + nombreImprenta + ", numeroID=" + numeroID + ", a\u00f1oPublicacion=" + añoPublicacion + '}';
    }

    @Override
    public abstract int tiempoPrestamo();

    
}
