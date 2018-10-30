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
public class LibrosSala extends Libro{
    private String nombreSala;


    public LibrosSala() {
       this("","","",0,"");
    }

    public LibrosSala(String nombre, String autor, String edicion, int hojas, String nombreSala) {
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
        return super.toString() + "LibrosSala{" + "nombreSala=" + nombreSala + '}';
    }
    
    
}
