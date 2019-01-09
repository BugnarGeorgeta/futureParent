package org.fasttrackit;

public class People {

    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void feed(String baby,String food){
        System.out.println( getName() + " just gave some " + food + " food to " + baby + ".");
    }
    public void playing(String baby,String play){
        System.out.println( getName() + " just played " + play + " with " + baby + ".");
    }
}
