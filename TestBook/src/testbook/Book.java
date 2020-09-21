package testbook;
public class Book {
    private String tit, aut;
    private int NumPag;
    private float CostoPag=(float) 0.5;
    
    public Book (String x, String y, int z){
        tit=x;
        aut=y;
        NumPag=z;}
    
    public void SetTitolo(String x){
        tit=x;}
    public String GetTitolo(){
        return tit;}
    
    public void SetAutore(String y){
        aut=y;}
    public String GetAutore(){
        return aut;}
    
    public void SetNumPag(int z){
        NumPag=z;}
    public int GetNumPag(){
        return NumPag;}
    
    public float Costo(int xy){
        float CostoTot;
        CostoTot=xy*CostoPag;
        CostoTot+=10.00;
        return CostoTot;}
    
    public void Visual(){
        System.out.println(GetTitolo() + GetAutore() + GetNumPag());
    }
}
