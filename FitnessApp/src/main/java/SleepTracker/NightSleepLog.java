/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SleepTracker;

/**
 *
 * @author Tristan Odhiambo
 */
public class NightSleepLog extends RestLog {
    
    //data memebers
    private int qualityRating;
    private int interruptions;
    private int goalMinutes;
    
    //overloaded constructor (inherting from parent class RestLog)
    public NightSleepLog(int qualityRating, int interruptions, int goalMinutes, String logID, String date, String notes, int durationMinutes) {
        super(logID, date, notes, durationMinutes);
        this.qualityRating = qualityRating;
        this.interruptions = interruptions;
        this.goalMinutes = goalMinutes;
    }
  
    //setters
    public void setQualityRating(int qualityRating) {
        this.qualityRating = qualityRating;
    }
    
    public void setInterruptions(int interruptions) {
        this.interruptions = interruptions;
    }
    
    public void setGoalMinutes(int goalMinutes) {
        this.goalMinutes = goalMinutes;
    }
     
    //getters
    public int getQualityRating() {
        return qualityRating;
    }
    
    public int getInterruptions() {
        return interruptions;
    }

    public int getGoalMinutes() {
        return goalMinutes;
    }
    
    //Calculating minutes below the goal
    public int minutesBelowGoal(){
       int difference;
       difference = this.goalMinutes - getDurationMinutes();
       
       if (difference > 0){
           return difference;
       }else{
           return 0;
       }
    }
    
    //A toString() method, inherits data memebers from RestLog
    @Override
    public String toString(){
        return super.toString() + "\n Quality Rating: " + qualityRating + "\n Interruptions: " + interruptions + "\n Sleep Goal (minutes): " + goalMinutes + "\n Minutes below Goal: " + minutesBelowGoal();
    }
    
    
}
