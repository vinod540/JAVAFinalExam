/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author Vinod kumar Reddy Nellore
 */
public class InfRecursion {

static int i=1;  
static void naturalnos(){    
System.out.println(i);  
i++;
naturalnos();  
}   
public static void main(String[] args) { 
System.out.println("Answer10: Vinod Kumar Reddy Nellore");    
System.out.println("The Numbers are: ");  
naturalnos();
}  
}  
    