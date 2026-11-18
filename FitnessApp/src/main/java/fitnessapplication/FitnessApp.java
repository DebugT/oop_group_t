/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fitnessapplication;

import fitness.WorkoutHistory;
import fitness.AddWorkout;
import fitness.FitnessMenu;

/**
 *
 * @author Alexander Kirichenko
 * @author1_github github.com/Sasha-Clover
 * @author Tristan Bradley Odhiambo
 * @author2_github github.com/DebugT
 * @author Andrei Grigorita
 * @author3_github github.com/S1lverCr0w
 */
public class FitnessApp {

    public static void main(String[] args) {
        // main menu init & display
        MainMenu mainMenu = new MainMenu(); // create object our window
        mainMenu.setVisible(true); // show our window
        
        FitnessMenu menu = new FitnessMenu(); // create object our window
        menu.setVisible(false); // show our window
        
        AddWorkout workout = new AddWorkout();
        workout.setVisible(false);
        
        WorkoutHistory history = new WorkoutHistory();
        history.setVisible(false);
   
        
        
    }
}
