/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_tipos_primitivos_2;

import java.util.Scanner;

/**
 *
 * @author EduardoArrieta
 */
public class EVA1_7_Tipos_Primitivos_2 {
    private static final Scanner input = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe tu nombre ");
        String UsNom;
        
        UsNom = input.nextLine ();
        System.out.print("ingresa tu año de nacimiento ");
        int UsAnio;
        
        UsAnio = input.nextInt();
   
       
        
        int UsTot;
        UsTot = 2018 - UsAnio;
        
        System.out.print("Tu nombre es " + UsNom);
        System.out.print(" Tu edad es " + UsTot);
        
        
        
        
        
        
      
        
        
        
    }
    
}
