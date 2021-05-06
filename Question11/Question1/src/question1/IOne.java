/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public interface IOne {
default void read()
{
System.out.println("Anser1: Vinod kumar Reddy Nellore");    
System.out.println("This is default method in interface");
}
public static void print()
{
System.out.println("This is static method in interface");
}
void display();
}
