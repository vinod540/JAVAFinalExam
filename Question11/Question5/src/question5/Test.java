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
public class Test {

/**
 * @param args the command line arguments
*/
public static void main(String[] args) {

ComparableCircle c1 = new ComparableCircle();
ComparableCircle c2 = new ComparableCircle();
		
c1.read();
c2.read();
			
if(c1.compareTo(c2) == 1)	
System.out.println("ComparableCircle1 is the larger of the two Circles");
else
System.out.println("ComparableCircle2 is the larger of the two Circles");
}

}
