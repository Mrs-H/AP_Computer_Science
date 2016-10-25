
/**
 * Compare Adjacent Values - 
 * Create a 15 element int array that contains 
 * random values from 5 to 40. 
 * Calculate the difference between the values 
 * of two adjacent elements. 
 * For example if a[1] = 5 and a[2] = 1 
 * the difference between the two elements 
 * would be 4. (Hint. use Math.abs() to calculate 
 * the difference as an absolute value.) 
 * Create a second array to store the values of 
 * the differences. Print out the original array 
 * and the array of differences.
 */

public class PR_09
{
    public static void main(String[] args)
    {
        //declare the arrays
        int[] arr = new int[15];
        int[] diff = new int[14];
        
        //fill arr with values
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = (int)(Math.random()*36)+5;
        }
        
        //fill arr with values
        for (int i=1; i<diff.length; i++)
        {
            diff[i-1] = Math.abs(arr[i]-arr[i-1]);
        }
        
        //print out the first element
        System.out.print(arr[0]);
        
        //print out the remaining array 
        //separated by "|"
        for (int i=1; i<arr.length; i++)
        {
            System.out.print("|" + arr[i]);
        }
        //print a line feed
        System.out.println();
        
        //print out the first element
        System.out.print(diff[0]);
        
        //print out the remaining array 
        //separated by "|"
        for (int i=1; i<diff.length; i++)
        {
            System.out.print("|" + diff[i]);
        }
    }
}
