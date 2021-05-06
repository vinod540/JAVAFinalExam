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
public class AbstractMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
      Shapes s=new rect();
      s.setShapes(4.0f,4.0f);
      float ar=s.findarea();
      System.out.println("Answer1a: Vinod Kumar Reddy Nellore");
      System.out.println("Area of the rectangle "+ar);
      s=new triangle();
      s.setShapes(5.0f,5.0f);
      float at=s.findarea();
      System.out.println("Area of triangle is "+at);
  
    }
    
}
