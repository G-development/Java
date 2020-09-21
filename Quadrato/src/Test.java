import java.util.Scanner;

public class Test {
  public static void main(String[] args) {

  int i, maxpos=0;
  float l,p,a,maxa=0,maxp=0;

  Scanner input=new Scanner(System.in);

  for(i=1;i<=4;i++){
  System.out.println("\nInserisci lato quadrato nella posizione: " + i);
  l=input.nextFloat();
  Quadrato q= new Quadrato(l);
  System.out.println("Il lato del quadrato è:" + q.GetLato());
  p=q.Perimetro();
  System.out.println("Il perimetro del quadrato "+i+" è:"+p);
  a=q.Area();
  System.out.println("L'area del quadrato "+i+" è:"+a);
  if(a>maxa){
             maxa=a;
             maxpos=i;}
  if(p>maxp){
             maxp=p;
  }}
  System.out.println("\nArea massima: " + maxa + " nella posizione: " + maxpos);
  System.out.println("Perimetro massimo: " + maxp);
  }
}