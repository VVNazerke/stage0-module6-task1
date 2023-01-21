package com.epam.mjc.stage0;

public class Dog extends Animal{

    public Dog(){
        super();
    }

    public Dog(String color, int numberOfPaws, boolean hasFur){
        super(color, numberOfPaws, hasFur);
    }

    @Override
    public String getDescription(){
        String str = "This animal is mostly "+getColor()+". It has "+getNumberOfPaws();
        if (getNumberOfPaws()==1) str+=" paw and ";
        else str+=" paws and ";

        if (isHasFur()) str+="a fur.";
        else str+="no fur.";
        return str;
    }


}
