package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        myRand();
    }

    public static void myRand() {
        Random rand = new Random();
        int numb = 0;
        while(numb != 6){
            numb = rand.nextInt(6)+1;
            System.out.println(numb);
        }
    }
}
