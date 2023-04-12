package com.example.comp1008st200524201assignment2;

import javafx.scene.image.Image;

public class VideoGame {
    private String title;
    private String pathImage;
    private String developers;
    private String price;

    public VideoGame(String title, String developers, String price, String pathImage) {
        setTitle(title);
        setDevelopers(developers);
        setPrice(price);
        setPathImage(pathImage);
    }


    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public String getDevelopers() {
        return developers;
    }

    public void setAuthor(String author) {
        this.developers = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String toString()
    {
        return String.format(title, developers, price, pathImage);
    }

}
