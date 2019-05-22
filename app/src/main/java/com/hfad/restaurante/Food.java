package com.hfad.restaurante;

public class Food {

    private String name;
    private int imageResourceId;
    private String shortDescription;
    private int price;

    public static final Food[] feed = {
            new Food("Diavolo", R.drawable.diavolo, "Sweet", 1200),
            new Food("Funghi", R.drawable.funghi, "Wack", 809)
    };

    private Food(String name, int imageResourceId, String shortDescription, int price) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.shortDescription = shortDescription;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String getshortDescription(){
        return shortDescription;
    }
    public int getPrice(){
        return price;
    }
}