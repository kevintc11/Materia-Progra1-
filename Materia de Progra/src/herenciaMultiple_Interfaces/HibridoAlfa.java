/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaMultiple_Interfaces;

/**
 *@version 30/octubre/2018
 * @author Kevin Trejos
 */
public class HibridoAlfa extends HombreLobo implements Vampira{

    @Override
    public String debilidades() {//Hereda de hombre lobo
        return "mal comportamiento";
    }

    @Override
    public String poderes() {//Hereda de ambos
        return "Super fuerza";
    }

    @Override
    public String alimentacion() {//Hereda de vampira
        return "Sangre";
    } 
}
