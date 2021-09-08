package com.nitincodes;

public class Main {
    static
    {
        System.out.println("Static block 1");
    }

    public static void main(String[] args) {
        System.out.println("Main method invokation");
    }
    static
    {
        System.out.println("Static block 2");
    }

}


// if you will run this code you'll notice that the output is:
//Static block 1
//Static block 2
//Main method invokation

//so that's the property of static block, it calls before the main method that's why both the static block
//get prints first and main method after that.