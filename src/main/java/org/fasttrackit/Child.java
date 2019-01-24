package org.fasttrackit;

public class Child extends People {

    private int levelOfMood;
    private int healthCondition;
    private String favoriteGame;
    private int feelingHungry;

    public Food food;
    public Play play;

    public Child(Food food){
        this.food = food;
    }
    public Child(Play play){
        this.play = play;
    }

    public void mood(){
        System.out.println("The child is happy.");
    }

    @Override
    public void feed(String baby, String food) {
        super.feed(baby, food);
        feelingHungry--;
        System.out.println("Now the level of mood is: " + feelingHungry);
    }

    @Override
    public void playing(String baby, String play) {
        super.playing(baby, play);
        levelOfMood++;
        System.out.println("Now the level of mood is: " + levelOfMood);
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

    public int getFeelingHungry() {
        return feelingHungry;
    }

    public void setFeelingHungry(int feelingHungry) {
        this.feelingHungry = feelingHungry;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }


    @Override
    public String toString() {
        return "Child{" +
                "levelOfMood=" + levelOfMood +
                ", healthCondition=" + healthCondition +
                ", favoriteGame='" + favoriteGame + '\'' +
                ", food=" + food +
                ", play=" + play +
                '}';
    }
}

