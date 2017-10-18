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
public class EmployeeFactory
{
   public static Employee getEmployee(int hoursAllocated, double hourlyRate)
   {
       //do error checking here
 
       if(hoursAllocated >= 40)
       {
           return new FullTimeEmployee(hourlyRate);
       }else
       {
           return new PartTimeEmployee(hourlyRate);
       }
   }
 }
 