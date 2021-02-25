/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares66192;

/**
 *
 * @author acs
 */
public class NumParesImpares66192 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 1;
        int numPares = 0;
        int numImpares = 0;
        
        while (n <= 100){
            
            if (n % 2 == 0){
                numPares = n + numPares;
            }
            else {
                numImpares = n + numImpares;
            }
            n++;
        }
        
        System.out.println("La suma de los impares es: " + numImpares);
        System.out.println("La suma de los pares es: " + numPares);
        
    }
    
}
