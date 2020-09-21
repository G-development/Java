package testmotorino;

import java.util.Scanner;

public class TestMotorino {
    public static void main(String[] args) {
        // TODO code application logic here
    String colore, tipo;
    float velocita=0, less;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Inserire tipo del motorino:");
    tipo=input.nextLine();
    System.out.println("Inserire colore del motorino:");
    colore=input.nextLine();
    System.out.println("Inserire velocità:");
    velocita=input.nextFloat();
   
    Motorino m1=new Motorino(colore,tipo,velocita);
    System.out.println("Cosa vuoi fare?\nUno per accelerare;\nDue per decelerare");
    int var=0;
    var=input.nextInt();
    switch (var){
        case 1:
            System.out.println("Accelerazione:\n Di quanto vuoi accelerare?");
            float add=input.nextFloat();
            System.out.println("Nuova velocità:");
            System.out.println(Accelera(add));
            break;
    }
    }

    private static boolean Accelera(float add) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
