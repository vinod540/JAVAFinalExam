/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author S542412
 */
public class Recursion1 {

static int i=1;  
static void naturalnos(){    
if(i<=10){  
System.out.println(i);  
i++;
naturalnos();  
}  
}  
public static void main(String[] args) { 
System.out.println("Answer10: Vinod Kumar Reddy Nellore");   
System.out.println("The Natural Numbers from 1 to 10 are: ");  
naturalnos();
}  
}  
    