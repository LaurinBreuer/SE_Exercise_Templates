package de.uni.koeln.sse.se;

public interface Visitor {

    public void visitGlass(Glass g);
    public void visitFurniture(Furniture f);
    public void visitElectronic(Electronic e);


}

