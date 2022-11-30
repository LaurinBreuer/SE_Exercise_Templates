package com;

public class Main {

    public static void main(String[] args) {
        Composite olympics = new Composite("Olympics Teams", 1000,40);

        Composite as = new Composite("Asia Team", 250,10);
        Composite a1= new Composite ("China Team", 100, 6);
        Composite a2 = new Composite ("Women's Team", 19, 2);
        Composite a3 = new Composite ("Men's Team", 81, 4);
        Leaf a4 = new Leaf ("Women's Teakwondo Team", 4, 1);
        Leaf a5 = new Leaf ("Women's Waterpolo Team", 19, 2);
        Leaf a6 = new Leaf ("Women's Artistic Gymnastics Team", 19, 2);
        Leaf a7 = new Leaf ("Afghanistan Team", 19, 2);
        Leaf a8 = new Leaf ("Men's Shooting Team", 81, 4);

        Leaf africa = new Leaf ("Africa Team", 250, 10);

        Composite eu = new Composite("Europe Team", 250, 10);
        Composite ger = new Composite("Germany Team", 125, 8);
        Composite g1 = new Composite("Women's Team", 50, 2);
        Composite g2 = new Composite("Men's Team", 75, 6);
        Leaf g4 = new Leaf ("Women's Cycling Team", 25, 1);
        Leaf g5 = new Leaf ("Women's Waterpolo Team", 25, 2);
        Leaf g6 = new Leaf ("Men's Table Tennis Team", 50, 2);
        Leaf g7 = new Leaf ("Men's Football Team", 25, 1);

        Leaf l1 = new Leaf ("South America Team", 250, 10);

        olympics.addTeam(africa);
        olympics.addTeam(l1 );
        olympics.addTeam(as);
        olympics.addTeam(eu );

        as.addTeam(a1);
        as.addTeam(a7);
        a1.addTeam(a2);
        a1.addTeam(a3);
        a2.addTeam(a4);
        a2.addTeam(a5);
        a2.addTeam(a6);
        a3.addTeam(a8);

        eu.addTeam(ger);
        ger.addTeam(g1);
        ger.addTeam(g2);
        g1.addTeam(g4);
        g1.addTeam(g5);
        g2.addTeam(g6);
        g2.addTeam(g7);

        Visitor v= new Visitor();
        g2.accept(v); //Germany Men's Team
        ger.accept(v); //Germany Team
        as.accept(v); //Asia Team
        olympics.accept(v); //Olympics Team




    }
}
