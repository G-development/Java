/* Anno bisestile o no */
package es.pkg6;

import java.util.Scanner;

public class Es6 {

    public static void main(String[] args) {
        // TODO code application logic here
	  System.out.print("Inserisci l'anno: ");
    
    Scanner input = new Scanner(System.in);
    int anno = input.nextInt();
    
    boolean divX4, divX100, divX400, bisestile;
    
    divX4=(anno % 4 == 0);
    divX100=(anno % 100 == 0);
    divX400=(anno % 400 == 0);
    bisestile=divX4&&((!divX100)||(divX400));
    if (bisestile)
      System.out.println("L'anno " + anno + " è bisestile");
    else
      System.out.println("L'anno " + anno + " NON è bisestile");
  }
}
    

