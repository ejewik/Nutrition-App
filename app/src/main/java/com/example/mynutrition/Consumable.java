package com.example.mynutrition;
import java.io.Serializable;
import java.util.*;

//represents one food item
public class Consumable implements Serializable {
    private String name;
    private HashMap nutriInfo;
    private int servings;


    public Consumable(String name, int servings, int calories, int fat, int cholesterol, int sodium, int carbs, int protein) {
        nutriInfo = new HashMap<String, Integer>();
        nutriInfo.put("Calories", servings*calories);
        nutriInfo.put("Fat", servings*fat);
        nutriInfo.put("Cholesterol", servings*cholesterol);
        nutriInfo.put("Sodium", servings*sodium);
        nutriInfo.put("Total Carbohydrates", servings*carbs);
        nutriInfo.put("Protein", servings*protein);
        this.servings = servings;
        this.name = name;
    }
    public Consumable(String name, int calories, int fat, int cholesterol, int sodium, int carbs, int protein) {
        this(name,1, calories,fat, cholesterol, sodium, carbs, protein);
    }

    public Consumable(String name, HashMap nutriInfo, int servings) {
        this.name = name;
        this.nutriInfo = nutriInfo;
        this.servings = servings;
    }

    public HashMap getNutriInfo() {
        return nutriInfo;
    }
    public int getServings() {
        return servings;
    }
    public void setServings(int servings) {
        this.servings = servings;
    }

    public String getName() {
        return name;
    }
}
