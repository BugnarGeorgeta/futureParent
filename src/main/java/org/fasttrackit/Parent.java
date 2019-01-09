package org.fasttrackit;

public class Parent extends People {

    private int age;
    private boolean hasOtherChildren;
    private int energyLevel;
    private int moneyAvailable;
    private boolean somebodyElseHelps;

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
