package de.uni.koeln.sse.se;

public class Main {
    public static void main(String[] args){
        PriceCalculator p = new PriceCalculator();
        Electronic tv = new Electronic("TV", 15, 122, 74, 18, true);
        Electronic oven = new Electronic("Microwave Oven", 27,37,48, 13, false);
        System.out.println("Total Cost for TV is: " + p.getPrice(tv));
        System.out.println("Total Cost for Microwave Oven is: " + p.getPrice(oven));

    }

}
