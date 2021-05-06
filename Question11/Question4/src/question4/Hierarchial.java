/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Vinod kumar Reddy Nellore
 */
public class Hierarchial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Fruit fruit = new GoldenDelicious();
		Orange orange = new Orange();
        //Is fruit instanceof Fruit?
		if(fruit instanceof Fruit){ 
            System.out.println("Answer4: Vinod Kumar Reddy Nellore");
            System.out.println("Is fruit instanceof Fruit? "+(fruit instanceof Fruit));
        }else{
        	System.out.println("Is fruit instanceof Fruit? "+(fruit instanceof Fruit));
        }
        //Is fruit instanceof Orange?
        if(fruit instanceof Orange){ 
            System.out.println("Is fruit instanceof Orange? "+(fruit instanceof Orange));
        }else{
        	System.out.println("Is fruit instanceof Orange? "+(fruit instanceof Orange));
        }
        //Is fruit instanceof Apple?
        if(fruit instanceof Apple){ 
            System.out.println("Is fruit instanceof Apple? "+(fruit instanceof Apple));
        }else{
        	System.out.println("Is fruit instanceof Apple? "+(fruit instanceof Apple));
        }
        //Is fruit instanceof GoldenDelicious?
        if(fruit instanceof GoldenDelicious){ 
            System.out.println("Is fruit instanceof GoldenDelicious? "+(fruit instanceof GoldenDelicious));
        }else{
        	System.out.println("Is fruit instanceof GoldenDelicious? "+(fruit instanceof GoldenDelicious));
        }
        //Is fruit instanceof McIntosh?
        if(fruit instanceof McIntosh){ 
            System.out.println("Is fruit instanceof McIntosh? "+(fruit instanceof McIntosh));
        }else{
        	System.out.println("Is fruit instanceof McIntosh? "+(fruit instanceof McIntosh));
        }
        //Is orange instanceof Orange?
        if(orange instanceof Orange){ 
            System.out.println("Is orange instanceof Orange? "+(orange instanceof Orange));
        }else{
        	System.out.println("Is orange instanceof Orange? "+(orange instanceof Orange));
        }
        //Is orange instanceof Fruit?
        if(orange instanceof Fruit){ 
            System.out.println("Is orange instanceof Fruit? "+(orange instanceof Fruit));
        }else{
            System.out.println("Is orange instanceof Fruit? "+(orange instanceof Fruit));
        } 
        //Is orange instanceof Apple?
//        if(orange instanceof Apple){ 
//            System.out.println("Is orange instanceof Apple? "+(orange instanceof Apple));
//        }else{
//            System.out.println("Is orange instanceof Apple? "+(orange instanceof Apple));
//        }
        
        ((GoldenDelicious)fruit).makeAppleCider();
        
        	//orange.makeAppleCider();
        	//No. Apple and Orange class are siblings. with orange instance Apple class methods cannot be called. 
        
        orange.makeOrangeJuice();
        //fruit.makeOrangeJuice(); // No. Apple and Orange class are siblings. with fruit instance Orange class methods cannot be called.
        
        //Orange p = new Apple(); // No. Apple and Orange class are siblings. 
        
        //McIntosh p = new Apple(); //No. We can not assign base class instance to McIntosh class.
        Apple p = new McIntosh(); // Yes. We can assign McIntosh class instance to Apple class.         
	}

}


