/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;
import java.util.Scanner;

/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public class ThrowEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    System.out.println("Answer9: Vinod Kumar Reddy Nellore");
    System.out.println("Enter Account Number");
    int acno=sc.nextInt();
    if(acno>0)
    System.out.println("Valid Account No");
    else
    {
    try {
    throw new ArithmeticException();
    }
    catch(ArithmeticException ae)
    {
    System.out.println("From Catch");
    System.out.println("Unable to Process");
    System.out.println("Invalid Account Number");
  
    }
    }
}
}
