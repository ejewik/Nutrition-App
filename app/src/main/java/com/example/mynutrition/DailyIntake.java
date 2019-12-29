package com.example.mynutrition;

import java.lang.reflect.Array;
import java.util.*;


public class DailyIntake {
    private double calorieReq;
    private ArrayList<Consumable> consumption;
    private Map daily;

    public DailyIntake(double calorieReq) {
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
