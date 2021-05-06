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
public class EqualsHashCodeEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String a = "sai";  
    String b = "r";  
              
    if(a.equals(b)){    
    System.out.println("a & b are equal variables");
    System.out.println("hashvalues of a & b are:" + " "+ a.hashCode() + " & " + b.hashCode());  
    }
    String c =new String("Vinod");  
    String d =new String("Vinod");  
                 
    if(c.equals(d)){ 
    System.out.println("Answer11: Vinod Kumar Reddy Nellore");   
    System.out.println("c & d are equal variables");
    System.out.println("hashvalues of c & d are:" + " "+ c.hashCode() + " & " + d.hashCode());  
    }
            
    }  
}
        
    
    

