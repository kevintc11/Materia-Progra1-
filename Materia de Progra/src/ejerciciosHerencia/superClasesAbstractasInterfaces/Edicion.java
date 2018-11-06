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
public class Edicion extends Periodico{
    private int numeroEjemplares;
    private boolean valorHistorico;

    public Edicion(int numeroEjemplares, boolean valorHistorico) {
        this.numeroEjemplares = numeroEjemplares;
        this.valorHistorico = valorHistorico;
    }

    public Edicion(int numeroEjemplares, boolean valorHistorico, String nombreImprenta, int numeroID, int añoPublicacion) {
        super(nombreImprenta, numeroID, añoPublicacion);
        this.numeroEjemplares = numeroEjemplares;
        this.valorHistorico = valorHistorico;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public boolean isValorHistorico() {
        return valorHistorico;
    }

    public void setValorHistorico(boolean valorHistorico) {
        this.valorHistorico = valorHistorico;
    }

    @Override
    public String toString() {
        return "Edicion{" + "numeroEjemplares=" + numeroEjemplares + ", valorHistorico=" + valorHistorico + '}';
    }
    
    // Falta los métodos
}
