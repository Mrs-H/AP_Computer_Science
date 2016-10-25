
/**
 * Find the First Match - 
 * Create a 100 element int array that contains 
 * random numbers from 1 to 10. Using the Scanner 
 * class prompt the user to input a value 
 * from 1 to 10. Find the index of the first 
 * occurrence of the input value. 
 * Print out “X first appears at index NN.” 
 * where X is the input value and NN is the 
 * index where it first appears.
 */

import java.util.Scanner;

public class PR_05
{
    public static void main(String[] args)
    {
        //declare the array
        int[] arr = new int[100];
        
        //declare a scanner
        Scanner sc = new Scanner(System.in);
        
        //declare a variable to hold input value
        int input = 0;
        
        //Prompt the user for a value between 1 and 10
        System.out.println("Enter an integer value from 1 to 10: ");
        input = sc.nextInt();
        
        //fill the array with values
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10)+1;
            if (arr[i] == input)
            {
                System.out.println(input + " first appears at index " + i);
                i = arr.length + 1;
            }
            else if (i == arr.length-1)
            {
                System.out.println("Value not found");
            }
        }
    }
}

