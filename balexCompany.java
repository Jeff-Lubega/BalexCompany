/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUDA GADGETS
 */
public class balexCompany {
    
   // Minimum wage and maximum hours constants
    private static final double MINIMUM_WAGE = 8.00;
    private static final int MAX_HOURS = 60;
    private static final int REGULAR_HOURS = 40;
    private static final double OVERTIME_RATE = 1.5;

    // Method to calculate and print the total pay
    public void calculatePay(double basePay, int hoursWorked) {
        // Check if base pay is less than minimum wage
        if (basePay < MINIMUM_WAGE) { 
           System.out.println("Error: Base pay cannot be less than the minimum wage of $" + MINIMUM_WAGE);
            return;
        }

        // Check if hours worked exceed the maximum allowed
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked cannot exceed " + MAX_HOURS);
            return;
        }

        // Calculate total pay
        double totalPay;
        if (hoursWorked <= REGULAR_HOURS) {
            totalPay = basePay * hoursWorked;
        } else {
            // Calculate regular and overtime pay
            double regularPay = basePay * REGULAR_HOURS;
            double overtimePay = (hoursWorked - REGULAR_HOURS) * basePay * OVERTIME_RATE;
            totalPay = regularPay + overtimePay;
        }

        // Print the total pay
        System.out.printf("Total pay for %.2f base pay and %d hours worked is: $%.2f%n", basePay, hoursWorked, totalPay);
    }

    // Main method
    public static void main(String[] args) {
        balexCompany company = new balexCompany();

        // Sample employees with their base pay and hours worked
        double[][] employeeData = {
            {10.00, 45},  // Normal case
            {7.50, 50},   // Below minimum wage
            {12.00, 40},  // Exact regular hours
            {9.00, 65},   // Exceeding max hours
            {8.50, 30},   // Normal case with fewer hours
            {8.00, 50}    // At minimum wage with overtime
        };

        // Loop through each employee and calculate their pay
        for (double[] data : employeeData) {
            company.calculatePay(data[0], (int)data[1]);
    
    
    
    

        }
    }
}    