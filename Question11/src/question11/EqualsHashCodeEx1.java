/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public class EqualsHashCodeEx1 {



public static void main(String[] args) {
	
    Employee e1 = new Employee();
    Employee e2 = new Employee();
 
    e1.setId(100);
    e2.setId(100);
        
    System.out.println("Answer11: Vinod Kumar Reddy Nellore");
    System.out.println("Is Both values are same? "+e1.equals(e2));   //comparing two objects are same. Values and hashcodes
          
 }  
}
    
    