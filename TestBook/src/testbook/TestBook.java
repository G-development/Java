package testbook;
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        String Titolo, Autore;
        int NumeroPag;
        float Costo1Pagina=(float) 0.5;
        
        for(int i=1; i<7; i++){
            System.out.println("Posizione n° " + i + "\nInserire Titolo:" );
            Titolo=input.nextLine();
            System.out.println("Inserire Autore:");
            Autore=input.nextLine();
            System.out.println("Inserire il numero delle pagine:"); 
            NumeroPag=input.nextInt();
            Book i = new Book(Titolo, Autore, NumeroPag);
            Book(Titolo, )
            
        }
    }
    
}
