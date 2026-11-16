/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nutrition;

/**
 *
 * @author enryu
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
}
