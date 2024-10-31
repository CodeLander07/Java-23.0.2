package oop;

import java.security.PKCS12Attribute;

public class GetterAndSetters {
    public static void main(String[] args) {
        p1.setColour("blue");
        
    }
}
class Pen {
    private String colour;
    private int tip;

    String getColour() {
        return this.colour;
    }
    void setColour(String newColour) {
        this.colour = newColour;
    }
    int getTip() {
        return this.tip;
    }
    void setTip(int newTip) {
        this.tip = newTip;
    }
}