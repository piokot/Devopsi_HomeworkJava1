package com.kotlinskipiotr;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Zoo
{
    private String name;
    private int yearOfEstablishment;
    List<Animal> animals;

    public Zoo(String name, int yearOfEstablishment, List<Animal> animals)
    {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.animals = animals;
    }

    //Getters
    public String getName()
    {
        return this.name;
    }

    public int getYearOfEstablishment()
    {
        return this.yearOfEstablishment;
    }

    public List<Animal> getAnimals()
    {
        return this.animals;
    }

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setYearOfEstablishment(int yearOfEstablishment)
    {
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public void setAnimals(List<Animal> animals)
    {
        this.animals = animals;
    }

    //Methods


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return yearOfEstablishment == zoo.yearOfEstablishment && Objects.equals(name, zoo.name) && Objects.equals(animals, zoo.animals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfEstablishment, animals);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name=' " + name + '\'' +
                ", yearOfEstablishment= " + yearOfEstablishment +
                ", animals= " + animals +
                '}';
    }

    public void addAnimals(Animal animal)
    {
        this.animals.add(animal);
    }

    public void showAnimals()
    {
        System.out.println(this.animals.toString());
    }

    public int countAnimals()
    {
        int animalsCount = 0;
        for(Animal animal: this.animals)
        {
            animalsCount++;
        }
        return animalsCount;
    }

    public double avgAge()
    {
        double age = 0d;

        for(Animal animal: this.animals)
        {
            age += animal.howOld();
        }

        return age / this.countAnimals();
    }

    public void showInfoAboutZoo()
    {
        System.out.println
        (
                "Zoo name: " + this.getName()
                + "; date of creation: " + this.getYearOfEstablishment()
                + "; averange animals age: " + this.avgAge()
                + "; number of animals: " + this.countAnimals()
                + "; animals: " + this.getAnimals()
        );
    }
}
