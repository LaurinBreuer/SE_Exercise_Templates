package de.uni.koeln.sse.se;

public class PriceCalculator implements Visitor{
    private double price;

    @Override
    public void visitGlass(Glass g) {
        if(g.getTickness() == 1){
            price = 2*g.getLenght();
        }
        else if(g.getTickness() ==2){
            price = 1.2*g.getLenght();
        }
        else if(g.getTickness() == 3){
            price = 0.7*g.getLenght();
        }


    }

    @Override
    public void visitFurniture(Furniture f) {
        price = (double)(f.getWeight()/20)*5;

    }

    @Override
    public void visitElectronic(Electronic e) {
        if (e.getFragile()){
            price = (double)e.getWeight()*0.5;
        }else{
            price = e.getWeight()*(0.3333333333333);
        }
        System.out.println("should be wrapped with Polyethylene foam film and packed in a box with dimension: "+
                (e.getLenght()+1) + "x"+ (e.getWidth()+1)+"x"+ (e.getHeight()+1));

    }

    public double getPrice(HouseholdItem h){
        price = 0;
        h.accept(this);
        return price;
    }
}
