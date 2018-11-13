/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;


/**
 *
 * @author usuario
 */
public class Recursividad {

    public static void main(String[] args) {
        System.out.println(sumatoria(5));
     
    }
            
    public static int sumatoria(int n){
        if (n <= 1) {
            return n;
        }else{
            return n + sumatoria(n-1);
        }
    }
    
    
}
   
