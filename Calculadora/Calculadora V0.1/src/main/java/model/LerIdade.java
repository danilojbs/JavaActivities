package model;

public class LerIdade {

    int anos;
    int meses;
    int dias;
    
    public LerIdade(int aAnos, int aMeses, int aDias){
        anos = aAnos;
        meses = aMeses;
        dias = aDias;
        
        System.out.println("Você tem " + converterDias() +  " dias de vida.");
    }
    
    public int converterDias(){
        int res = 0;
        
        if(anos > 0){
            res += (anos * 365);
        }
        
        if(meses > 0){
            res += (meses * 30);
        }
        
        if(dias > 0){
            res += dias;
        }
        
        return res;
    }
    
}
