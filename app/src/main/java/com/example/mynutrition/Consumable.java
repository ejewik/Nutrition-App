package com.example.mynutrition;
import java.util.*;

public class Consumable {
    private HashMap nutriInfo;
    private double servings;


    public Consumable(double servings, double calories, double fat, double cholesterol, double sodium, double carbs, double protein) {
        nutriInfo = new HashMap<String, Double>();
        nutriInfo.put("Calories", servings*calories);
        nutriInfo.put("Fat", servings*fat);
        nutriInfo.put("Cholesterol", servings*cholesterol);
        nutriInfo.put("Sodium", servings*sodium);
        nutriInfo.put("Total Carbohydrates", servings*carbs);
        nutriInfo.put("Protein", servings*protein);
        this.servings = servings;
    }
    public Consumable(double calories, double fat, double cholesterol, double sodium, double carbs, double protein) {
        nutriInfo = new HashMap<String, Double>();
        nutriInfo.put("Calories", calories);
        nutriInfo.put("Fat", fat);
        nutriInfo.put("Cholesterol", cholesterol);
        nutriInfo.put("Sodium", sodium);
        nutriInfo.put("Total Carbohydrates", carbs);
        nutriInfo.put("Protein", protein);
        this.servings = 1.0;
    }

    public HashMap getNutriInfo() {
        return nutriInfo;
    }
    public double getServings() {
        return servings;
    }
    public void setServings(double servings) {
        this.servings = servings;
    }


}
