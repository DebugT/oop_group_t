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
public abstract class NutritionEntry {
    protected String date;
    protected int calories;

    public NutritionEntry(String date, int calories) {
        this.date = date;
        this.calories = calories;
    }

    public String getDate() {
        return date;
    }

    public int getCalories() {
        return calories;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    
    @Override
    public String toString() {
	    return "KiloCalories: " + calories + ", Date:" + date;
    }
    
    public String getEntry() {
	    return ""; // hold on, maybe i need to use toSring
    }
}
