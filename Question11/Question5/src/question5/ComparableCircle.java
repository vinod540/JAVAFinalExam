/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author S542412
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>
{
public float getArea()
{
return PI*r*r;
}
@Override
public int compareTo(ComparableCircle obj1) 
{
		
if(getArea()>obj1.getArea())				
return 1;
else 
return -1;							
}   
}

