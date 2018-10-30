package matrices;



/**
 *
 * @author Hansy Gonzalez
 */
public class DiagonalClmnMultiplier {

    public static int[] multiply(int[][] intMatrix1, int[][] intMatrix2) {
        //retornar un vector
        int[] vector = new int[intMatrix2.length];
        //recorrer las flas de la matriz
        //recorrer las columnas de la matriz
        for (int i = 0; i < intMatrix1.length; i++) {
            int operacion = 0;
            for (int j = 0; j < intMatrix1.length; j++) {
                //multiplicar de columnas
                operacion += intMatrix1[j][j] * intMatrix1[j][i];
            }
            vector[i] = operacion;
        }

        //Contador que guarde el resultado de cada multiplicacion
        return vector;
    }

    public static void imprimir(int[] vector) {
        for (int i : vector) {
            System.out.println("{"+i+"}");
        }

    }
}


