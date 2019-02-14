package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {
    private List<Food> availableFood = new ArrayList<>();
    private Play[] availableActivities = new Play[5];

    public void start() {
        initChild();
        initParent();
        nameBaby();
        initFood(2);
        displayFood();
        requireFeeding();
        initActivities();
        displayActivities();

        int numberFromUser = requirePlaying();
        Play play = availableActivities[numberFromUser - 1];
        System.out.println("You choose to play: " + play.getName());

    }


    private void initChild() {
        Child baby = new Baby();
        System.out.println(baby.toString());
    }

    private String initParent() {
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


    private void initFood(int countFood) {
        for (int i = 0; i < countFood; i++) {
            Food food = new Food();
            food.setNameOfFood(getNameOfFoodFromUser());
            availableFood.add(food);
        }

    }

    private void displayFood() {
        System.out.println("The Food available is:");
        for (int i = 0; i < availableFood.size(); i++) {
            System.out.println(availableFood.get(i).getNameOfFood());

        }

    }

    private void requireFeeding() {
        System.out.println("Please feed the baby!");
        System.out.println("Please choose a food:");
        Scanner scanner = new Scanner(System.in);
        int numForFood = scanner.nextInt();
        if (numForFood == 1) {
            System.out.println("the food chosen for the baby is :" + availableFood.get(0).getNameOfFood());
        } else if (numForFood == 2) {
            System.out.println("the food chosen for the baby is :" + availableFood.get(1).getNameOfFood());
        } else {
            System.out.println("You don't feed the baby!");
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

    private int requirePlaying() {
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
