/* Bool  +
-9*8/120+3.0
12/789+456-123-*+687-*347+-*982+6*/

package es.pkg5;

import java.io.*;
import java.util.Scanner;

public class Es5 {

    public static boolean pari(int n){
        Scanner input=new Scanner(System.in);
        boolean pos=true;
        for(int i=0; i<n; i++){
            System.out.println("Inserire numero");
            int num=input.nextInt();
            if((num<0)||(num%2!=0)){
               pos=false;}}
               return pos;
        }
 
        public static void main (String[] args){
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int numeri=input.nextInt();
        if(pari(numeri)){
            System.out.println("Tutti pos e pari");
        }else{
            System.out.println("No");
        }
    }
    
}
