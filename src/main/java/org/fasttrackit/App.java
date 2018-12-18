package org.fasttrackit;


public class App 
{
    public static void main( String[] args )
    {
       Baby baby = new Baby();
       baby.name = "Amalia";
       baby.ageInDays = 15;
       baby.healthCondition = 10;
       baby.feelingHungry = 5;
       baby.levelOfMood = 7;
       baby.nameOfFood = "milk";
       baby.isCrying = false;
       baby.favoriteGame = "toy with lights";
       baby.levelHumidityPampers = 3;
       baby.howCleanIs = 8;

       Parent parent = new Parent();
       parent.name = "Geta";
       parent.age = 30;
       parent.hasOtherChildren = false;
       parent.energyLevel = 6;
       parent.moneyAvailable = 2000;
       parent.somebodyElseHelps = false;

       Food food = new Food();
       food.name = "milk";
       food.price = 25.5;
       food.amount = 2;
       food.isInStock = true;
       food.expirationDate = 31102019;

       Diapers diaper = new Diapers();
       diaper.manufacturer = "Huggies";
       diaper.price = 1.3;
       diaper.amount = 56;

       Play play = new Play();
       play.name = "cucu-bau";

       Doctor dr = new Doctor();
       dr.name = "Inceu";
       dr.specialization = " pediatrics";
       dr.isAvailable = true;



    }
}
