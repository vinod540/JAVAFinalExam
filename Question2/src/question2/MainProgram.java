/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     GeometricObject[] objs = {new Square(), new Square(),new Square(), new Square(), new Square()};
     for (int i = 0; i < objs.length; i++) {
     GeometricObject ob = objs[i];
     System.out.println("Answer2: Vinod Kumar Reddy Nellore");
     System.out.print("Object[" + i + "] ");
     if (ob instanceof Colorable) {
     Colorable colorable = (Colorable) ob;
     colorable.howToColor();
     Square s=(Square)objs[i];
     s.read();
     s.print();
    }
    }
}
}
   
    
    

