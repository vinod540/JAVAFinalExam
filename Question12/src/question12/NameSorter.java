/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;
import java.util.Comparator;

/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public class NameSorter implements Comparator<Employee1>{ 
@Override
public int compare(Employee1 o1, Employee1 o2) {
return o1.getName().compareTo(o2.getName());
}
}    

