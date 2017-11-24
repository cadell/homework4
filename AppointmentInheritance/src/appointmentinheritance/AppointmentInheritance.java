/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentinheritance;
import java.util.Scanner;
/**
 *
 * @author cristy
 */
public class AppointmentInheritance 
{
//Define an array of Appointments here (globally)
    Appointment[] myAppointments;
    Scanner keyboard = new Scanner(System.in);
    
/**
   Demonstration of the appointment classes
*/
    public static void main(String args[])
    {
        AppointmentInheritance myAppts = new AppointmentInheritance();
        myAppts.makeAppointments();
        myAppts.checkAppointments();
        
    }
    
    public void makeAppointments()
    {
     
        
        System.out.println("How many appointments do you wish to make?");
        int numAppts = keyboard.nextInt();
        myAppointments = new Appointment[numAppts];
        
        //Ask user how many appoints (numAppts) they want to make, make an array of Appointment type for that many entries,
        //and loop that many times, to do the following:
        
        //Define variables for apptDescription, apptDay, apptMonth, apptYear
        //Define variables for apptIndex and menuSelection
        
        
        //instantiate the array of Appointment objects:
       
        //Loop as many times as the number of objects the user said he wanted to create:
        for (int i = 0; i < numAppts; i++)
        {
            //Display a menu of making appts:  Onetime, Daily Monthly
            System.out.println("Please make a selection:\n1. One Time Appointment\n2. Daily Appointment \n3. Monthly Appointment ");
            //get the user's menu selection
            int menuSelection = keyboard.nextInt();
            keyboard.nextLine(); //clears buffer
            System.out.println("What is the description of your appointment? ");
            String apptDescription = keyboard.nextLine();
            

           //According to the menu selection, ask user for further data.
           //Then, create the appropriate subclass object: Onetime, Daily, Monthly
           //Place object in array (ensure there is enough space left)

            if (menuSelection == 1)
            {
                //
                myAppointments[i] = new Daily(apptDescription);
            }
            else if (menuSelection == 2)
            {
                //
                System.out.println("Day for your appointment??? ");
                int apptDay = keyboard.nextInt();
                myAppointments[i] = new Monthly(apptDay,apptDescription);
                

            }
            else if (menuSelection == 3)
            {
                //
                System.out.println("Month for your appointment ????");
                int apptMonth = keyboard.nextInt();
                
                System.out.println("Year for your appointment ???? ");
                int apptYear = keyboard.nextInt();

                System.out.println("Day for your appointment??? ");
                int apptDay = keyboard.nextInt();
                myAppointments[i] = new Onetime(apptYear, apptMonth,apptDay,apptDescription);
            }
           
                  
        }
        System.out.println("*************Thank you for making all of your appointments.*****************\n");
       

    }
    
    public void checkAppointments()
    {
      //Ask user for a specific date that they wish to see all appointments
      //Input all the values into local variables for year, month, and day
        
      //Create a for-loop that will go through the array of appointments, and will 
      //ask if each appointment occursOn(year, month, day).
      //if true, print out the appointment object.
      System.out.println("Check Month for your appointment ????");
      int apptMonth = keyboard.nextInt();
                
      System.out.println("Check Year for your appointment ???? ");
      int apptYear = keyboard.nextInt();

      System.out.println("Check Day for your appointment??? ");
      int apptDay = keyboard.nextInt();
      
      for(int i =0; i < myAppointments.length; i++)
      {
         boolean state = myAppointments[i].occursOn(apptYear, apptMonth, apptDay);
         if(state)
         {
             System.out.println("Your appointment is valid! " +myAppointments[i]);
         }
         else
         {
             System.out.println("No appointment for this date.");
         }
      }
            
      
    }
   }

