
/**
 * Count Matches - 
 * Create a 100 element int array that 
 * contains random numbers from 1 to 10. 
 * Using the Scanner class prompt the user 
 * to input a value from 1 to 10. 
 * Count how many times the input value occurs 
 * in the array. 
 * Print out “X occurs NN times in the array.” 
 * where X is the input value and 
 * NN is the number of times the value appears in the array. 
 * If the value does not appear in the array 
 * print out “Value not found.”
 */
import java.util.Scanner;

public class PR_04
{
    public static void main(String[] args)
    {
        //declare the array
        int[] arr = new int[100];
        
        //declare a scanner
        Scanner sc = new Scanner(System.in);
        
        //declare a variable to hold input value
        int input = 0;
        
        //declare a variable to hold the count
        int count = 0;
        
        //fill the array with values
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10)+1;
        }
        
        //Prompt the user for a value between 1 and 10
        System.out.println("Enter an integer value from 1 to 10: ");
        input = sc.nextInt();
        
        //search for the input value
        for (int i=1; i<arr.length; i++)
        {
            if (arr[i] == input)
            {
                count++;
            }
        }
        
        if (count == 0)
        {
            System.out.println("Value not found.");
        }
        else
        {
            System.out.println(input + " occurs " + count + " times in the array.");
        }
    }
}

