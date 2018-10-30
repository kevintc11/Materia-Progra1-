/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionmatrixexamen;

/**
 *
 * @author usuario
 */
public class SolucionMatrixExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrix1 = {{1,5,9},{2,6,10},{3,7,11},{4,8,12}};
        int[][] matrix2 = {{10,20,30,40},{50,60,70,80},{90,100,110,120}};
        int[] vector = new int[matrix1.length];
        int suma = 0;
        for (int c = 0; c < matrix1[0].length; c++) {
            suma = 0;
            for (int f = 0; f < matrix1.length; f++) {
                suma += matrix1[f][c] * matrix2[c][f];
                vector[c] = suma;
            }
            System.out.println(vector[c]);
        }
    } 
}
