/* Metodo divisione div 4*/
package javaapplication3;

import java.io.*;
import java.util.Scanner;

public class JavaApplication3 {
    
    public static double divisione(double x, double y){
        double risultato=x+y;
               risultato=risultato/4;
        return risultato;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double x=divisione(a,b);
        System.out.println("Il risultato è: " + x);
    }
    
}
