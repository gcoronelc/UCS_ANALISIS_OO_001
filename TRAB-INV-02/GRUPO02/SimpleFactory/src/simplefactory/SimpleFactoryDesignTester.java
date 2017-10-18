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
public class SimpleFactoryDesignTester {
     public static void main(String args[])
    {
        Employee employee = EmployeeFactory.getEmployee(40, 25.0);
 
        System.out.println(employee.getHourlyRate());
 
        employee = EmployeeFactory.getEmployee(30, 15.45);
 
        System.out.println(employee.getHourlyRate());
    }
}
