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
        //System.out.println(divisionPorResta(10, 2));
        //System.out.println(fibonacci(0, 1, 13));
        //System.out.println(decimalBinario(10));
        System.out.println(sumarDigitos(123));
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
    
    public static String fibonacci(int n, int x, int finalValor){
        //Caso base: "" +(a,b),   0+1=1, 1+1=2, 1+2=3, 3+2=5, 5+3=8
        int c = 0;
        if (n + x == finalValor) {
            return "" + finalValor;
        } else {
            c = n+x;
            return + n + "+"+ x + "=" + c + "\n" + fibonacci(x, (n + x), finalValor);
        }
    }
    
    public static String decimalBinario(int n){
        if (n == 0) {
            return ""; 
        } else {
            return decimalBinario(n/2) + (n%2);
        }
    }
    
    public static int sumarDigitos(int n){
        if (n < 1) {
            return n; 
        } else {
            return n%10 + sumarDigitos(n/10);
        }
    }
}
   
