import java.util.Scanner;
public class ProvaLampadina {
    String colore="Bianco";
    int lumimax=20, lumi; 
    
    public static void main (String []args){
       Scanner input= new Scanner (System.in);
       
       int n;
       System.out.println("Quanti oggetti vuoi instanziare?");
       do{n=input.nextInt();}
        while(n<0&&n>10);
       
       Lampadina lamps[] = new Lampadina[n];

       for(int i=0; i<n; i++){
        lamps[i] = new Lampadina("Bianco",20);
        System.out.println("1-Accendi, 2-Spegni.");
        int as=input.nextInt();
        switch(as){
            case 1:
                lamps[i].lightOn();
                break;
            case 2:
                lamps[i].lightOff();
                break;
            default:
                lamps[i].lightOff();}
        lamps[i].luminosita();
        lamps[i].getLuminosita();
        lamps[i].setColore();
        lamps[i].getColore();
        lamps[i].visual();}
    
    }}


