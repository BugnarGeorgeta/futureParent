package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Play[] availableActivities = new Play[5];
    private Food[] availableFood = new Food[4];
    private List<Parent> parents = new ArrayList<>();
    private List<Baby> babies = new ArrayList<>();


    public void start() {
        initParent();
        initChild();
        initFood();
        initActivities();


        int lenghtGameFromUser = getLenghtGameFromUser();

        while (babies.get(0).getFeelingHungry() > 1 && babies.get(0).getLevelOfMood() < 5) {
            for (int i = 0; i < lenghtGameFromUser; i++) {
                requireFood();
                requirePlaying();
            }
            if (babies.get(0).getFeelingHungry() <= 2 || babies.get(0).getLevelOfMood() >= 4) {
                requirePlaying();
                System.out.println("Congratulations, the winer is :" + parents.get(0).getName());
                break;

            } else if (babies.get(0).getFeelingHungry() > 4 && babies.get(0).getLevelOfMood() < 2) {
                System.out.println("Try again!");
                break;
            }

        }
    }


    private void initChild() {
        Baby baby = new Baby(getnameBaby());
        baby.setFeelingHungry(ThreadLocalRandom.current().nextInt(1, 5));
        baby.setLevelOfMood(ThreadLocalRandom.current().nextInt(1, 5));
        baby.setFavoriteFood("mango");
        baby.setFavoriteGame("cucu-bau");
        babies.add(baby);

    }


    private void initParent() {
        Parent parent = new Parent();
        System.out.println("Please enter a parent name:");
        Scanner scanner = new Scanner(System.in);
        try {
            String nameOfParent = scanner.nextLine();
            System.out.println("Your parent name is: " + nameOfParent);
            parent.setName(nameOfParent);
        } catch (InputMismatchException | IndexOutOfBoundsException exception) {
            System.out.println("Please enter a valid String.");
        }
        parents.add(parent);
    }

    private String getnameBaby() {
        System.out.println("Please enter a name for baby:");
        Scanner scanner = new Scanner(System.in);
        String nameOfBaby = scanner.nextLine();
        System.out.println("Your baby name is: " + nameOfBaby);
        return nameOfBaby;
    }


    private void displayFood() {
        System.out.println("The available food is:");
        for (int i = 0; i < availableFood.length; i++) {
            if (availableFood[i] != null) {
                System.out.println(availableFood[i].getNameOfFood());
            }

        }
    }

    private void initFood() {
        Food availableFood1 = new Food("Milk");
        Food availableFood2 = new Food("Apple");
        Food availableFood3 = new Food("Mango");
        Food availableFood4 = new Food("Soup");

        availableFood[0] = availableFood1;
        availableFood[1] = availableFood2;
        availableFood[2] = availableFood3;
        availableFood[3] = availableFood4;
    }


    private String requireFood() {
        System.out.println("The baby's hunger level is: " + babies.get(0).getFeelingHungry());
        System.out.println("It's time to feed the baby!");
        displayFood();
        System.out.println("Please choose a food:");
        Scanner scanner = new Scanner(System.in);
        try {
            int numberOfFood = scanner.nextInt();
            if (numberOfFood - 1 <= availableFood.length) {
                parents.get(0).feed(babies.get(0), availableFood[numberOfFood - 1]);
            }

        } catch (InputMismatchException | IndexOutOfBoundsException exception) {
            System.out.println("Please enter a good number");
            return requireFood();
        }
        return null;
    }

    private void initActivities() {
        Play availableActivities1 = new Play("cucu-bau");
        Play availableActivities2 = new Play("plush toy");
        Play availableActivities3 = new Play("play with  ball");
        Play availableActivities4 = new Play("play with toys");
        Play availableActivities5 = new Play("play with car");


        availableActivities[0] = availableActivities1;
        availableActivities[1] = availableActivities2;
        availableActivities[2] = availableActivities3;
        availableActivities[3] = availableActivities4;
        availableActivities[4] = availableActivities5;


    }

    private void displayActivities() {
        System.out.println("The activities are: ");
        for (Play play : availableActivities) {
            if (play != null) {
                System.out.println(play.getName());
            }
        }
    }

    private String requirePlaying() {
        System.out.println("The baby's happines level is: " + babies.get(0).getLevelOfMood());
        System.out.println("It's time to play with the baby!");
        displayActivities();
        System.out.println("Please choose a play:");
        Scanner scanner = new Scanner(System.in);
        try {
            int numberForPlay = scanner.nextInt();
            if (numberForPlay - 1 <= availableActivities.length) {
                parents.get(0).playing(babies.get(0), availableActivities[numberForPlay - 1]);
            }
        } catch (InputMismatchException | NullPointerException exception) {
            System.out.println("Please enter a good number");
            return requirePlaying();
        }
        return null;
    }

    private int getLenghtGameFromUser() {
        System.out.println("Please enter how many games  you want to play:");
        Scanner scanner = new Scanner(System.in);
        try {
            int numberOfGame = scanner.nextInt();
            return numberOfGame;
        } catch (InputMismatchException | IndexOutOfBoundsException exception) {
            System.out.println("Please enter a good number");
            return getLenghtGameFromUser();
        }
    }


}
