

package Insercion;

/**
 *
 * @author Saul Garcia
 */
public class Insercion {
    private int[] sorted;
    public int[] sort(int[] array){
        int anterior;
        int actual;
        for (int i = 1; i < array.length; i++) {
            actual = array[i];
            anterior = i - 1;
            while(((anterior) >=0) && (actual<array[anterior])){
                array[anterior + 1] = array[anterior];
                anterior--;
            }
            array[anterior+1] = actual;
        }
        sorted=array;
        return sorted;
    }
}
