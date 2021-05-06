/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;
import java.util.Scanner;

/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public class RandomNos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double[] arr=new double[100];
    for(int i=0;i<arr.length;i++)
    arr[i]=Math.random();
    Scanner sc=new Scanner(System.in);
    System.out.println("Answer7: Vinod Kumar Reddy Nellore");  
    System.out.println("Enter an Index: ");
    int ind=sc.nextInt();
    if(ind<=100)
    System.out.println("Array["+ind+"] = "+arr[ind]);
    else
    System.out.println("Out of Bounds");

    }
    
}
