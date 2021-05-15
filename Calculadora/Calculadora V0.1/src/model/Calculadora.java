package model;

public class Calculadora {

    private Character operador;
    private Float valor1;
    private Float valor2;

    public float resultado(){
        if(getOperador() == "+".charAt(0)){
            return getValor1() + getValor2();
        } else 
            if(getOperador() == "-".charAt(0)){
                return getValor1() - getValor2();
        } else
            if(getOperador() == "x".charAt(0)){
                return getValor1() * getValor2();
        } else 
            if(getOperador() == "/".charAt(0)){
                return getValor1() / getValor2();
        } else{
            return 0;
        }
    } 
    
    public Character getOperador(){
        return this.operador;
    }
    
    public void setOperador(Character operador){
        this.operador = operador;
    }
    public Float getValor1(){
        return this.valor1;
    }
    
    public void setValor1(Float valor1){
        this.valor1 = valor1;
    }
    
    public Float getValor2(){
        return this.valor2;
    }
    
    public void setValor2(Float valor2){
        this.valor2 = valor2;
    }
    
}
