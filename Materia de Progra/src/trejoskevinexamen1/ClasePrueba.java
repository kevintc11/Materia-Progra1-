/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trejoskevinexamen1;

/**
 * Esta es la clase de prueba
 * 
 *@version 18/octubre/2018
 * @author Kevin Trejos
 */
public class ClasePrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaOrdenes lista = new ListaOrdenes();
        Producto productos = new Producto("abc", "ropa", 1500);
        Producto producto1 = new Producto("98", "Play Station", 256000);
        Producto producto2 = new Producto("cbvf", "Cama", 134000);
        Producto producto3 = new Producto("ertyui", "Computadora", 15479288);
        Orden nuevasOrdenes = new Orden("60456789", 2, productos);
        Orden orden1 = new Orden("12345678", 3, producto1);
        Orden orden2 = new Orden("09876543", 3, producto3);
        Orden orden3 = new Orden("4567890", 6, producto2);
        lista.ingresar(nuevasOrdenes);
        lista.ingresar(orden2);
        lista.ingresar(orden3);
        lista.ingresar(orden1);
        //System.out.println(lista.procesar());
        System.out.println(lista.busqueda("09876543"));
        //lista.listar();
        
    }
    
}
