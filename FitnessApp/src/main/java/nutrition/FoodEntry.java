/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nutrition;

import java.io.Serializable;

/**
 *
 * @author Andrei Grigorita
 * @author_github github.com/S1lverCr0w
 */
public class FoodEntry extends NutritionEntry implements Serializable {
	private String foodName;
	private String mealType;
	private int protein;

	public FoodEntry(String foodName, String mealType, int protein, String date, int calories) {
		super(date, calories);
		this.foodName = foodName;
		this.mealType = mealType;
		this.protein = protein;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public void setMealType(String mealType) {
		this.mealType = mealType;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getFoodName() {
		return foodName;
	}

	public String getMealType() {
		return mealType;
	}

	public int getProtein() {
		return protein;
	}

	public String getDate() {
		return date;
	}

	public int getCalories() {
		return calories;
	}
        
        @Override
        public String toString() {
            return (
                "FoodName: " + foodName + ", MealType: " + mealType + 
                ", Protein: " + protein + ", KiloCalories: " + calories +
                ", Date:" + date
            );
        }
    
}
