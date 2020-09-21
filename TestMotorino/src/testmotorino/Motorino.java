package testmotorino;

public class Motorino {
    private String color, type;
    float speed;
    
    public Motorino(String coloree, String typ, float vel){
        color=coloree;
        type=typ;
        speed=vel;
}
    public void SetSpeed(float vel){
        speed=vel;
    }
    
    public float GetSpeed(){
        return speed;
    }
    
    public float Accelera(float piu){
        speed+=piu;
        return speed;
    }
    
    public float Decelera(float meno){
        speed=speed-meno;
        return speed;
    }
}
