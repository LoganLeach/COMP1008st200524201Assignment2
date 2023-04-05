package com.example.comp1008st200524201assignment2;

public class VideoGame {
    private String title;
    private String pathImage;
    private String author;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString()
    {
        return title + " " + author + " " + price;
    }
}
