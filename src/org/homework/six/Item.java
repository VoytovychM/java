package org.homework.six;

public class Item {
    private String name;
    private double price;
    private int rating;

    public Item(String name, double price, int rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

}
