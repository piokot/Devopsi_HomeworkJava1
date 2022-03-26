package com.kotlinskipiotr;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args)
    {

        System.out.println("-------1--------");

        int val_integer = 250;
        String val_string = "Akademia jest super!";
        double val_double = 1.23455d;

        System.out.println("Zmienna val_integer ma wartosc " + val_integer );
        System.out.println("Zmienna val_string ma wartosc " + val_string );
        System.out.println("Zmienna val_double ma wartosc " + val_double );

        System.out.println();
        System.out.println("-------2--------");
        int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        iterArrV1(myArr);
        iterArrV2(myArr);
        iterArrV3(myArr);

        System.out.println();
        System.out.println("-------3--------");
        sumFromOne(500);

        System.out.println();
        System.out.println("-------4--------");
        grade(myArr);

        System.out.println();
        System.out.println("-------5--------");
        double[] doubleToTest = {-1d, 23d, -4d, -5d, 3d, -22d};
        System.out.println(Arrays.toString(doubleToAbs(doubleToTest)));

        System.out.println();
        System.out.println("-------6--------");
        checkSurnameGender("Kowalska");
        checkSurnameGender("Górny");
        checkSurnameGenderV2("Kowalska");
        checkSurnameGenderV2("Górny");

        System.out.println();
        System.out.println("-------7--------");
        Animal frog = new Animal("frog", 1995, Animal.TYPE.AMPHIBIAN);
        Animal lion = new Animal("lion", 1999, Animal.TYPE.MAMMAL);
        System.out.println(frog.getType());
        System.out.println(frog.howOld());

        List<Animal> animals = new ArrayList<>();
        Zoo testoweZoo = new Zoo("test", 1950, animals );
        System.out.println(testoweZoo.toString());
        testoweZoo.animals.add(frog);
        testoweZoo.animals.add(lion);
        System.out.println(testoweZoo.toString());
        testoweZoo.showAnimals();
        int animalsNumber = testoweZoo.countAnimals();
        System.out.println(animalsNumber);
        double animalsAvgAge = testoweZoo.avgAge();
        System.out.println(animalsAvgAge);
        testoweZoo.showInfoAboutZoo();

        System.out.println("---------->");
        System.out.println(testoweZoo.getAnimals());

        System.out.println();
        System.out.println("-------8--------");
        Dog ratlerr = new Dog("Fido", 1992, Animal.TYPE.MAMMAL, "brown");
        Snake python = new Snake("Marcin", 1999, Animal.TYPE.REPTILE, 10);
        Fish koiCarp = new Fish("Janina", 2005, Animal.TYPE.AMPHIBIAN, 8);

        List<Animal> talkingAnimals = new ArrayList<>();
        talkingAnimals.add(ratlerr);
        talkingAnimals.add(python);
        talkingAnimals.add(koiCarp);

        makeAnimalsSpeak(talkingAnimals);

        System.out.println();
        System.out.println("-------9--------");

        int[] numbs = {-1, 2, 50, 100};

        Numbers myNumbers = new Numbers(numbs);

        Lambda1 lambda1 = (int[] numbers)->
        {
            int result = 0;
            for(int i:numbers)
            {
                result += i;
            }
            return result;
        };

        System.out.println(myNumbers.add(lambda1));

        Lambda2 lambda2 = (int[] numbers)->
        {
            int result = 0;
            for(int i: numbers)
            {
                result += i;
            }

            return result / numbers.length;
        };

        System.out.println(myNumbers.avg(lambda2));

        Lambda3 lambda3 = (int[] numbers)->
        {
            for(int i: numbers)
            {
                System.out.println(i);
            }
        };

        myNumbers.show(lambda3);

        System.out.println();
        System.out.println("-------10--------");
        convertAnimalsToTxt(testoweZoo);
    }

    public static void iterArrV1(int[] myArr)
    {
        for(int i: myArr)
        {
            String print = "";
            print += i % 2 == 0 ? "Liczba " + i + " jest parzysta": i;
            System.out.println(print);
        }
    }

    public static void iterArrV2(int[] myArr)
    {
        for(int i = 1; i < myArr.length + 1; i++)
        {
            String print = "";
            print += i % 2 == 0 ? "Liczba " + i + " jest parzysta": i;
            System.out.println(print);
        }
    }

    public static void iterArrV3(int[] myArr)
    {
        int i = 0;

        while(i < myArr.length )
        {
            i++;
            String print = "";
            print += i % 2 == 0 ? "Liczba " + Math.abs(i) + " jest parzysta": Math.abs(i);
            System.out.println(print);
        }
    }

    //------------------------- 3 ------------------------------
    public static void sumFromOne(int i)
    {
        int sum = 0;
        while( i > 0)
        {
            sum += i;
            i--;
        }
        System.out.println(sum);
    }
    //------------------------- 4 ------------------------------
    public static void grade(int[] i)
    {
        int result = 0;

        for(int myInt: i)
        {
            result+=myInt;
        }

        result = result / i.length;

        String grade = "";

        if(result >= 4)
        {
            grade = "A! Super";
        }
        else if(result >=3 && result < 4) //Can be just == 3, since we are using int, so no .
        {
            grade = "B. Ok";
        }
        else if( result < 3)
        {
            grade = "C. Not very good";
        }
        else
        {
            grade = "Something went wrong";
        }
        System.out.println(grade);
    }
    //------------------------- 5 ------------------------------
    public static double[] doubleToAbs(double[] myDouble)
    {

        for(int i = 0; i < myDouble.length; i++)
        {
            myDouble[i] = Math.abs(myDouble[i]);
        }

        return myDouble;
    }

    //------------------------- 6 ------------------------------
    public static void checkSurnameGender(String surname)
    {
        if(
                surname.endsWith("ska") ||
                surname.endsWith("cka") ||
                surname.endsWith("dzka") ||
                surname.endsWith("ewa") ||
                surname.endsWith("ówna") ||
                surname.endsWith("a")
        )
        {
            System.out.println(GenderEnum.WOMAN);
        }
        else
        {
            System.out.println(GenderEnum.MAN);
        }
    }

    public static void checkSurnameGenderV2(String surname)
    {
        // extracting three last chars from string
        String threeLastLetters = surname.length() > 3 ? surname.substring(surname.length() - 3) : surname;
        if(
                threeLastLetters.equals("ska") ||
                threeLastLetters.equals("cka") ||
                threeLastLetters.equals("dzka") ||
                threeLastLetters.equals("ewa") ||
                threeLastLetters.equals("ówna") ||
                threeLastLetters.equals("a")
        )
        {
            System.out.println(GenderEnum.WOMAN);
        }
        else
        {
            System.out.println(GenderEnum.MAN);
        }
    }
    //------------------------- 8 ------------------------------
    public static void makeAnimalsSpeak(List<Animal> animalList)
    {
        for(Animal animal: animalList)
        {
            animal.sound();
        }
    }
    //------------------------- Dla chetnych ------------------------------
    public static void convertAnimalsToTxt(Zoo zoo)
    {
        boolean result = true;
        File file = new File("C:\\Learning");
        file.mkdir();
        file = new File("C:\\Learning\\animals.txt");

        //If file exists - it is being read
        //If file doesnt exist - it will be created and animals from the zoo are written into it

        try
        {

            BufferedReader bufferedReader = new BufferedReader( new FileReader(file));
            String readedFile;
            while((readedFile = bufferedReader.readLine()) != null)
            {
                System.out.println(readedFile);
            }
        }
        catch (Exception e)
        {
            if(e instanceof FileNotFoundException)
            {
                try
                {
                    result = file.createNewFile();
                    if(result) System.out.println("File created: " + file.getCanonicalPath());
                }
                catch (Exception cantCreate)
                {
                    System.out.println(cantCreate);
                }
                finally
                {
                    try
                    {
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                        for(Animal animal: zoo.getAnimals())
                        {
                            bufferedWriter.write(animal.getName());
                            bufferedWriter.write("\n");
                        }
                        bufferedWriter.close();
                    }
                    catch (Exception exception)
                    {
                        System.out.println(exception);
                    }
                }
            }
        }
        finally
        {
            System.out.println("Finished");
        }
    }
}
