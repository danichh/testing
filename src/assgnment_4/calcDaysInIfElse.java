/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgnment_4; 

import java.util.Scanner;

/**
 *
 * @author Danich Hang
 */
public class calcDaysInIfElse {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        
        //input
        System.out.print("Please enter a mouth and a year ,"
                + "seperated by a space, e.g 2 2000: ");
        int mouth = console.nextInt();
        int year = console.nextInt(); 
        
        int days = calcDays(mouth, year);
       
        //ouput
        System.out.printf("It have %d days in the mouth %d of %d", 
                 days, mouth, year);
    }
    
    /**
     * give the number of days in a mouth given the year and mouth 
     * @param mouth is the given mouth 
     * @param year is the given year
     * @return the number of days in that mouth
     */
    public static int calcDays(int mouth, int year){  
      if ( mouth == 1 || mouth == 3 || mouth == 5 || mouth == 7 || mouth == 8 || 
              mouth == 10 || mouth == 12)
          return 31; 
      else if ( mouth == 2 )
          return (isLeapYear(year)) ? 29 : 28; 
      else 
          return 30;              
    }
    
    /**
     * if a mouth is a leap mouth or not 
     * @param year is the given year 
     * @return  false = common mouth , true = leap mouth 
     */
    public static boolean isLeapYear(int year ){
        if ( year % 4 == 0 && year % 100 != 0 ) 
            return true;
        else if (year % 400 != 0 && year % 4 == 0 && year % 100 != 0)
            return true; 
        else 
            return false;       
    }
}
