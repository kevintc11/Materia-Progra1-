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
public class PruebaLibro {
    public static void main(String[] args) {
        Libro libroEstante = new LibrosEstante(2, "Don quijote", "duhvuife", "Juan", 250);
        Libro libroSala = new LibrosSala("tener o ser", "Erich", "no se", 117, "Filosofia");
        System.out.println(libroEstante.tiempoPrestamo());
        System.out.println(libroSala.tiempoPrestamo());
        System.out.println(libroEstante.toString());
        System.out.println(libroSala.toString());
    }
}
