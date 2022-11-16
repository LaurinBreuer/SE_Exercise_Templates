package com.example;

import java.util.Scanner;

public class Player {
    BetMore_Game bet;
    boolean user_selected = false;
    private int card;
    int count;
    Game_Chair chair;

    public Player(Game_Chair chair){
        bet = new BetMore_Game();
        this.chair = chair;
    }

    public void play(){
        setCard(bet.pick_card());
        chair.setComputerX(getCard());
    }

    public void userPlay(){
        Scanner user = new Scanner(System.in);

        while (user_selected == false && count <= 4){
            count++;
            setCard(bet.pick_card());
            System.out.println("Draw number "+ count + "| Card: " + getCard() + "" );
            System.out.println("Do you want to pick a new card? Write Y for Yes or N for No");
            String ans = user.nextLine();
            if (ans.equals("Y")){

            }
            else if (ans.equals("N")){
                user_selected = true;
            }
        }
        chair.setPlayer2X(getCard());
        chair.getWinner(bet);

    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

}
