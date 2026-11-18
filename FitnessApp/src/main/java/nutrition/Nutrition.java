/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nutrition;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrei Grigorita
 * @author_github github.com/S1lverCr0w
 */
public class Nutrition {
	ArrayList<NutritionEntry> nutritionAList;
	String fileName;
	File file;
	FileOutputStream fStream;
	ObjectOutputStream oStream;
	
	

	public String getFileName() {
		return fileName;
	}

	public ArrayList<NutritionEntry> getNutritionAList() {
		return nutritionAList;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setNutritionAList(ArrayList<NutritionEntry> nutritionAList) {
		this.nutritionAList = nutritionAList;
	}

	public Nutrition(String FILE, ArrayList<NutritionEntry> nutritionAList) {
		this.fileName = FILE;
		this.nutritionAList = nutritionAList;
	}
	
	public Nutrition() {
		nutritionAList = new ArrayList<>();
		fileName = "nutrition.db";
	}
	
	public void saveToFile() {
		try {
			file = new File(fileName);
			fStream = new FileOutputStream(file);
			oStream = new ObjectOutputStream(fStream);
			
			oStream.writeObject(nutritionAList);
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Error while writing to file " + ex);
		}
	}
	
	public void loadFromFile() {
		file = new File(fileName);
	}
	
	
}
