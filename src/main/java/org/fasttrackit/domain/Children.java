package org.fasttrackit.domain;

public class Children {

    private long id;
    private int levelOfMood;
    private int healthCondition;
    private String favoriteGame;
    private int feelingHungry;
    private String favoriteFood;




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getFeelingHungry() {
        return feelingHungry;
    }

    public void setFeelingHungry(int feelingHungry) {
        this.feelingHungry = feelingHungry;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getLevelOfMood() {
        return levelOfMood;
    }

    public void setLevelOfMood(int levelOfMood) {
        this.levelOfMood = levelOfMood;
    }

    @Override
    public String toString() {
        return "Children{" +
                "id=" + id +
                ", levelOfMood=" + levelOfMood +
                ", healthCondition=" + healthCondition +
                ", favoriteGame='" + favoriteGame + '\'' +
                ", feelingHungry=" + feelingHungry +
                ", favoriteFood='" + favoriteFood + '\'' +
                '}';
    }
}



