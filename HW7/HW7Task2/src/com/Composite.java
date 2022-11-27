package com;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Team{

    private List<Team> teams;
    private int numAthletes;
    private int numGold;
    private String name;


    public Composite(String name,  int numA, int numG ){
        this.name = name;
        this.numAthletes = numA;
        this.numGold = numG;
        this.teams = new ArrayList<>();
    }

    public void addTeam(Team t){
        teams.add(t);
    }

    public void removeTeam(Team t){
        teams.remove(t);
    }

    public String getName() {
        return name;
    }

    @Override
    public int getNumAthletes() {
        return numAthletes;
    }

    @Override
    public int getNumGold() {
        return numGold;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
        for(Team t:teams){
            t.accept(v);
        }

    }


}
