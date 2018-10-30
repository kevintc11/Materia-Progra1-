
package matrices;

/**
 *
 * @author Hansy Gonzalez
 */
public class MatricesMain {


    public static void main(String[] args) {
        int[][] intMatrix1 = {{1,0},{0,2}};
        int[][] intMatrix2 = {{5,6},{9,10}};
int []resultadoVector = DiagonalClmnMultiplier.multiply(intMatrix1, intMatrix2);
DiagonalClmnMultiplier.imprimir(resultadoVector);
    }
    
}
 