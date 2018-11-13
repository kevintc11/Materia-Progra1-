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
        //System.out.println(sumatoria(5));
        System.out.println(divisionPorResta(10, 2));
    }
            
    public static int sumatoria(int n){
        if (n <= 1) {
            return n;
        }else{
            return n + sumatoria(n-1);
        }
    }
    
    public static int divisionPorResta(int n, int x){
        int counter = 0;
        if (n < x) {
            //n-x es el caso base, se suma 1 para un contador
            //counter += 1;
            return counter;
        } else {
            //counter = (n-x);
            return (counter + 1)  + divisionPorResta(n-x, x);
        }
    }
    
    public static int fibonacci(){
        //Caso base: "" +(a,b),   0+1=1, 1+1=2, 1+2=3, 3+2=5, 5+3=8
    }
}
   
