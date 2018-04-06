/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class JavaApplication {

    
     private static Scanner teclado = new Scanner(System.in);
     private static String nombre = new String();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nombre = teclado.next();
        System.out.println("holas \n" + nombre);
        
    }
    
}
