package org.fasttrackit;

public class Child extends People {

    private int levelOfMood;
    private int healthCondition;
    private String favoriteGame;

    public Food food;
    public Play play;

    public Child(Food food){
        this.food = food;
    }
    public Child(Play play){
        this.play = play;
    }

    public int getLevelOfMood() {
        return levelOfMood;
    }

    public void setLevelOfMood(int levelOfMood) {
        this.levelOfMood = levelOfMood;
    }

    public int getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(int healthCondition) {
        this.healthCondition = healthCondition;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }


}

