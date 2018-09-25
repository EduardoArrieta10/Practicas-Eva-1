/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_9_areas;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class Eva_1_9_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // TODO code application logic here
        System.out.println("Ingresa los lados del trapecio...");
        System.out.println("Paralelo a");
        double Va;
        
        Va = input.nextDouble ();
        System.out.println("Paralelo b...");
        double Vb;
        
        Vb = input.nextDouble();
        System.out.println("Ingresa la altura...");
        double Vh;
        
        Vh = input.nextDouble();
        double ara;
        
        ara = (Va + Vb) / 2 * Vh;
        System.out.print("El area del trapecio es..." + ara);
    }
    
}
