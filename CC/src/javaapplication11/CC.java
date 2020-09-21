package javaapplication11;
import java.util.Scanner;

public class CC{
    private String correntista;
    private String nc;
    private float saldo;
    
public CC (String nomeCorrentista, String numeroConto){
    correntista= nomeCorrentista;
    nc= numeroConto;
    saldo=0;
}

public String getCorrentista(){
    return correntista;
}

public String getNc(){
    return nc;
}

public float getSaldo(){
    return saldo;
}

public int prelievo(float s){
    int eseguito=0;
    if(saldo>0)saldo=-s;
    else eseguito=1;
    return eseguito;
}

public void versamento(float s){
    saldo=+s;
}
}
