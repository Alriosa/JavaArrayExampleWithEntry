/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrayexamplewithentry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 *
 * @author Alriosa
 */
public class JavaArrayExampleWithEntry {

    /**
     * @param args the command line arguments
     */
    
    static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream print = System.out;
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        String[] studentList =  new String[4];
        
        for(int i=0 ; i < studentList.length; i++){
        
            System.out.println("Ingrese en la posicion " + i + " un nombre") ;
            studentList[i] = read.readLine();
            
        }
        
        for(int cont=0 ; cont < studentList.length; cont++){
        
            System.out.println("El nombre de la posicion " + cont + " es: " + studentList[cont]);
            
            
        }
        
    }
    
}
