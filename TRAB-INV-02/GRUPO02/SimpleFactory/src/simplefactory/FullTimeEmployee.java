/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplefactory;

/**
 *
 * @author anibal
 */
public class FullTimeEmployee implements Employee
 {
    private double hourlyRate;
 
    public FullTimeEmployee(double hourlyRate)
    {
       this.hourlyRate = hourlyRate;
    }
 
    /*Implement the contract methods here*/
    public double getHourlyRate()
    {
        return hourlyRate;
    }
 }