/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursedirectory;
import java.util.ArrayList;
/**
 *
 * @author mtsguest
 */
public class Course implements Comparable {
    private String FIUCourseName;
    private String FLACourseName;
    private int yearLevel;
    private int numCredits;
    private ArrayList<String> prerequisites;
    
    public Course(String anFIUCourseName, String aFLACourseName, int aYearLevel, int aNumCredits, ArrayList<String> myPreReqs)
    {
        FIUCourseName = anFIUCourseName;
        FLACourseName = aFLACourseName;
        yearLevel = aYearLevel;
        numCredits = aNumCredits;
        prerequisites = new ArrayList<String>(myPreReqs);
       
    }

    public String getFIUCourseName() {
        return FIUCourseName;
    }

    public void setFIUCourseName(String FIUCourseName) {
        this.FIUCourseName = FIUCourseName;
    }

    public String getFLACourseName() {
        return FLACourseName;
    }

    public void setFLACourseName(String FLACourseName) {
        this.FLACourseName = FLACourseName;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public int getNumCredits() {
        return numCredits;
    }

    public void setNumCredits(int numCredits) {
        this.numCredits = numCredits;
    }

    public ArrayList<String> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(ArrayList<String> prerequisites) {
        this.prerequisites = new ArrayList<String>(prerequisites);
    }

    @Override
    public String toString() {
        return "Course{" + "FIUCourseName=" + FIUCourseName + ", FLACourseName=" + FLACourseName + ", yearLevel=" + yearLevel + ", numCredits=" + numCredits + ", prerequisites=" + prerequisites + '}';
    }
    
    @Override
    public int compareTo(Object other)
    {
        Course otherCourse = (Course) other;
        return this.FIUCourseName.compareTo(otherCourse.FIUCourseName);
    }
    
    
    
    
    
    
    
    
}
