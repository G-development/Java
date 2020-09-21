/* Scrivere un programma che dica se tre numeri sono uguali*/

package es.pkg1.java;
import java.util.Scanner;
public class Es1Java {

    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int A=input.nextInt();
        int B=input.nextInt();
        int C=input.nextInt();
        if ((A==B)&&(B==C)){
            System.out.println("Uguali");
        }else{
            System.out.println("Diversi");
        }
}}
