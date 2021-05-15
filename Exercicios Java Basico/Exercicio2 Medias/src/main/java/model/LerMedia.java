package model;

public class LerMedia {

    Integer media1;
    Integer media2;
    Integer sMedia;
    float mMedia;
    
    public LerMedia(){
        media1 = (8 + 9 + 7) / 3;
        media2 = (4 + 5 + 6) / 3;
        sMedia = media1 + media2;
        mMedia = sMedia / (float) 2;
        
    }

    public Integer getMedia1() {
        return media1;
    }

    public Integer getMedia2() {
        return media2;
    }

    public Integer getsMedia() {
        return sMedia;
    }

    public float getmMedia() {
        return mMedia;
    }
    
    
    
}
