package com;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Team{

    private List<Team> teams;

    private String name;
    private int numAthletes;
    private int numGold;


    public Composite(String name, int numA, int numG){
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

    @Override
    public void showTeamDetails() {
        for(Team t:teams){
            t.showTeamDetails();
        }
    }
}
