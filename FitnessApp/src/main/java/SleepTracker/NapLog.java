/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SleepTracker;

/**
 *
 * @author Tristan Odhiambo (github.com/DebugT)
 */
public class NapLog extends RestLog implements RestAssessable {
    
    //data memebers
    private String timeOfDay;
    private boolean feltRefreshed;
    
    //overloaded constructor (inheriting from parent class RestLog)
    public NapLog(String timeOfDay, boolean feltRefreshed, String logID, String date, String notes, int durationMinutes) {
        super(logID, date, notes, durationMinutes);
        this.timeOfDay = timeOfDay;
        this.feltRefreshed = feltRefreshed;
    }
    
    //setters
    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public void setFeltRefreshed(boolean feltRefreshed) {
        this.feltRefreshed = feltRefreshed;
    }
    
    //getters
    public String getTimeOfDay() {
        return timeOfDay;
    }

    public boolean isFeltRefreshed() {
        return feltRefreshed;
    }
    
    // Implementing method from the RestAssessable interface
    @Override
    public String getWellnessTip(){
        if(getDurationMinutes() > 45 && !feltRefreshed){
            return "A long nap over 45 mins can cause grogginess (Sleep inertia). Make sure to try a power nap (20-minutes) next time.";
        }else if (feltRefreshed) {
            return "Refreshing nap! A short daytime nap is an awesome way to boost focus.";
        }else{
            return "If daytime naps are leaving you tired, check if you are getting enough uninterrupred night sleep.";
        }
    }
    
    //toString() method
    @Override
    public String toString(){
        return super.toString() + "\n Time of Day: " + timeOfDay + "\n Felt Refreshed? " + feltRefreshed + "\n\n Wellness Tip: " + getWellnessTip() ;
    }
    
    
}
