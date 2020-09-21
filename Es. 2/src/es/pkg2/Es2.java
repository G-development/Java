/*Input due numeri div 2 */

package es.pkg2;
import java.util.Scanner;
public class Es2 {
     
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner (System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double risultato=a/b;
        System.out.println("Il risultato è: " + risultato);
        }
}