package com;

public class Visitor {

    public void visit(Leaf l){
        System.out.println(("Team: " + l.getName() + ", Number of Athletes: " + l.getNumAthletes() +
                ", Number of Gold Medals: " + l.getNumGold()));
    }

    public void visit(Composite c){
        System.out.println("Team: " + c.getName() + ", Number of Athletes: " + c.getNumAthletes() +
                ", Number of Gold Medals: " + c.getNumGold());
    }
}
