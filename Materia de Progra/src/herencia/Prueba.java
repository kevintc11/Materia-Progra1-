/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *@version 23/octubre/2018
 * @author Kevin Trejos
 */
public class Prueba {
    public static void main(String[] args) {
        Student kevin = new Student("Kevin", "Trejos", "Informática Empresarial", "B87902");
        System.out.println("" + kevin);
        
        Person person1 = new Student("Juan", "Pérez", "Ing", "12345678");
        System.out.println("" + person1);
    }
}
