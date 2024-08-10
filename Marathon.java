/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUDA GADGETS
 */
public class Marathon {
     public static void main (String[] arguments){
 String[] names ={
 "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
 "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
 "Aaron", "Kate"
};
 int[] times ={
 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
 343, 317, 265
 };
 int i1 = fastestIndex(times);
 int i2 = secondFastestIndex(times);
 
  System.out.println("The fastest runner is " + names[i1] + " with a time of " + times[i1] + " seconds.");
  System.out.println("The second fastest runner is " + names[i2] + " with a time of " + times[i2] + " seconds.");
        
 }
  public static int fastestIndex(int[] times) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < times.length; i++) {
            if (times[i] < min) {
                min = times[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int secondFastestIndex(int[] times) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int index = -1;
        int secondIndex = -1;
        for (int i = 0; i < times.length; i++) {
            if (times[i] < min) {
                secondMin = min;
                min = times[i];
                secondIndex = index;
                index = i;
            } else if (times[i] < secondMin && times[i] != min) {
                secondMin = times[i];
                secondIndex = i;
            }
        }
        return secondIndex;
    }
} 
    
    
    
    
    

