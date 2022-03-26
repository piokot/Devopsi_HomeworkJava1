package com.kotlinskipiotr;

import java.util.Objects;

public class Animal implements Speakable
{
    private String name;
    private int yearOfBirth;

    private TYPE type;
    enum TYPE {REPTILE, AMPHIBIAN, MAMMAL};

    private static final int CURRENT_YEAR = 2022;

    public Animal(String name, int yearOfBirth, TYPE type)
    {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.type = type;
    }

    //Getters
    public int getYearOfBirth()
    {
        return this.yearOfBirth;
    }

    public String getName()
    {
        return this.name;
    }

    public TYPE getType() {
        return type;
    }

    //Setters
    public void setYearOfBirth(int yearOfBirth)
    {
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setType(TYPE type)
    {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return this.yearOfBirth == animal.yearOfBirth && this.getName().equals(animal.getName()) && this.type.equals(animal.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, getName(), type);
    }

    @Override
    public String toString() {
        return
                "Animal :["
                        + "name: " + getName()
                        + " born: " + getYearOfBirth()
                        + " specie: " + getType()
                + " ]";
    }

    @Override
    public void sound()
    {
        System.out.println("Default animal sound");
    }

    public int howOld()
    {
        return Math.abs(this.yearOfBirth - CURRENT_YEAR);
    }
}
