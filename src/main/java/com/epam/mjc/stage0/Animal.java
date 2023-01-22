package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public Animal(){

    }

    public String getDescription(){
        String str = "This animal is mostly "+color+". It has "+numberOfPaws;
        if (numberOfPaws==1) str+=" paw and ";
        else str+=" paws and ";

        if (hasFur) str+="a fur.";
        else str+="no fur.";
        return str;
    }

}
