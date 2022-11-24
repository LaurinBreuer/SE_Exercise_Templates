package de.uni.koeln.sse.se;

public class PriceCalculator implements Visitor{
    private double price;
    private String inst;

    @Override
    public void visitGlass(Glass g) {
        if(g.getTickness() == 1){
            price = 0.02*g.getLenght();
        }
        else if(g.getTickness() ==2){
            price = 0.012*g.getLenght();
        }
        else if(g.getTickness() == 3){
            price = 0.07*g.getLenght();
        }
        inst = ("should be wrapped with Bubble wraps and packed in a box with dimension: " +
                (g.getHeight()+1) + "x"+(g.getLenght()+1) + "x"+  (g.getWidth()+1));


    }

    @Override
    public void visitFurniture(Furniture f) {
        price = (double)(f.getWeight()*0.25);
        inst = "should be covered with waterproof covers with area of:" + f.getLenght() + "x" + f.getWidth();
    }

    @Override
    public void visitElectronic(Electronic e) {
        if (e.getFragile()){
            price = (double)e.getWeight()*0.5;
        }else{
            price = e.getWeight()*(0.3333333333333333333333333);
        }
        inst = ("should be wrapped with Polyethylene foam film and packed in a box with dimension: "+
                (e.getHeight()+1) + "x"+(e.getLenght()+1) + "x"+  (e.getWidth()+1));

    }

    public double getPrice(HouseholdItem h){
        price = 0;
        h.accept(this);
        return price;
    }

    public String getInstructions(HouseholdItem h){
        h.accept(this);
        return inst;
    }
}
