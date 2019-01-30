package org.fasttrackit;


import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.setName("Geta");
        parent.setAge(30);
        parent.setHasOtherChildren(false);
        parent.setEnergyLevel(6);
        parent.setMoneyAvailable(2000);
        parent.setSomebodyElseHelps(false);
        parent.setSex("female");

        Food food = new Food();

        food.setPrice(25.5);
        food.setAmount(2);
        food.setInStock(true);
        food.setNameOfFood("milk");
        food.foodExpirationDate = LocalDateTime.now().plusYears(2);


        Diapers diaper = new Diapers();
        diaper.setManufacturer("Huggies");
        diaper.setPrice(1.3);
        diaper.setAmount(56);
        diaper.setLevelHumidityPampers(2);


        Play play = new Play();
        play.setName("cucu-bau");


        Doctor dr = new Doctor();
        dr.setName("Inceu");
        dr.setSpecialization(" pediatrics");
        dr.setAvailable(true);
        dr.setSex("female");

        Baby baby = new Baby(food);
        baby.setName("Matei");
        baby.setAgeInDays(15);
        baby.setHealthCondition(10);
        baby.setLevelOfMood(7);
        baby.setFavoriteGame("toy with lights");
        baby.setHowCleanIs(8);
        baby.setSex("male");


        Child baby1 = new Baby(play);
        //baby1.mood();
       //baby.feed("Matei","milk");
        baby.setFeelingHungry(3);
        parent.feed(baby,food);
        parent.playing(baby,play);



       //parent.playing("Matei", "cucu-bau");
      // parent.feed("Matey","egg");


       // baby.mood();


    }
}
