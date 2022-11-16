package com.example;

public class Game_Chair {

    Player computer;
    Player player_2;
    private int computerX;
    private int player2X;
    public Game_Chair(){

    }

    public void start(){
        computer.play();
    }

    public void startUser(){
        player_2.userPlay();
    }

    public int getComputerX() {
        return computerX;
    }

    public void setComputerX(int computerX) {
        this.computerX = computerX;
    }

    public int getPlayer2X() {
        return player2X;
    }

    public void setPlayer2X(int player2X) {
        this.player2X = player2X;
    }

    public void getWinner(BetMore_Game bet){
        int w = bet.findWinner(getComputerX(), getPlayer2X());
        System.out.println("Computers card: " + getComputerX() + " Your card: " + getPlayer2X());
        if (w == 1){
            System.out.println("The computer won.");
        }else if (w==2){
            System.out.println("It's a draw.");
        }else{
            System.out.println("You have won the game");
        }

    }
}
