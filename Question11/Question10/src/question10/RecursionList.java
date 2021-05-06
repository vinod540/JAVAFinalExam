/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;
import java.util.Scanner;

/**
 *
 * @author S542412
 */
public class RecursionList {

static int arr[] = new int[4];
static void read()
{
System.out.println("Answer10: Vinod kumar Reddy Nellore" );    
System.out.println("Enter an A array elements");
Scanner sc=new Scanner(System.in);
for(int i=0;i<arr.length;i++)
arr[i]=sc.nextInt();						
}
		
static int recSearch(int arr[], int l, int r, int x)
{
if (r < l)
return -1;
if (arr[l] == x)
return l;
if (arr[r] == x)
return r;
return recSearch(arr, l+1, r-1, x);
}
			
public static void main(String[] args)
{
int s;
read();
System.out.println("Enter searching element");
Scanner sc=new Scanner(System.in);
s=sc.nextInt();
				
int index = recSearch(arr, 0, arr.length-1, s);
if (index != -1)
System.out.println("Element " + s + " is present at index " +index);
else
System.out.println("Element " + s + " is not present");
}
}
    