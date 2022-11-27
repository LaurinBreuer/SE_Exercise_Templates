package com;

public interface Team {

    void accept(Visitor v);
    String getName();
    int getNumAthletes();
    int getNumGold();


}
