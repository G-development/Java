import java.util.Scanner;

public class DistributoreBiglietti {
    //Dichiarazione variabili
    private String codice;
    private int nBiglietti;
    private boolean stato;
    private float costo;
    
    //Costruttori
    public DistributoreBiglietti(){
        codice=null;
        nBiglietti=0;
        stato=false;
        costo=0.0f;
    }
    public DistributoreBiglietti(String mCodice, int mNBiglietti, boolean mStato, float mCosto){
        codice=mCodice;
        nBiglietti=mNBiglietti;
        stato=mStato;
        costo=mCosto;
    }
    
    //Get e Set necessari
    public void setCodice(String x){
        codice=x;
    }
    public String getCodice(){
        return codice;
    }
    public void setBiglietti(int x){
        nBiglietti=x;
    }
    public int getBiglietti(){
        return nBiglietti;
    }
    public void setStato(boolean x){
        stato=x;
    }
    public boolean getStato(){
        return stato;
    }
    public void setCosto(){
        Scanner input= new Scanner (System.in);
        int c1;
        System.out.println("Decidere costo biglietto\n 1-1,30€\n 2-2.70€ 3-3,90€\n Default-1,00€");
        c1=input.nextInt();
        switch(c1){
            case 1:
                costo=1.30f;
                break;
            case 2:
                costo=2.70f;
                break;
            case 3:
                costo=3.90f;
                break;
            default:
                costo=1.00f;
        }
    }
    public float getCosto(){
        return costo;
    }
    
    //Visualizzazione tutti i Get
    public void visualDati(){
        getCodice();
        getBiglietti();
        getStato();
        getCosto();
    }
    
    //Metodi necessari
    public void ricarica(){
        Scanner input=new Scanner (System.in);
        System.out.println("Ricaricare il distributore?");
        int ric;
        System.out.println("1-Non ricaricare il distributore\n 2-Ricaricare il distributore");
        ric=input.nextInt();
        switch(ric){
            case 1:
                System.out.println("Non ricare il distributore");
                break;
            case 2:
                stato=false;
                System.out.println("Distributore spento");
                System.out.println("Inserire il n. di biglietti da ricaricare");
                int nuoviBiglietti;
                nuoviBiglietti=input.nextInt();
                stato=true;
                System.out.println("Distributore acceso");
                System.out.println("Numero biglietti disponibili"+getBiglietti());
                break;
            default:
                System.out.println("Il distributore è ancora con"+getBiglietti());
                break;
        }
    }
    public void vendi(int x){
        System.out.println("Quanti biglietti vuoi comprare?");
        if(x<nBiglietti){
            ricarica();
            System.out.println("Selezionare il costo del biglietto:");
            setCosto();
            float tot=x*costo;
            System.out.println("Hai comprato "+x+" biglietti al costo di "+tot+" euro");
        }else{
            System.out.println("Selezionare il costo del biglietto:");
            setCosto();
            float tot=x*costo;
            System.out.println("Hai comprato "+x+" biglietti al costo di "+tot+" euro");
            }
        
    }
}
