package com.example.mynutrition;

import java.lang.reflect.Array;
import java.util.*;


public class DailyIntake {
    private double calorieReq;
    private ArrayList<Consumable> consumption;
    private Map daily;

    public DailyIntake(double calorieReq) {
        daily = new HashMap<String, Double>();
        daily.put("Calories", 0);
        daily.put("Fat", 0);
        daily.put("Cholesterol", 0);
        daily.put("Sodium", 0);
        daily.put("Total Carbohydrates", 0);
        daily.put("Protein", 0);
        this.calorieReq = calorieReq;
        this.consumption = new ArrayList<Consumable>();
    }

    public double getCalorieReq () {
        return calorieReq;
    }
    public ArrayList<Consumable> getConsumption() {
        return consumption;
    }
    public Map getDaily() {
        return daily;
    }

    public void addItem(Consumable c) {
        consumption.add(c);
        Set<String> keys  = c.getNutriInfo().keySet();
        for(String key : keys) {
            if (daily.containsKey(key)) {
                Double tmp = (Double)
                daily.put(key, daily.get(key));
            }
        }

    }

}
