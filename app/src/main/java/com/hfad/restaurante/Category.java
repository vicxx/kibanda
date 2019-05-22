package com.hfad.restaurante;


public class Category {

    private String name;
    private int imageResourceId;
    public static final Category [] categories = {
            new Category ("Food", R.drawable.food),
            new Category ("Desert", R.drawable.desert),
            new Category("Drinks", R.drawable.drinks),
            new Category("Bakery", R.drawable.bakery)

    };
    private Category (String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}