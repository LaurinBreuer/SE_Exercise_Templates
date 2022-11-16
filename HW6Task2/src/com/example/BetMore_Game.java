package com.example;

public class BetMore_Game {
    public BetMore_Game(){

    }

    public int pick_card(){
        Shuffle s = new Shuffle();
        return s.getX();
    }

    public int findWinner(int comp, int p2){
        if (comp > p2){
            return 1;
        }
        if (comp == p2){
            return 2;
        }else{
            return 3;
        }
    }
}
