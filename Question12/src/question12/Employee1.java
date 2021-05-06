/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public class Employee1 implements Comparable<Employee1>
{

private int empId;
private String empName;
private double empSalary;
public Employee1(int empId,String empName, double empSalary)
{
  this.empId=empId;
  this.empName = empName;
  this.empSalary = empSalary;
}
public int getId()
{
return empId;
}
public String getName()
{
return empName;
}
public double getSalary()
{
return empSalary;
}

public String toString()
{
return empId+" "+empName+" "+empSalary;  
}

public int compareTo(Employee1 other)
{
return Integer.compare(this.empId,other.empId);
}
}
    

