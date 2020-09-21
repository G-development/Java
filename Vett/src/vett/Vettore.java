package vett;
import java.util.Scanner;

public class Vettore {
     Scanner input = new Scanner (System.in);
     private int x;
     
     public Vettore(int x){
         this.x=x;
     }
     
    public void dimensione(int x){
        System.out.println("Quanti oggetti vuoi instanziare? (1-10)");
        do{x=input.nextInt();}
        while(x<0&&x>10);
}
    public void carica(int v[], int x){
        for(int i=0; i<x; i++){
            v[i]=input.nextInt();
        }
    }
}
