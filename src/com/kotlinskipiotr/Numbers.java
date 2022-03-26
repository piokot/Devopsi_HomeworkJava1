package com.kotlinskipiotr;

public class Numbers
{
    private int[] numbers;

    public Numbers(int[] numbers)
    {
        this.numbers = numbers;
    }

    //Getters
    public int[] getNumbers()
    {
        return this.numbers;
    }

    //Setter
    public void setNumbers(int[] numbers)
    {
        this.numbers = numbers;
    }

    public int add(Lambda1 lambda1)
    {
        return lambda1.add(numbers);
    }

    public int avg(Lambda2 lambda2)
    {
        return lambda2.avg(numbers);
    }

    public void show(Lambda3 lambda3)
    {
        lambda3.show(numbers);
    }
}
