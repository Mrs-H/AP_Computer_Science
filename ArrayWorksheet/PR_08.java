/**
 * Find a Match, Strings -
 * Create a 7 element String array. 
 * Use the Scanner class to read in values to 
 * the array. Print out the array in the format 
 * described in question 01 above. Next, using 
 * the Scanner class prompt the user for a name. 
 * Find the index number of the first occurrence 
 * of the name. Print “name is located at NN.” 
 * where name is the name the user input and NN 
 * is the index number where the name occurred. 
 * If the name is not found print out 
 * “Sorry, no such name in directory.”
 */

import java.util.Scanner;

public class PR_08
{
    public static void main(String[] args)
    {
        //declare the array
        String[] arr = new String[7];
        
        //declare a Scanner
        Scanner sc = new Scanner(System.in);
        
        String input = "";
        
        //fill the array with values
        for (int i=0; i<arr.length; i++)
        {
            System.out.println("Enter a name:");
            arr[i] = sc.next();
        }
        
        System.out.println("Enter a name to search for:");
        input = sc.next();
        
        //print out the first element
        System.out.print(arr[0]);
        
        //print out the remaining array 
        //separated by "|"
        for (int i=1; i<arr.length; i++)
        {
            System.out.print("|" + arr[i]);
        }
        
        //add line feed
        System.out.println();
        
        //search for first occurance of name
        for (int i=0; i<arr.length; i++)
        {
            
            if (arr[i].equals(input))
            {
                System.out.println(input + "  appears at index " + i);
                i = arr.length + 1;
            }
            else if (i == arr.length-1)
            {
                System.out.println("Sorry, no such name in directory");
            }
        }
    }
}
        
   
