package com.kotlinskipiotr;

public class Snake extends Animal
{
    private int lenght;

    public Snake(String name, int yearOfBirth, TYPE type, int lenght)
    {
        super(name, yearOfBirth, type);
        this.lenght = lenght;
    }

    //Getters
    public int getLenght()
    {
        return this.lenght;
    }

    //Setter
    public void setLenght(int lenght)
    {
        this.lenght = lenght;
    }

    @Override
    public void sound()
    {
        System.out.println("Sssssssszkurcze");
    }
}
