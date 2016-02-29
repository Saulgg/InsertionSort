
package Insercion;

/**
 *
 * @author Saul Garcia
 */
public class insercionTestRun {
    public static void main(String args[]){
    Insercion sortea= new Insercion();
    int[] mientero = new int[10];
        for (int i = 0; i < mientero.length; i++) {
            mientero[i] = (int) (Math.random()*50);
        }
    sortea.sort(mientero);
        for (int i = 0; i < mientero.length; i++) {
            System.out.println(mientero[i]);
        }
    }
    
}
