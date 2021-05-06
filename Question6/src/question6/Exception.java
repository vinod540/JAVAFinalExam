/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException,EOFException{
        // TODO code application logic here
        FileInputStream fis=new FileInputStream("sample.txt");
    }
    
}
