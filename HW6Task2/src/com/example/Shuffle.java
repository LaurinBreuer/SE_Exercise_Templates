package com.example;
import java.util.Random;

public class Shuffle {
    private int x;
    public Shuffle(){
        Random card = new Random();
        x = card.nextInt(100);
        x++;

    }

    public int getX(){
        return x;
    }

}

