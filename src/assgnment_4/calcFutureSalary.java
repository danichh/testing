/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgnment_4;

/**
 *
 * @author Danich Hang
 */
public class calcFutureSalary {
    public static void main(String[] args) {
        System.out.println(calcFutureSalary(5, 5));
    }
    
     /**
      * 
      * @param currentSalary is the initial salary 
      * @param year how long the person work in the company
      * @return the salary after a certain amount of year 
      */
    public static double calcFutureSalary(double currentSalary, int year){
        double ratioLessThan3years = 0.03;   //the salary increase  by 3% less 3years
        double ratioAfter3years = 0.05;     //the salary increase  by 5% after 3years
        double ratioAfter10years = 0.08;    //the salary increase  by 8% after 10years
        
        double futureSalary = 0; 
        if (year < 3)  // 3 years 
            futureSalary = currentSalary * Math.pow((1 + ratioLessThan3years), year); 
        else if (year >= 3 && year < 10) // for 3 years to 9 years 
            futureSalary = (currentSalary * Math.pow((1 + ratioLessThan3years), 2))
                    * Math.pow((1 + ratioAfter3years), ( year - 2)); 
         // 2 is for the 2 years salary increasse before the new increase ratio
        else if (year >= 10 ) // for 10 years et plus 
            futureSalary = ((currentSalary * Math.pow((1 + ratioLessThan3years), 2))
                    * Math.pow((1 + ratioAfter3years), 9)) 
                    *  Math.pow((1 + ratioAfter3years), year - 9); 
        // 2 is for the 2 years salary increasse before the new increase ratio
        // 9 is for the 9 year salary increase before the new incease ratio
        return futureSalary;      
    }  
}
