package com.kotlinskipiotr;

public class Dog extends Animal
{
    private String furColor;

    public Dog(String name, int yearOfBirth, TYPE type, String furColor)
    {
        super(name, yearOfBirth, type);
        this.furColor = furColor;
    }

    //Getter
    public String getFurColor()
    {
        return this.furColor;
    }

    //Setter
    public void setFurColor()
    {
        this.furColor = furColor;
    }

    @Override
    public void sound()
    {
        System.out.println("Woof woof mofo");
    }
}
