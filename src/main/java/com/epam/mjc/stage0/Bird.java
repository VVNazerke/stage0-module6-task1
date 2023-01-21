package com.epam.mjc.stage0;

public class Bird extends Animal{

    public Bird(){
        super();
    }
    public Bird(String color, int numberOfPaws, boolean hasFur){
        super(color, numberOfPaws, hasFur);
    }

    @Override // Moreover, it has 2 wings and can fly.
    public String getDescription(){
        String str = "This animal is mostly "+getColor()+". It has "+getNumberOfPaws()+" paws and ";
        if (isHasFur()) str+="a fur.";
        else str+="no fur.";
        return str;
    }

}
