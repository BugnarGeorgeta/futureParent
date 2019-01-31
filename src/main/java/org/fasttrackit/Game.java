package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Food> availableFood = new ArrayList<>();
    private Play[] availableActivities = new Play[5];

    public void start() {
        initFood(2);
        displayFood();
        initActivities();
        displayActivities();

    }
        private void initFood(int countFood){
         for (int i =0; i<countFood; i++) {
             Food food = new Food();
             availableFood.add(food);
         }

    }

    private void displayFood() {
        System.out.println("The Food available is:");
        for (int i = 0; i < availableFood.size(); i++) {
            System.out.println(availableFood.get(i).getNameOfFood());

        }

    }

    private void initActivities() {
        Play availableActivities1 = new Play("cucu-bau");
        Play availableActivities2 = new Play("plush toy");

        availableActivities[0] = availableActivities1;
        availableActivities[1] = availableActivities2;


    }

    private void displayActivities() {
        System.out.println("The activities are: ");
        for (Play play : availableActivities) {
            if (play != null) {
                System.out.println(play.getName());
            }


        }
    }
}
