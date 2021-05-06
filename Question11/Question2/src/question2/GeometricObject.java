/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Scanner;

/**
 *
 * @author Vinod Kumar Reddy Nellore 
 */
public class GeometricObject 
{
    
}
 
public class Square extends GeometricObject implements Colorable 
{

float s;
public void read()
{
System.out.println("Enter side of Square:");
Scanner sc=new Scanner(System.in);
s=sc.nextFloat();		
}
public void print()
{
System.out.println("Area of the square is "+s*s);
}
	
@Override
public void howToColor () {
System.out.println("Color all four sides");
}

}

