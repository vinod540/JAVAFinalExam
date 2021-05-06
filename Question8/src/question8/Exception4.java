/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author S542412
 */
class exceptione3
{
	
}

public class Exception4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
    try
	{
	  Class.forName("exceptione3");
	  //Class.forName("exceptione5");
	}
	  catch(ClassNotFoundException ex)
	  {
	    ex.printStackTrace();
	  }
	}
}

    

