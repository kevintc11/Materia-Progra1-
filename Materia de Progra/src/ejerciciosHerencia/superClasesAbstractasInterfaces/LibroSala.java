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
public class LibroSala extends Libro{
     private String nombreSala;
    

    public LibroSala() {
       this("","","",0,"");
    }

    public LibroSala(String nombre, String autor, String edicion, int hojas, String nombreSala) {
        super(nombre, autor, edicion, hojas);
        this.nombreSala = nombreSala;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    @Override
    public String toString() {
        return "LibrosSala{"+ super.toString() + "nombreSala=" + nombreSala + '}';
    }
    
    @Override
    public int tiempoPrestamo(){
        int tiempo;
        tiempo = (1 + getHojas()) / 100;
        if (tiempo > 30) {
            return 30;
        }
        return tiempo;
    }
}
