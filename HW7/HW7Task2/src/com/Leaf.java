package com;

public class Leaf implements Team{


    private String name;
    private int numAthletes;
    private int numGold;

    public Leaf(String name, int numA, int numG) {
        this.name = name;
        this.numAthletes = numA;
        this.numGold = numG;
    }

    @Override
    public void showTeamDetails() {
        System.out.println("Team: " + this.getName() + " Number of Athletes: " + getNumAthletes() +
                " Number of Gold Medals: " + getNumGold());

    }

    public String getName() {
        return name;
    }

    public int getNumAthletes() {
        return numAthletes;
    }

    public int getNumGold() {
        return numGold;
    }
}
