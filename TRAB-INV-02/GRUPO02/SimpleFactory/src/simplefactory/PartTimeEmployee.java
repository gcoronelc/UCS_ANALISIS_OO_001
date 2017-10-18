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
public class PartTimeEmployee implements Employee
 {
    private double hourlyRate;
 
    public PartTimeEmployee(double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }
 
    /*Implement the contract methods here*/
    public double getHourlyRate()
    {
        return hourlyRate;
    }
 }