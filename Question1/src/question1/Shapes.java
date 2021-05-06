/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Vinod Kumar Reddy  Nellore
 */
public abstract class Shapes 
{
  
float dim1,dim2;
void setShapes(float dim1,float dim2)
{
this.dim1=dim1;
this.dim2=dim2;
}
abstract float findarea();
}
class rect extends Shapes
{
float findarea()
{
return dim1*dim2;
}
}
class triangle extends Shapes
{
float findarea()
{
return 0.5f*dim1*dim2;
}   
}
