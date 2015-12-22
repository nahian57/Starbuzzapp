package com.example.mohammed.starbuzzapp;

import com.example.bsubba.starbuzzapp.R;

/**
 * Created by user on 29/10/2015.
 */
public class Dr {
    //Each drink has a name, description and image resource ID.
    //The image resource ID refers to drink images
    private String name;
    private String description;
    private int imageResourceId;

    //drinks is in an array of Drinks
    public static final Dr[] dr;

    static {
        dr = new Dr[]{
                new Dr("Latte", "A couple of espresso shots with streamed milk",
                        R.drawable.latte),
                new Dr("Cappuccino", "Espresso, hot milk, and a streamed milk foam",
                        R.drawable.cappuccino),
                new Dr("Filter", "Highest quality beans roasted and brewed fresh",
                        R.drawable.filter),
        };
    }

    //each drink has a name, description and an image resource
    public Dr(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String toString() {
        return this.name;
    }
}

