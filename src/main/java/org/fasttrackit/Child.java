package org.fasttrackit;

public class Child extends People {

    public int levelOfMood;
    public int healthCondition;
    public boolean isCrying;
    public String favoriteGame;
    public Food food;
    public Play play;

    public Child(Food food){
        this.food = food;
    }
    public Child(Play play){
        this.play =play;
    }
}

