package com.example.mynutrition;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DailyIntake {
    private double calorieReq;
    private double factor;
    private ArrayList<Consumable> consumption;
    private double totalCalories;
    private double totalFat;
    private double totalCholesterol;
    private double totalSodium;
    private double totalCarbs;
    private double totalProtein;


    {
        factor = calorieReq / 2000;
    }


    public double getCalorieReq () {
        return calorieReq;
    }
    public double getTotalCalories () {
        return totalCalories;
    }
    public double getTotalFat () {
        return totalFat;
    }
    public double getTotalCholesterol () {
        return totalCholesterol;
    }
    public double getTotalSodium () {
        return totalSodium;
    }
    public double getTotalCarbs () {
        return totalCarbs;
    }
    public double getTotalProtein () {
        return totalProtein;
    }

    public DailyIntake(double calorieReq) {
        this.calorieReq = calorieReq;
        consumption = new ArrayList<Consumable>();
    }

    public void addItem(Consumable c) {
        consumption.add(c);
        totalCalories+=c.getCalories()*c.getServingSize();
        totalFat+=c.getFat()*c.getServingSize();
        totalCholesterol+=c.getCholesterol()*c.getServingSize();
        totalSodium+=c.getSodium()*c.getServingSize();
        totalCarbs+=c.getCarbs()*c.getServingSize();
        totalProtein+=c.getProtein()*c.getServingSize();
    }

}
