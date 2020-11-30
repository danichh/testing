/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgnment_4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Danich Hang
 */
public class calcAvergeScore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //input
        System.out.print("Please entre how many score do you need: ");
        int num = console.nextInt(); 
        
        double avg = calcAvergeScore(num); 
        
        //output 
        System.out.printf("Your average score would be %.2f", avg);
    }

    /**
     * calculate the average of the random number 
     * @param num is how many random number would be generate to do the average 
     * if the num is lower that 40 skip 
     * @return the average of the random number 
     */
    public static double calcAvergeScore(int num){
        Random rand = new Random();
         
        int sum = 0; 
        int counter = 0;
        for ( int i = 0; i <= num; i++){
            int randomNumber = rand.nextInt(101);
            if (randomNumber >= 40){
                counter ++; 
                sum += randomNumber;
             }  
        }  
        return sum / counter; 
    }
}