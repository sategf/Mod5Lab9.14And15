/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gili.mod5lab2;

/**
 *
 * @author User
 */
public class HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployees hourlyWorker = new HourlyEmployees(7,15,"John","Schmidt","003-55-2323");
      
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is",
           hourlyWorker.getFirstName());
        System.out.printf("%s %s%n", "Last name is", 
           hourlyWorker.getLastName());
        System.out.printf("%s %s%n", "Social security number is", 
           hourlyWorker.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", 
           hourlyWorker.getHours());
        System.out.printf("%s %.2f%n", "Commission rate is",
           hourlyWorker.getWage());
        System.out.printf("%s %.2f%n", "Earnings is",
           hourlyWorker.earnings());
        
        hourlyWorker.setHours(14);
        hourlyWorker.setWage(20);
        
              System.out.printf("%n%s:%n%n%s%n",                                
         "Updated employee information obtained by toString", hourlyWorker);
    }
}
