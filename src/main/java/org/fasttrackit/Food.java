package org.fasttrackit;

import java.time.LocalDateTime;

public class Food {

    LocalDateTime foodExpirationDate;
    private double price;
    private double amount;
    private boolean isInStock;

    private String nameOfFood;

    public Food(String foodName) {
        this.nameOfFood =foodName;
    }



    public LocalDateTime getFoodExpirationDate() {
        return foodExpirationDate;
    }

    public void setFoodExpirationDate(LocalDateTime foodExpirationDate) {
        this.foodExpirationDate = foodExpirationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }


    public String getNameOfFood() {
        return nameOfFood;
    }

    public void setNameOfFood(String nameOfFood) {
        this.nameOfFood = nameOfFood;
    }
}
