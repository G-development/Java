package javaapplication11;

import java.util.Scanner;

public class TestCC{

    public static void main(String[] args) {
    float imp;
    int scelta;
    Scanner input = new Scanner (System.in);
    String nome, numeroconto;
    System.out.println("Inserisci il nome:");
    nome= input.next();
    numeroconto= input.next();
    CC conto = new CC(nome, numeroconto);
    do{System.out.println("Inserire:/n 1- Prelievo;/n 2- Versamento;/n 3- Stampa;/n 4- Esci;/n");
    scelta=input.nextInt();
    switch(scelta){
        case 1:
            System.out.println("Inserisci importo da prelevare:");
            imp= input.nextFloat();
            if(conto.prelievo(imp)!=0)
                System.out.println("Saldo inferiore alla cifra richiesta/n" + conto.getSaldo());
            break;
        case 2: 
            System.out.println("Inserisci importo da versare");
            imp= input.nextFloat();
            conto.versamento(imp);
            break;
        case 3:
            System.out.println("Nome:" + conto.getCorrentista() + "Numero:" + conto.getNc() + "Saldo:" + conto.getSaldo());
            break;
    }
    while(scelta!=0)
            }
    }}}