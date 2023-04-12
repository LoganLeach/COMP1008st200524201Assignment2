package com.example.comp1008st200524201assignment2;

import static org.junit.Assert.*;

public class VideoGameTest {
    private VideoGame game;

    @org.junit.Before
    public void setUp() throws Exception {
        VideoGame Cod = new VideoGame("Title: Call Of Duty 4", "Devs: Treyarch","Price: 79.99","images/call_of_duty.png");
        VideoGame Bo2 = new VideoGame("Title: Black Ops 2","Devs: Activision", "Price: 89.99","images/duty_of_call.png");
        VideoGame Mw2 = new VideoGame("Title: Modern Warfare 2", "Devs: Treyarch", "Price: 99.99","images/call_of_game.png");
    }

    @org.junit.Test
    public void setDevelopers() {

    }

    @org.junit.Test
    public void setTitle() {
    }

    @org.junit.Test
    public void setPathImage() {
    }

    @org.junit.Test
    public void setAuthor() {
    }

    @org.junit.Test
    public void setPrice() {
    }
}