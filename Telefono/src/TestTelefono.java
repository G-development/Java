import java.util.Scanner;

public class TestTelefono {
    
    public static void main (String[] args){
        int n=0;
        
        Scanner input=new Scanner (System.in);
        System.out.println("Quanti oggetti telefono vuoi istanziare?");
        do{
            System.out.println("1/10");
            n=input.nextInt();}
        while(n<0&&n>10);
}
}
