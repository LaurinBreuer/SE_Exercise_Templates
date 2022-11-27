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

    public String getName() {
        return name;
    }

    public int getNumAthletes() {
        return numAthletes;
    }

    public int getNumGold() {
        return numGold;
    }

    public void accept(Visitor v){
        v.visit(this);
    }
}
