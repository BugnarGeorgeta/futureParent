package org.fasttrackit;

public class Parent extends People {

    private int age;
    private boolean hasOtherChildren;
    private int energyLevel;
    private int moneyAvailable;
    private boolean somebodyElseHelps;


    public void feed(Baby baby, Food food){
        System.out.println( getName() + " just gave some " + food.getNameOfFood() + " food to " + baby.getName() + ".");
        int hungry = baby.getFeelingHungry();
        hungry--;
        System.out.println("Now the level of hungry is: " + hungry);

        if( food.getNameOfFood() == baby.getFavoriteFood()){
            int happy =baby.getLevelOfMood();
            happy++;
            System.out.println("Now the level of mood is: " + happy);
        }
    }

    public void playing(Baby baby,Play play) {
        System.out.println(getName() + " just played " + play.getName() + " with " + baby.getName() + ".");
        int mood = baby.getLevelOfMood();

        if (play.getName() == baby.getFavoriteGame()) {
            mood = mood + 2;
            System.out.println("Now the level of mood is: " + mood);
        } else {
            mood++;
            System.out.println("Now the level of mood is: " + mood);
        }
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasOtherChildren() {
        return hasOtherChildren;
    }

    public void setHasOtherChildren(boolean hasOtherChildren) {
        this.hasOtherChildren = hasOtherChildren;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getMoneyAvailable() {
        return moneyAvailable;
    }

    public void setMoneyAvailable(int moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    public boolean isSomebodyElseHelps() {
        return somebodyElseHelps;
    }

    public void setSomebodyElseHelps(boolean somebodyElseHelps) {
        this.somebodyElseHelps = somebodyElseHelps;
    }


}
