/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gili.mod5lab2;

/**
 *
 * @author User
 */
public class HourlyEmployees extends Employee{
    private double hours;
    private double wage;

    public HourlyEmployees(double hours, double wage, String firstName, String lastName, String socialSecurityNumber) {
        
        super(firstName, lastName, socialSecurityNumber);
        this.hours = hours;
        this.wage = wage;
    }

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168) {
            throw new IllegalArgumentException("hours must be between 0.0 and 168.0");
        }      
        this.hours = hours;
    }

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("wage cannot be negative");
        } 
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }
    
    public double earnings() {
        return wage * hours;
    }
    
    @Override 
    public String toString() {
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
         "hourly employee", getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber(), 
         "hours worked", getHours(), 
         "wage", getWage());
   } 
}
