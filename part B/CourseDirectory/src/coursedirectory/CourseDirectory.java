/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursedirectory;

/**
 *
 * @author mtsguest
 */
public class CourseDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CourseDirectory myDirectory = new CourseDirectory();
        myDirectory.createFIUCourses();
        myDirectory.displayMenu();
        
    }
    
    public void createFIUCourses()
    {
        //Create a loop that will ask user if he/she wants to create another course - do while
        //Inside loop, ask for all the information for a course 
        //Create another loop inside the outer loop (nested loop) for prerequisites (while)
        //After the nested loop, create a Course object
        //Add Course object to arrayList of courses
    }
    
    public void displayMenu()
    {
        //Create a loop that displays the menu of options:
        //1. Sort courses by FIU course name
        //2. Sort courses by FLA course name
        //3. Sort courses by year level
        //4.  Exit
        //Keep looping until the user enters option 4
        //For each of the options 1- 3, call a specific method
        
        
    }
    
    
    
}
