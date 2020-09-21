import java.util.Scanner;

public class TestDistributore {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        String code;
        int ticket;
        boolean state;
        float cost;
        
        code=input.nextLine();
        ticket=input.nextInt();
        state=input.nextBoolean();
        cost=input.nextFloat();
        
        DistributoreBiglietti d1= new DistributoreBiglietti(code,ticket,state,cost);
        DistributoreBiglietti d2= new DistributoreBiglietti();
        
        d1.visualDati();
        d2.visualDati();
        
        String mod;
        mod=input.nextLine();
        d2.setCodice(mod);
        
        int mod1;
        mod1=input.nextInt();
        d2.setBiglietti(mod1);
        
        boolean mod2;
        mod2=input.nextBoolean();
        d2.setStato(mod2);
        
        d2.setCosto();
        
        System.out.println("Codice distributore con più biglietti");
        if(d1.getBiglietti()>d2.getBiglietti()){
            System.out.println(d1.getCodice());
        }else{
            System.out.println(d2.getCodice());
        }
        
    if(d1.getBiglietti()<=0){
        d1.ricarica();}
    
    if(d2.getBiglietti()>=40){
        int sell;
        sell=input.nextInt();
        d2.vendi(sell);
    }
    }
    
}
