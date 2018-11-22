/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.util.Arrays;



/**
 *
 * @author Kevin Trejos
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        char[][] prueba = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'}};
        System.out.println(getStringMatrix(prueba));
    }
    
    public static String getStringMatrix(char[][] matrix){
        return getStringMatrix(matrix, 0);
    }
    
    private static String getStringMatrix(char[][] matrix, int filas){
        int tamaño;
        String txt = "";
        tamaño = matrix.length;
        if (filas == tamaño) {
            return txt;
        } else {
            txt = " " + Arrays.toString(matrix[filas]) + "\n";
            return txt += getStringMatrix(matrix, filas+1) + "\n";
        }
    }
}
