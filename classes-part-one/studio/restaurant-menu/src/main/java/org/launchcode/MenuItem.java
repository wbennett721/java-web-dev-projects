package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {

    private String name;
    private String description;
    private double price;
    private String category;
    private final LocalDate dateAdded;

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public LocalDate getDateAdded() {

        return dateAdded;
    }

    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween < 30;
    }

    @Override
    public String toString() {
        String newText = isNew() ? " - NEW!" : "";
        return name + newText + "\n" + description + " | $" + price;
    }

}