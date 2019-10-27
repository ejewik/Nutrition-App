package com.example.mynutrition;

public class Consumable {
    private double servingSize;
    private double calories;
    private double fat;
    private double cholesterol;
    private double sodium;
    private double carbs;
    private double protein;
    private double servings;


    public Consumable(double servingSize, double calories, double fat, double cholesterol, double sodium, double carbs, double protein) {
        this.servingSize = servingSize;
        this.calories = calories;
        this.fat = fat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.carbs = carbs;
        this.protein = protein;
        this.servings = 1.0;
    }

    public double getServingSize() {
        return servingSize;
    }
    public double getCalories() {
        return calories;
    }
    public double getFat() {
        return fat;
    }
    public double getCholesterol() {
        return cholesterol;
    }
    public double getSodium() {
        return sodium;
    }
    public double getCarbs() {
        return carbs;
    }
    public double getProtein() {
        return protein;
    }
    public double getServings() {
        return servings;
    }
    public void setServings(double servings) {
        this.servings = servings;
    }

    @Override
    public String toString() {
        return "Consumable{" +
                "servingSize=" + servingSize +
                ", calories=" + calories +
                ", fat=" + fat +
                ", cholesterol=" + cholesterol +
                ", sodium=" + sodium +
                ", protein=" + protein +
                '}';
    }
}
