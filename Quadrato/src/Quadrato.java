  public class Quadrato{
  private float lato;
  public Quadrato (float mlato){
        lato=mlato;
  }
  public float GetLato(){
        return lato;
  }
  public float Perimetro(){
        return (lato*4);
  }
  public float Area(){
        return (lato*lato);
  }
}

