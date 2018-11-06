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
public class LibroEstante extends Libro{
    private int estante;
    private boolean prestamo;

    public LibroEstante() {
        this(0,"", "", "", 0);
    }

    public LibroEstante(int estante, String nombre, String autor, String edicion, int hojas) {
        super(nombre, autor, edicion, hojas);
        this.estante = estante;
    }

    public int getEstante() {
        return estante;
    }

    public void setEstante(int estante) {
        this.estante = estante;
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }
    
    

    @Override
    public String toString() {
        return "LibrosEstante{" + super.toString() + "estante=" + estante + '}';
    }

    @Override
    public int tiempoPrestamo(){
        int tiempo;
        if (isPrestamo() == true) {
            return 24;
        }
        tiempo = getHojas() / 100;
        if (tiempo <= 6) {
            if(tiempo == 0){
                return 1;
            }
            return tiempo;
        }
        return 0;
    }
}
