package org.fasttrackit;


import java.time.LocalDateTime;

public class App
{
    public static void main( String[] args )
    {

       Baby baby = new Baby();
       baby.name = "Amalia";
       baby.ageInDays = 15;
       baby.healthCondition = 10;
       baby.levelOfMood = 7;
       baby.isCrying = false;
       baby.favoriteGame = "toy with lights";
       baby.howCleanIs = 8;

       Parent parent = new Parent();
       parent.name = "Geta";
       parent.age = 30;
       parent.hasOtherChildren = false;
       parent.energyLevel = 6;
       parent.moneyAvailable = 2000;
       parent.somebodyElseHelps = false;

       Food food = new Food();

       food.price = 25.5;
       food.amount = 2;
       food.isInStock = true;
       food.feelingHungry = 3;
       food.nameOfFood= "milk";
       food.foodExpirationDate = LocalDateTime.now().plusYears(2);

       baby.food.nameOfFood ="milk";

       Diapers diaper = new Diapers();
       diaper.manufacturer = "Huggies";
       diaper.price = 1.3;
       diaper.amount = 56;
       diaper.levelHumidityPampers = 2;

       baby.diaper.levelHumidityPampers = 3;

       Play play = new Play();
       play.name = "cucu-bau";
       baby.play.name = "teddy bear";

       Doctor dr = new Doctor();
       dr.name = "Inceu";
       dr.specialization = " pediatrics";
       dr.isAvailable = true;











    }
}
