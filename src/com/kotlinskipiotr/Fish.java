package com.kotlinskipiotr;

public class Fish extends Animal
{
    private int numberOfFins;

    public Fish(String name, int yearOfBirth, TYPE type, int numberOfFins)
    {
        super(name, yearOfBirth, type);
        this.numberOfFins = numberOfFins;
    }

    //Getters
    public int getNumberOfFins()
    {
        return this.numberOfFins;
    }

    //Setter
    public void setNumberOfFins(int numberOfFins)
    {
        this.numberOfFins = numberOfFins;
    }

    @Override
    public void sound()
    {
        System.out.println("If only fish had a voice man");
    }
}
