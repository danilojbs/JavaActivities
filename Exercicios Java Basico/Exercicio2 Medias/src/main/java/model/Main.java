package model;


public class Main {
    
    public static void main(String[] args) {
        LerMedia lm = new LerMedia();
        
        System.out.println("\nA média dos números '8, 9 e 7' é: " + lm.getMedia1());
        System.out.println("\nA média dos números '4, 5 e 6' é: " + lm.getMedia2());
        System.out.println("\nA soma das médias é: " + lm.getsMedia());
        System.out.println("\nA média das médias é: " + lm.getmMedia());
        
    }
    
}
