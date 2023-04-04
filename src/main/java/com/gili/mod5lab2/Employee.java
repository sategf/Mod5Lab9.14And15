/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gili.mod5lab2;

/**
 *
 * @author User
 */
public class Employee {
   private final String firstName;                        
   private final String lastName;                         
   private final String socialSecurityNumber;   

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
   
   @Override 
   public String toString() {
      return String.format("%s: %s %s%n%s: %s%n", 
         "commission employee", getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber());
    } 
}
