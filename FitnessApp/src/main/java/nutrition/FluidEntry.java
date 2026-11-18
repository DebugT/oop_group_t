/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nutrition;

/**
 *
 * @author Andrei Grigorita
 * @author_github github.com/S1lverCr0w
 */
public class FluidEntry extends NutritionEntry {
	private String drinkName;
	private int amountMl;

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}

	public void setAmountMl(int amountMl) {
		this.amountMl = amountMl;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getDrinkName() {
		return drinkName;
	}

	public int getAmountMl() {
		return amountMl;
	}

	public String getDate() {
		return date;
	}

	public int getCalories() {
		return calories;
	}

	public FluidEntry(String drinkName, int amountMl, String date, int calories) {
		super(date, calories);
		this.drinkName = drinkName;
		this.amountMl = amountMl;
	}
	
    
}
