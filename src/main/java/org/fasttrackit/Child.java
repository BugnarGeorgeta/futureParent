package org.fasttrackit;

public class Child extends People {

    private int levelOfMood;
    private int healthCondition;
    private String favoriteGame;
    private int feelingHungry;
    private String favoriteFood;

    public Food food;
    public Play play;

   //public Child(Food food){
   //     this.food = food;
  //  }
  //  public Child(Play play){
  //      this.play = play;
   // }

    public void mood(){
        System.out.println("The child is happy.");
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

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
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

