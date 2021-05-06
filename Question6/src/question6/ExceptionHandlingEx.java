/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;
import java.util.Scanner;

/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public class ExceptionHandlingEx {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
        // TODO code application logic here
int n1,n2,r;		
Scanner sc=new Scanner(System.in);
System.out.println("Answer6: Vinod Kumar Reddy Nellore");
System.out.println("Enter Number1:");
n1=sc.nextInt();
System.out.println("Enter Number2:");
n2=sc.nextInt();
try
{
 r=n1/n2;
 System.out.println("Division Result "+n1+" / "+n2+" = "+(n1/n2));
}
catch(ArithmeticException ee)
{
  System.out.println("Sorry n1 value is not divided by zero");
  System.out.println("Enter Number2:");
  n2=sc.nextInt();
  r=n1/n2;
  System.out.println("Division Result "+n1+" / "+n2+" = "+(n1/n2));

}
    
}
}
