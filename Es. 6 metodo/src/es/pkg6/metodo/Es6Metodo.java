/* Anno bisestile o no metodo */
package es.pkg6.metodo;
import java.util.Scanner;
public class Es6Metodo {

    public static boolean annofunz(int anno){
    boolean bisest;
    System.out.print("Inserisci l'anno: ");
    Scanner input = new Scanner(System.in);
    anno = input.nextInt();
    boolean divX4, divX100, divX400;
    divX4=(anno % 4 == 0);
    divX100=(anno % 100 == 0);
    divX400=(anno % 400 == 0);
    bisest=divX4&&((!divX100)||(divX400));
    return bisest;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean bisestile;
        int year = 0;
        bisestile=annofunz(year);
        if (bisestile)
            System.out.println("L'anno " + year + " è bisestile");
        else
            System.out.println("L'anno " + year + " NON è bisestile");
    }
    
}
