/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trejoskevinexamen1;

import java.util.Objects;

/**
 * Esta clase almacena todas las ordenes de productos y las gestiona
 * 
 *@version 18/octubre/2018
 * @author Kevin Trejos
 */
public class ListaOrdenes {
    
    Orden[] ordenes = new Orden[3];
    int ordenesHechas = 0;
    

    public ListaOrdenes() {
        Orden[] ordenes = new Orden[3];
    }
    
    public void ingresar(Orden orden){
        if (ordenes != null && orden != null) {
            if (ordenesHechas == 0) {
                ordenes[0] = orden;
                ordenesHechas += 1;
            }
            for (int i = 0; i < ordenes.length; i++) {
                if (ordenesHechas < ordenes.length - 1) {
                    ordenes[i] = orden;
                    ordenesHechas += 1;
                }else{
                    duplicar();
                    ordenes[i] = orden;
                }
            }
        }else{
            System.out.println("Errorrr");
        }
    }
    
    public Orden procesar(){
        Orden ordenProcesada = null;
        if(ordenes != null){
            for (int i = 0; i < ordenes.length; i++) {
                if (ordenes[0] != null) {
                    for (int j = 0; j < ordenes.length; j++) {
                        ordenProcesada = ordenes[0];
                    } 
                }   
            }
            ordenes[0] = null;
        }
        return ordenProcesada;
    }
    
    public String busqueda(String codigo){
        Orden temp;
        String retornar = " ";
        if (ordenes != null && codigo != null) {
            for (Orden i : ordenes) {
                for (int j = 0; j < ordenes.length - 1; j++) {
                    if (Integer.valueOf(codigo) > Integer.valueOf(ordenes[j + 1].getProducto().getCodigo())) {
                        temp = ordenes[j];
                        ordenes[j] = ordenes[j + 1];
                        ordenes[j +1] = temp;
                    }
                }
            }
            retornar = busquedaBinaria(codigo);
            return retornar;
        }
        return null;
    }
    
    private String busquedaBinaria(String codigo){
        int centro, primero, ultimo;
        if (ordenes != null && codigo != null) {
            Orden elementoCentral;
            primero = 0;
            ultimo = ordenes.length - 1;
            while (primero <= ultimo) {            
                centro = (primero + ultimo) / 2;
                elementoCentral = ordenes[centro];
                if (Integer.valueOf(codigo) > Integer.valueOf(elementoCentral.getProducto().getCodigo())) {
                    return codigo;
                }else{
                    if (Integer.valueOf(codigo) < Integer.valueOf(elementoCentral.getProducto().getCodigo())) {
                        ultimo = centro -1;
                    }else{
                        primero = centro + 1;
                    }
                }
            }
        }
        return null;
    }
    
    public void listar(){
        String retornar = "";
        if (ordenes != null) {
            for (Orden i : ordenes) {
                System.out.println(i.toString());
            }
        }
    }
    
    private Orden[] duplicar(){
        Orden[] ordenesNueva = new Orden[ordenes.length * 2];
        for (int i = 0; i < ordenes.length; i++) {
            ordenesNueva[i] = ordenes[i];
        }
        ordenesNueva = ordenes;
        return ordenesNueva;
    }
    
}
