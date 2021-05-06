/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public class ExceptionEx2 {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
int n1;			
try
{				
n1=Integer.parseInt(args[0]);
    
System.out.println("The Number is "+n1);
}
catch(NumberFormatException ee)
{
System.out.println("Please enter integer value");
}
catch(ArrayIndexOutOfBoundsException a)
{
System.out.println("Answer8: Vinod Kumar Reddy Nellore");    
System.out.println("Please enter one value");
}
    
}
}
