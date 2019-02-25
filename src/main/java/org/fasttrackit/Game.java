package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {

    public Parent parent;
    public Baby baby;


    private List<Food> availableFood = new ArrayList<>();
    private Play[] availableActivities = new Play[5];

    public void start() {
        initParent();
        nameBaby();
        getNameOfFoodFromUser();
        requireFeeding();

        int numberFromUser = requirePlaying();
        Play play = availableActivities[numberFromUser - 1];
        System.out.println("You choose to play: " + play.getName());
        parent.playing(baby,play);


      //  boolean noWinnerYet = true;


        //  for(Food food :availableFood){




    }

    private void initChild() {
        Baby baby = new Baby();
        baby.setFeelingHungry(2);
        baby.setLevelOfMood(5);
        //  System.out.println("Your baby are feeling hungry:" + baby.getFeelingHungry() + " level of mood: " + baby.getLevelOfMood());
    }


    private String initParent() {
        Parent parent = new Parent();
        parent.setMoneyAvailable(120);
        System.out.println("Please enter a parent name:");
        Scanner scanner = new Scanner(System.in);
        try {
            String nameOfParent = scanner.nextLine();
            System.out.println("Your parent name is: " + nameOfParent);
            return nameOfParent;
        } catch (InputMismatchException exception) {
            System.out.println("Please enter a valid String.");
            return initParent();
        }

    }

    private void nameBaby() {
        System.out.println("Please enter a name for baby:");
        Scanner scanner = new Scanner(System.in);
        String nameOfBaby = scanner.nextLine();
        System.out.println("Your baby name is: " + nameOfBaby);
    }


       private String getNameOfFoodFromUser() {
          System.out.println("Please enter a food name:");
          Scanner scanner = new Scanner(System.in);
         String name = scanner.nextLine();
         System.out.println("Your food name is :" + name);
          return name;


      }


   //    private void initFood(int countFood) {
   //       for (int i = 0; i < countFood; i++) {
   //        Food food = new Food(food);
   //        food.setNameOfFood(getNameOfFoodFromUser());
    //       availableFood.add(food);
    //       }

//    }

    private void displayFood() {
        System.out.println("The Food available is:");
        for (int i = 0; i < availableFood.size(); i++) {
            System.out.println(availableFood.get(i).getNameOfFood());

        }

    }

    private void requireFeeding() {
        System.out.println(baby.getName() + " 's hunger level is:" + baby.getFeelingHungry() + ". Please select food.");
        displayFood();
        String foodName = readFoodName();
        Food food = new Food(foodName);
        parent.feed(baby, food);


    }

    private String readFoodName() {
        System.out.println("Please select food:");
        Scanner scanner = new Scanner(System.in);
        String foodName = scanner.nextLine();
        System.out.println("Selected: " + foodName);
        List<String> availableFoodNames = new ArrayList<>();
        for (Food food : availableFood) {
            availableFoodNames.add(food.getNameOfFood());
        }
        if (!availableFoodNames.contains(foodName)) {
            System.out.println(foodName + " is not available as a food type in this game.");
            return readFoodName();
        }
        System.out.println("The food selected is: " + foodName);
        return foodName;
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

    private int requirePlaying() {
        initActivities();
        displayActivities();
        System.out.println("It's time to play with the baby!");
        System.out.println("Please choose a play:");
        Scanner scanner = new Scanner(System.in);
        try {
            int numberForPlay = scanner.nextInt();
            return numberForPlay;
        } catch (InputMismatchException exception) {
            System.out.println("Please enter a good number");
            return requirePlaying();

        }
    }


}
