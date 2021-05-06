/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public class EmployeeEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
    Employee1 e1 = new Employee1(4, "Rama", 34000.00);
    Employee1 e2 = new Employee1(1, "Sita", 30000.00);
    Employee1 e3 = new Employee1(3, "Siva", 31000.00);
    Employee1 e4 = new Employee1(2, "Durga", 25000.00);
 
    List<Employee1> employees = new ArrayList<Employee1>();
    employees.add(e2);
    employees.add(e3);
    employees.add(e1);
    employees.add(e4);
    System.out.println("Answer12: Vinod Kumar Reddy Nellore");
    System.out.println("Original List is: ");
    for (Employee1 e : employees)	           
    {
     System.out.println(e.toString());		       
    }
 
    Collections.sort(employees);
 
    System.out.println("to sort the list by its natural order (empId number): ");
    for (Employee1 e : employees)	           
    {
    System.out.println(e.toString());		       
    }
        
    System.out.println("to sort the list by its Salary: "); 
    Collections.sort(employees, new SalarySorter());
 
    for (Employee1 e : employees)	           
    {
    System.out.println(e.toString());		       
    }
     
    System.out.println("to sort the list by its Name: ");
    Collections.sort(employees, new NameSorter());
        
    for (Employee1 e : employees)	           
    {
    System.out.println(e.toString());		       
    }
    }  
}
