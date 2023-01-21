package com.epam.mjc.stage0;

public class Bird extends Animal{

    public Bird(){
        super();
    }
    public Bird(String color, int numberOfPaws, boolean hasFur){
        super(color, numberOfPaws, hasFur);
    }
//This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.
    @Override // Moreover, it has 2 wings and can fly.
    public String getDescription(){
        return super.getDescription()+" Moreover, it has 2 wings and can fly.";
    }

}
