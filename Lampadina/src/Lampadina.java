import java.util.Scanner;
public class Lampadina {
    private String color;
    private int lum=10;
    private int lumMax=20;
    private boolean stato=false;
    
    public Lampadina(String col, int lmax){
        System.out.println("Sto instanziando l'oggetto lampadina:");
        color=col;
        lumMax=lmax;
        }
    
    public void getLuminosita(){
        System.out.println("La luminosità è di:"+lum);}
    
    public void luminosita(){
        Scanner input=new Scanner(System.in);
        if(!stato){
            System.out.println("La lampadina è spenta.");
            lightOn();  
            System.out.println("Ora la lampadina è accesa");
        }
        System.out.println("Vuoi aumentare o diminuire la luminosità?\n1-Aumenta, 2-Diminuisci");
        int varLum=input.nextInt();
        switch(varLum){
            case 1:
                System.out.println("Aumenta:\n La luminosità adesso è di:" + lum);
                    int aum=input.nextInt();
                    if(lum<lumMax){
                        lum+=aum;
                }else{
                        System.out.println("Non puoi aumentare: luminosità massima superata.");
                    }
            break;
            case 2:
                System.out.println("Diminiuisci:\n La luminosità adesso è di:" + lum);
                    int dim=input.nextInt();
                    if(lum>0){
                        lum=lum-dim;
                }else{
                        System.out.println("Non puoi diminuire: luminosità minima.");}
            break;
            default: 
                break;
        }}
    
    public void setColore(){
        Scanner input=new Scanner(System.in);
        System.out.println("Che colore vuoi impostare?\n1-Bianco, 2-Rosso, 3-Blu, 4-Giallo");
        int setcol=input.nextInt();
        switch(setcol){
            case 1:
                color="Bianco";
                break;
            case 2: 
                color="Rosso";
                break;
            case 3:
                color="Blu";
                break;
            case 4:
                color="Giallo";
                break;
            default:
                color="Bianco";
                break;
        }}
    
    public void getColore(){
        System.out.println("Il colore è:"+color);
    }
    
    public void lightOn(){
        if(stato==false){
            stato=true;
            System.out.println("Lampadina accesa");
        }}
    
    public void lightOff(){
        if(stato==true){
            stato=false;
            System.out.println("Lampadina spenta");
        }}
    
    public void visual(){
        System.out.println("\nColore: "+color+"\nStato: "+stato+"\nLuminosità: "+lum);
    }
}







