/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Vinod kumar Reddy Nellore
 */
class myLoginException extends RuntimeException
{
	myLoginException(String s)
	{
		super(s);
	}
}
public class ThrowEx1 {

	public static void main(String[] args) {
                String un = "vinod";
                String dv = "kumar";
                System.out.println("Answer9: Vinod Kumar Reddy Nellore");
		if(un.equals("Vinod")&& dv.equals("kumar"))
                        
			System.out.println("Login Success");
		else
		{
		  try
		   {
		     throw new myLoginException("Invalid User Name or Pass Word");
		   }
		   catch(myLoginException me)
		    {
		      System.out.println("Unable to continue \n"+me);
		    }
		}
	}

}
