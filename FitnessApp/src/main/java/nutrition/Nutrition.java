/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nutrition;

import java.util.ArrayList;

/**
 *
 * @author Andrei Grigorita
 * @author_github github.com/S1lverCr0w
 */
public class Nutrition {
	String file;
	ArrayList<NutritionEntry> nutritionAList;

	public String getFile() {
		return file;
	}

	public ArrayList<NutritionEntry> getNutritionAList() {
		return nutritionAList;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public void setNutritionAList(ArrayList<NutritionEntry> nutritionAList) {
		this.nutritionAList = nutritionAList;
	}

	public Nutrition(String FILE, ArrayList<NutritionEntry> nutritionAList) {
		this.file = FILE;
		this.nutritionAList = nutritionAList;
	}
	
	public Nutrition() {
		nutritionAList = new ArrayList<>();
		file = "nutrition.db";
	}
	
//	saveToFile
	
	
}
