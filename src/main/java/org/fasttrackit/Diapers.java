package org.fasttrackit;

public class Diapers {
    private String manufacturer;
    private double price;
    private int amount;
    private int levelHumidityPampers;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getLevelHumidityPampers() {
        return levelHumidityPampers;
    }

    public void setLevelHumidityPampers(int levelHumidityPampers) {
        this.levelHumidityPampers = levelHumidityPampers;
    }
}
